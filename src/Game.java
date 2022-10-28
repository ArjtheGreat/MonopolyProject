/*********************
 *
 * Author: Arjun Maitra and Elliott Duke
 * Assignment: Monopoly, Game Class
 * Date due: 10/26
 */
public class Game {
    CircularLinkedList<Player> players;
    CircularLinkedList<BoardSpace> gameBoard;

    //color reset
    public static final String RESET = "\u001B[0m";

    // Constructor
    public Game(CircularLinkedList<Player> players, CircularLinkedList<BoardSpace> gameBoard) {
        this.players = players;
        this.gameBoard = gameBoard;
    }

    // Accessors and Mutators
    public CircularLinkedList<Player> getPlayers() {
        return players;
    }
    public void setPlayers(CircularLinkedList<Player> players) {
        this.players = players;
    }

    public CircularLinkedList<BoardSpace> getGameBoard() {
        return gameBoard;
    }
    public void setGameBoard(CircularLinkedList<BoardSpace> gameBoard) {
        this.gameBoard = gameBoard;
    }

    // Gets the "x"th board space in the list
    public BoardSpace getBoardSpace(int x) {
        Link y = getGameBoard().first;
        while(x > 0) {
            y = y.nextLink;
            x--;
        }
        return (BoardSpace) y.t;
    }

    public int getNumOwnedRailRoads() {
        int num = 0;
        Link temp = gameBoard.first.nextLink;
        while(temp != gameBoard.first) {
            BoardSpace space = (BoardSpace) temp.t;
            if(space.getName().contains("Road")) {
                if(space.getOwner() != null) {
                    num++;
                }
            }
            temp = temp.nextLink;
        }
        return num;
    }

    // Mortgage Methods
    public void addMortgage(BoardSpace space, Player player){
        player.setBalance(player.getBalance()+space.getCost());
        space.setHasBeenMortgaged(true);
    }
    public void removedMortgage(BoardSpace space, Player player){
        player.setBalance(player.getBalance() - (int)1.1*space.getCost());
        space.setHasBeenMortgaged(false);
    }

    public String makePrintString(BoardSpace currentSpace) {
        String playString = "";
        Player[] plays = currentSpace.getCurrentPlayers();

        for (int i = 0; i < plays.length; i++) {
//            if(plays[i]!=null){
//                playString += plays[i].toString();
//            }
        }
        if (playString.length() < 16) {
            playString = playString + currentSpace.firstTwoChars();
        }
        if(plays[0]!=null){
            for (int i = playString.length(); i <= 5; i++) {
                playString += " ";
            }
        }
        else {
            for (int i = playString.length(); i <= 5; i++) {
                playString += " ";

            }
        }
        String lineSpace = "";
        if(currentSpace.owner!=null){
            lineSpace = "|"+currentSpace.owner.colorName+playString+RESET;
        }
        else{
            lineSpace = "|"+currentSpace.getColorStr()+playString+RESET;
        }

        return lineSpace;
    }


    public void printBoard(Player currentPlayer){
        //initialize dividers and spaces
        char side = '|';
        String blankSpace = "                                                              ";
        String halfBlank = "                           ";
        String capDivider = "------------------------------------------------------------------------------";
        String lineDivider = "|------|";

        //initialize height and width of window and lineStr
        int height = 11;
        int width = 11;

        Link currentLink = gameBoard.first;
        Link lastLink = gameBoard.first.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink;
        BoardSpace currentSpace = gameBoard.t;
        String lineSpace1 = makePrintString(currentSpace);
        String lineSpace2 = makePrintString(currentSpace);
        //for each row in the window, print what should be on that row in a battle, depending on what row its on
        System.out.println(capDivider);
        for (int r = 0; r < height; r++) {
            if (r == 0) {
                for(int c = 0;c<width;c++){
                    System.out.print(lineSpace1);
                    currentLink = currentLink.nextLink;
                    BoardSpace x = (BoardSpace) currentLink.t;
                    lineSpace1 = makePrintString(x);
                }
                System.out.println('|');
                System.out.println(capDivider);

            }
            else if (r == 1) {
                BoardSpace y = (BoardSpace) lastLink.t;
                lineSpace2 = makePrintString(y);
                System.out.println(lineSpace2+side+blankSpace+lineSpace1+side);
                System.out.println(lineDivider + blankSpace + lineDivider);
                currentLink = currentLink.nextLink;
                lastLink = gameBoard.first.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace1 = makePrintString(x);
            }
            else if (r == 2) {
                BoardSpace y = (BoardSpace) lastLink.t;
                lineSpace2 = makePrintString(y);
                System.out.println(lineSpace2+side+blankSpace+lineSpace1+side);
                System.out.println(lineDivider + blankSpace + lineDivider);
                currentLink = currentLink.nextLink;
                lastLink = gameBoard.first.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace1 = makePrintString(x);
            }
            else if (r == 3) {
                BoardSpace y = (BoardSpace) lastLink.t;
                lineSpace2 = makePrintString(y);
                System.out.println(lineSpace2+side+blankSpace+lineSpace1+side);
                System.out.println(lineDivider + blankSpace + lineDivider);
                currentLink = currentLink.nextLink;
                lastLink = gameBoard.first.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace1 = makePrintString(x);
            }
            else if (r == 4) {
                BoardSpace y = (BoardSpace) lastLink.t;
                lineSpace2 = makePrintString(y);
                System.out.println(lineSpace2+side+blankSpace+lineSpace1+side);
                System.out.println(lineDivider + blankSpace + lineDivider);
                currentLink = currentLink.nextLink;
                lastLink = gameBoard.first.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace1 = makePrintString(x);
            }
            else if (r == 5) {
                BoardSpace y = (BoardSpace) lastLink.t;
                lineSpace2 = makePrintString(y);
                System.out.println(lineSpace2+side+halfBlank+"MONOPOLY"+halfBlank+lineSpace1+side);
                System.out.println(lineDivider + blankSpace + lineDivider);
                currentLink = currentLink.nextLink;
                lastLink = gameBoard.first.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace1 = makePrintString(x);
            }
            else if (r == 6) {
                BoardSpace y = (BoardSpace) lastLink.t;
                lineSpace2 = makePrintString(y);
                System.out.println(lineSpace2+side+blankSpace+lineSpace1+side);
                System.out.println(lineDivider + blankSpace + lineDivider);
                currentLink = currentLink.nextLink;
                lastLink = gameBoard.first.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace1 = makePrintString(x);
            }
            else if (r == 7) {
                BoardSpace y = (BoardSpace) lastLink.t;
                lineSpace2 = makePrintString(y);
                System.out.println(lineSpace2+side+blankSpace+lineSpace1+side);
                System.out.println(lineDivider + blankSpace + lineDivider);
                currentLink = currentLink.nextLink;
                lastLink = gameBoard.first.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace1 = makePrintString(x);
            }
            else if (r == 8) {
                BoardSpace y = (BoardSpace) lastLink.t;
                lineSpace2 = makePrintString(y);
                System.out.println(lineSpace2+side+blankSpace+lineSpace1+side);
                System.out.println(lineDivider + blankSpace + lineDivider);
                currentLink = currentLink.nextLink;
                lastLink = gameBoard.first.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace1 = makePrintString(x);
            }
            else if (r == 9) {
                BoardSpace y = (BoardSpace) lastLink.t;
                lineSpace2 = makePrintString(y);
                System.out.println(lineSpace2+side+blankSpace+lineSpace1+side);
                currentLink = currentLink.nextLink;
                lastLink = gameBoard.first.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace1 = makePrintString(x);
            }
            else if (r == 10) {
                System.out.println(capDivider);
                for(int c = 0;c<width;c++){
                    System.out.print(lineSpace1);
                    currentLink = currentLink.nextLink;
                    BoardSpace x = (BoardSpace) currentLink.t;
                    lineSpace1 = makePrintString(x);
                }
                System.out.println('|');
                currentLink = currentLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace1 = makePrintString(x);
            }
            else {
                System.out.println(lineSpace1+side+blankSpace+lineSpace1+side);
                System.out.println(lineDivider + blankSpace + lineDivider);
                currentLink = currentLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace1 = makePrintString(x);
            }
        }

        //print the bottom divider
        System.out.println(capDivider);

    }

}
