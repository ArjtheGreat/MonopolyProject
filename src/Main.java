import java.util.Random;
import java.util.Scanner;

/*********************
 *
 * Author: Arjun Maitra and Elliot Duke
 * Assignment: Monopoly, Main Class
 * Date due: 10/26
 */
public class Main {
    public static void main(String[] args) {

        // Players Set up
        CircularLinkedList<Player> players = getPlayers();
        System.out.println(players);

        // Board Set up
        BoardSpace go = new BoardSpace(null, 0, 0, "Go", false);
        CircularLinkedList<BoardSpace> gameBoard = new CircularLinkedList<>(go);
        gameBoard.insertFirst(go);

        // Game setup
        Game game = new Game(players, gameBoard);

        while(true) {
            Player currentPlayer = (Player) players.first.t;
            turn(currentPlayer);
            players.first = players.first.nextLink;

            Scanner in = new Scanner(System.in);
            System.out.println("Is the game over?");
            if(in.nextLine().equals("y")) {
                System.exit(0);
            }
        }
    }

    // Prompts User For Players
    public static CircularLinkedList<Player> getPlayers() {

        // The Players Linked List
        CircularLinkedList<Player> players = new CircularLinkedList<Player>(new Player(0, null, 'A', false));

        // Keeps Tracks of # of players so they have at least 2 and dont go over 6
        int numPlayers = 1;
        Scanner in = new Scanner(System.in);
        while(true) {

            // Create New Player
            System.out.println("Player " + numPlayers + " character: ");
            char icon = in.nextLine().toCharArray()[0];
            BoardSpace[] properties = new BoardSpace[28];
            Player player = new Player(1500, properties, icon, false);
            player.setCurrentSpace(0);
            players.insertFirst(player);
            numPlayers++;

            // How many players do you want
            if(numPlayers > 2) {
                System.out.println("Are all Players in (y/n)?");
                if(in.nextLine().equals("y")) {
                    break;
                }
            }

            // only can have 6 players
            if(numPlayers > 6) {
                break;
            }
        }
        return players;
    }

    // Runs A Turn
    public static void turn(Player player) {
        int max = 6;
        int min = 1;
        int diceRoll = (int)Math.floor(Math.random()*(max-min+1)+min);
        int diceRoll2 = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(player.getIcon() + ", you rolled a " + (diceRoll) + " and a " + diceRoll2);
        if(diceRoll == diceRoll2) {
            System.out.println("Wow, double roll! Extra Turn Time!");
        }
        player.setCurrentSpace(player.getCurrentSpace() + (diceRoll+diceRoll2));
    }

    // Moves player
    public static void move(Player player, Game game) {
        for(int i = 0; i <game.getBoardSpace(player.getCurrentSpace()).getCurrentPlayers().length; i++) {
            if(game.getBoardSpace(player.getCurrentSpace()).getCurrentPlayers()[i] == null) {
                game.getBoardSpace(player.getCurrentSpace()).getCurrentPlayers()[i] = player;
                break;
            }
        }

    }
}
