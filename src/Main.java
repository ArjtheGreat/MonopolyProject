/*********************
 *
 * Author: Arjun Maitra and Elliot Duke
 * Assignment: Monopoly, Main Class
 * Date due: 10/26
 */
public class Main {
    public static void main(String[] args) {
        BoardSpace[] properties1 = new BoardSpace[28];

        Player player = new Player(1500, properties1, 'A', false);
        Player player2 = new Player(1500, properties1, 'B', false);
        CircularLinkedList<Player> players = new CircularLinkedList<Player>(player);
        players.insertFirst(player);
        players.insertFirst(player2);


        BoardSpace go = new BoardSpace(null, 0, 0, "Go", false);
        CircularLinkedList<BoardSpace> gameBoard = new CircularLinkedList<>(go);
        gameBoard.insertFirst(go);

        Game game = new Game(players, gameBoard);
    }
}
