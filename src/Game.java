/*********************
 *
 * Author: Arjun Maitra and Elliott Duke
 * Assignment: Monopoly, Game Class
 * Date due: 10/26
 */
public class Game {
    CircularLinkedList<Player> players;
    CircularLinkedList<BoardSpace> gameBoard;

    //colors
    public static final String RESET = "\u001B[0m";
    public static final String RED = "\033[0;31m";     // RED
    public static final String GREEN = "\033[0;32m";   // GREEN
    public static final String YELLOW = "\033[0;33m";  // YELLOW
    public static final String BLUE = "\033[0;34m";    // BLUE

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
        while(x > -1) {
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

    public String makePrintString(BoardSpace currentSpace) {
        String playString = "";
        Player[] plays = currentSpace.getCurrentPlayers();

            for (int i = 0; i < plays.length; i++) {
                if(plays[i]!=null){
                    //plays[i].getColor()
                    playString += plays[i].toString();
                }
            }
            if (playString.length() < 4) {
                playString = playString + currentSpace.firstTwoChars();
            }
            for (int i = playString.length(); i <= 5; i++) {
                playString += " ";
            }

        String lineSpace = "|"+playString;
        return lineSpace;
    }

    public void printBoard(){
        /*
        String str = RED+"ggggg"+RESET;
        str += " ";
        str = str+YELLOW+"hhhhh"+RESET;
        System.out.print(str);

        */

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
        BoardSpace currentSpace = gameBoard.t;
        String lineSpace = makePrintString(currentSpace);
        //for each row in the window, print what should be on that row in a battle, depending on what row its on
        System.out.println(capDivider);
        for (int r = 0; r < height; r++) {
            if (r == 0) {
                for(int c = 0;c<width;c++){
                    System.out.print(lineSpace);
                    currentLink = currentLink.nextLink;
                    BoardSpace x = (BoardSpace) currentLink.t;
                    lineSpace = makePrintString(x);
                }
                System.out.println('|');
                System.out.println(capDivider);

            }
            else if (r == 5) {
                System.out.println(lineSpace+side+halfBlank+"MONOPOLY"+halfBlank+lineSpace+side);
                System.out.println(lineDivider + blankSpace + lineDivider);
                currentLink = currentLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace = makePrintString(x);
            }
            else if (r == 10) {
                System.out.println(capDivider);
                for(int c = 0;c<width;c++){
                    System.out.print(lineSpace);
                }
                System.out.println('|');
                currentLink = currentLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace = makePrintString(x);
            }
            else {
                System.out.println(lineSpace+side+blankSpace+lineSpace+side);
                System.out.println(lineDivider + blankSpace + lineDivider);
                currentLink = currentLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace = makePrintString(x);
            }
        }

        //print the bottom divider
        System.out.println(capDivider);

    }

}
