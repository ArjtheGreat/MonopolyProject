/*********************
 *
 * Author: Arjun Maitra and Elliot Duke
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

    public BoardSpace getBoardSpace(int x) {
        Link y = getGameBoard().first;
        while(x > -1) {
            y = y.nextLink;
            x--;
        }
        return (BoardSpace) y.t;
    }

    public void setGameBoard(CircularLinkedList<BoardSpace> gameBoard) {
        this.gameBoard = gameBoard;
    }
}