/*********************
 *
 * Author: Arjun Maitra and Elliott Duke
 * Assignment: Monopoly, Game Class
 * Date due: 10/26
 */
public class Game {
    CircularLinkedList<Player> players;
    CircularLinkedList<BoardSpace> gameBoard;

    public Game(CircularLinkedList<Player> players, CircularLinkedList<BoardSpace> gameBoard) {
        this.players = players;
        this.gameBoard = gameBoard;
    }

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

    public BoardSpace getBoardSpace(int x) {
        Link y = getGameBoard().first;
        while(x > -1) {
            y = y.nextLink;
            x--;
        }
        return (BoardSpace) y.t;
    }

    public void printBoard(){
        //initialize dividers and spaces
        char side = '|';
        String blankSpace = "                                            ";
        String halfBlank = "                  ";
        String capDivider = "--------------------------------------------------------";
        String lineDivider = "|----|";

        //initialize height and width of window and lineStr
        int height = 11;
        int width = 11;

        Link currentLink = gameBoard.first;
        BoardSpace currentSpace = gameBoard.t;
        String lineSpace = "| "+currentSpace.toString()+" ";
        //for each row in the window, print what should be on that row in a battle, depending on what row its on
        System.out.println(capDivider);
        for (int r = 0; r < height; r++) {
            if (r == 0) {
                for(int c = 0;c<width;c++){
                    System.out.print(lineSpace);
                    currentLink = currentLink.nextLink;
                    lineSpace = "| "+currentLink.t.toString()+" ";
                }
                System.out.println('|');
                System.out.println(capDivider);

            }
            else if (r == 5) {
                System.out.println(lineSpace+side+halfBlank+"MONOPOLY"+halfBlank+lineSpace+side);
                System.out.println(lineDivider + blankSpace + lineDivider);
                currentLink = currentLink.nextLink;
                lineSpace = "| "+currentLink.t.toString()+" ";
            }
            else if (r == 10) {
                System.out.println(capDivider);
                for(int c = 0;c<width;c++){
                    System.out.print(lineSpace);
                }
                System.out.println('|');
                currentLink = currentLink.nextLink;
                lineSpace = "| "+currentLink.t.toString()+" ";
            }
            else {
                System.out.println(lineSpace+side+blankSpace+lineSpace+side);
                System.out.println(lineDivider + blankSpace + lineDivider);
                currentLink = currentLink.nextLink;
                lineSpace = "| "+currentLink.t.toString()+" ";
            }
        }

        //print the bottom divider
        System.out.println(capDivider);

    }

}
