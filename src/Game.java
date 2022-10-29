/*********************
 *
 * Author: Arjun Maitra and Elliott Duke
 * Assignment: Monopoly, Game Class
 * Date due: 10/26
 */

// Code by Elliott
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
            x--; // will find the xth element since we do .nextLink from first x times
        }
        return (BoardSpace) y.t;
    }

    // Find Number of Owned Railroads
    public int getNumOwnedRailRoads(Player player) {
        int num = 0;
        Link temp = gameBoard.first.nextLink;
        while(temp != gameBoard.first) {
            BoardSpace space = (BoardSpace) temp.t;
            if(space.getName().contains("Road")) { // This finds all railroads
                if(space.getOwner().equals(player)) { // Checks how many player owns
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

    //puts together the string to be printed for every board space
    public String makePrintString(BoardSpace currentSpace, Player player) {

        // Text color
        String ANSI_RED = "\u001B[31m";

        //string to be added to
        String playString = "";
        //array of the players on the current space
        Player[] plays = currentSpace.getCurrentPlayers();

        //for each player on the space, add their character to the space string
        for (int i = 0; i < plays.length; i++) {
//            if(plays[i]!=null){
//                playString += plays[i].toString();
//            }
        }
        //if there's room, add the board space's name to the string too
        if (playString.length() < 5) {
            playString = playString + currentSpace.firstTwoChars();
        }
        //add the proper number of spaces on to the end of the space string
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
        //if the space is owned, color it the correct color according to its owner (if its not, make it white)
        if(currentSpace.owner!=null){
            if(getBoardSpace(player.getCurrentSpace()).equals(currentSpace)) {
                lineSpace = "|"+currentSpace.owner.colorName+ANSI_RED+playString+RESET;
            }
            else {
                lineSpace = "|"+currentSpace.owner.colorName+playString+RESET;
            }
        }
        else{
            if(getBoardSpace(player.getCurrentSpace()).equals(currentSpace)) {
                lineSpace = "|"+ANSI_RED+playString+RESET;
            }
            else {
                lineSpace = "|" + currentSpace.getColorStr() + playString + RESET;
            }
        }
        //return the print string
        return lineSpace;
    }

    public void printBoard(Player player){
        //initialize dividers and spaces
        char side = '|';
        String blankSpace = "                                                              ";
        String halfBlank = "                           ";
        String capDivider = "------------------------------------------------------------------------------";
        String lineDivider = "|------|";



        //initialize height and width of window and lineStr
        int height = 11;
        int width = 11;

        //initialize first/current links/spaces
        Link currentLink = gameBoard.first;
        BoardSpace currentSpace = gameBoard.t;
        String lineSpace1 = makePrintString(currentSpace, player);
        String lineSpace2 = makePrintString(currentSpace, player);
        //for each row in the window, print what should be on that row in a battle, depending on what row its on
        System.out.println(capDivider);
        int colNum = 38;
        for (int r = 0; r < height; r++) {
            if (r == 0) {
                for(int c = 0;c<width;c++){
                    System.out.print(lineSpace1);
                    currentLink = currentLink.nextLink;
                    BoardSpace x = (BoardSpace) currentLink.t;
                    lineSpace1 = makePrintString(x, player);
                }
                System.out.println('|');
                System.out.println(capDivider);
            }
            //if we're on row 5, print MONOPOLY in the middle of the line with the correct spacing
            else if (r == 5) {
                BoardSpace y = getBoardSpace(34);
                lineSpace2 = makePrintString(y, player);
                System.out.println(lineSpace2+side+halfBlank+"MONOPOLY"+halfBlank+lineSpace1+side);
                System.out.println(lineDivider + blankSpace + lineDivider);
                currentLink = currentLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace1 = makePrintString(x, player);
                colNum--;
            }
            //if we're on row 10, print the correct board spaces backward
            else if (r == 10) {
                colNum = 29;
                System.out.println(capDivider);
                for(int c = 0;c<width;c++){
                    BoardSpace x = getBoardSpace(colNum);
                    lineSpace1 = makePrintString(x, player);
                    System.out.print(lineSpace1);
                    colNum--;
                }
                System.out.println('|');
                currentLink = currentLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace1 = makePrintString(x, player);
            }
            //otherwise, print the proper spaces in order
            else {
                BoardSpace y = getBoardSpace(colNum);
                lineSpace2 = makePrintString(y, player);
                System.out.println(lineSpace2+side+blankSpace+lineSpace1+side);
                if(r!=9){
                    System.out.println(lineDivider + blankSpace + lineDivider);
                }
                currentLink = currentLink.nextLink;
                BoardSpace x = (BoardSpace) currentLink.t;
                lineSpace1 = makePrintString(x, player);
                colNum--;
            }
        }
        //print the bottom divider
        System.out.println(capDivider);
    }

}
