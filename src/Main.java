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

        // Board Set     up
        BoardSpace go = new BoardSpace(null, 0, 0, "Go", false);


        CircularLinkedList<BoardSpace> gameBoard = new CircularLinkedList<>(go);
        BoardSpace MediterraneanAvenue = new BoardSpace(null, 0, 0, "Mediterranean Avenue", false);

        BoardSpace communityChest = new BoardSpace(null, 0, 0, "Community Chest", false);

        BoardSpace balticAvenue = new BoardSpace(null, 0, 0, "Baltic Avenue", false);

        BoardSpace incomeTax = new BoardSpace(null, 0, 0, "Income Tax", false);

        BoardSpace readingRailroad = new BoardSpace(null, 0, 0, "Reading Railroad", false);

        BoardSpace orientalAvenue = new BoardSpace(null, 0, 0, "Oriental Avenue", false);

        BoardSpace chance = new BoardSpace(null, 0, 0, "Chance", false);

        BoardSpace vermontAvenue = new BoardSpace(null, 0, 0, "Vermont Avenue", false);

        BoardSpace connecticutAvenue = new BoardSpace(null, 0, 0, "Connecticut Avenue", false);

        BoardSpace jail = new BoardSpace(null, 0, 0, "Jail / Just Visiting", false);

        BoardSpace stCharlesPlace = new BoardSpace(null, 0, 0, "St. Charles Place", false);

        BoardSpace electricCompany = new BoardSpace(null, 0, 0, "Electric Company", false);

        BoardSpace statesAvenue = new BoardSpace(null, 0, 0, "States Avenue", false);

        BoardSpace virginiaAvenue = new BoardSpace(null, 0, 0, "Virginia Avenue", false);

        BoardSpace pennsylvaniaRailroad = new BoardSpace(null, 0, 0, "Pennsylvania Railroad", false);

        BoardSpace stJamesPlace = new BoardSpace(null, 0, 0, "St. James Place", false);

        BoardSpace communityChestTwo = new BoardSpace(null, 0, 0, "Community Chest", false);

        BoardSpace tennesseeAvenue = new BoardSpace(null, 0, 0, "Tennessee Avenue", false);

        BoardSpace newYorkAvenue = new BoardSpace(null, 0, 0, "New York Avenue", false);

        BoardSpace freeParking = new BoardSpace(null, 0, 0, "Free Parking", false);

        BoardSpace kentuckyAvenue = new BoardSpace(null, 0, 0, "Kentucky Avenue", false);

        BoardSpace chanceTwo = new BoardSpace(null, 0, 0, "Chance", false);

        BoardSpace indianaAvenue = new BoardSpace(null, 0, 0, "Indiana Avenue", false);

        BoardSpace illinoisAvenue = new BoardSpace(null, 0, 0, "Illinois Avenue", false);

        BoardSpace bandoRailroad = new BoardSpace(null, 0, 0, "B. & O. Railroad", false);

        BoardSpace atlanticAvenue = new BoardSpace(null, 0, 0, "Atlantic Avenue", false);

        BoardSpace ventnorAvenue = new BoardSpace(null, 0, 0, "Ventnor Avenue", false);

        BoardSpace waterWorks = new BoardSpace(null, 0, 0, "Water Works", false);

        BoardSpace marvinGardens = new BoardSpace(null, 0, 0, "Marvin Gardens", false);

        BoardSpace gotojail = new BoardSpace(null, 0, 0, "Go To Jail", false);

        BoardSpace pacificAvenue = new BoardSpace(null, 0, 0, "Pacific Avenue", false);

        BoardSpace northCarolinaAvenue = new BoardSpace(null, 0, 0, "North Carolina Avenue", false);

        BoardSpace communityChestThree = new BoardSpace(null, 0, 0, "Community Chest", false);

        BoardSpace pennsylvaniaAvenue = new BoardSpace(null, 0, 0, "Pennsylvania Avenue", false);

        BoardSpace shortLine = new BoardSpace(null, 0, 0, "Short Line", false);

        BoardSpace chanceThree = new BoardSpace(null, 0, 0, "Chance", false);

        BoardSpace parkPlace = new BoardSpace(null, 0, 0, "Park Place", false);

        BoardSpace luxuryTax = new BoardSpace(null, 0, 0, "Luxury Tax", false);

        BoardSpace boardwalk = new BoardSpace(null, 0, 0, "Boardwalk", false);

        gameBoard.insertFirst(boardwalk);

        gameBoard.insertFirst(luxuryTax);

        gameBoard.insertFirst(parkPlace);

        gameBoard.insertFirst(chanceThree);

        gameBoard.insertFirst(shortLine);

        gameBoard.insertFirst(pennsylvaniaAvenue);

        gameBoard.insertFirst(communityChestThree);

        gameBoard.insertFirst(northCarolinaAvenue);

        gameBoard.insertFirst(pacificAvenue);

        gameBoard.insertFirst(gotojail);

        gameBoard.insertFirst(marvinGardens);

        gameBoard.insertFirst(waterWorks);

        gameBoard.insertFirst(ventnorAvenue);

        gameBoard.insertFirst(atlanticAvenue);

        gameBoard.insertFirst(bandoRailroad);

        gameBoard.insertFirst(illinoisAvenue);

        gameBoard.insertFirst(indianaAvenue);

        gameBoard.insertFirst(chanceTwo);

        gameBoard.insertFirst(kentuckyAvenue);

        gameBoard.insertFirst(freeParking);

        gameBoard.insertFirst(newYorkAvenue);

        gameBoard.insertFirst(tennesseeAvenue);

        gameBoard.insertFirst(communityChestTwo);

        gameBoard.insertFirst(stJamesPlace);

        gameBoard.insertFirst(pennsylvaniaRailroad);

        gameBoard.insertFirst(virginiaAvenue);

        gameBoard.insertFirst(statesAvenue);

        gameBoard.insertFirst(electricCompany);

        gameBoard.insertFirst(stCharlesPlace);

        gameBoard.insertFirst(jail);

        gameBoard.insertFirst(connecticutAvenue);

        gameBoard.insertFirst(vermontAvenue);

        gameBoard.insertFirst(chance);

        gameBoard.insertFirst(orientalAvenue);

        gameBoard.insertFirst(readingRailroad);

        gameBoard.insertFirst(incomeTax);

        gameBoard.insertFirst(balticAvenue);

        gameBoard.insertFirst(communityChest);

        gameBoard.insertFirst(go);

        System.out.println(gameBoard);


        // Game setup
        Game game = new Game(players, gameBoard);

        while(true) {
            Player currentPlayer = (Player) players.first.t;
            turn(currentPlayer);
            move(currentPlayer, game);
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
