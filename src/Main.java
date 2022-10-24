import java.util.ArrayList;
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

        BoardSpace communityChest = new BoardSpace(null, 0, 0, "Community Chest", false);

        BoardSpace MediterraneanAvenue = new BoardSpace(null, 60, 2, "Mediterranean Avenue", true );

        BoardSpace balticAvenue = new BoardSpace(null, 60, 4, "Baltic Avenue", true);

        BoardSpace incomeTax = new BoardSpace(null, 0, 0, "Income Tax", false);

        BoardSpace readingRailroad = new BoardSpace(null, 200, 25, "Reading Railroad", true);

        BoardSpace orientalAvenue = new BoardSpace(null, 100, 4, "Oriental Avenue", true);

        BoardSpace chance = new BoardSpace(null, 0, 0, "Chance", false);

        BoardSpace vermontAvenue = new BoardSpace(null, 100, 6, "Vermont Avenue", true);

        BoardSpace connecticutAvenue = new BoardSpace(null, 120, 8, "Connecticut Avenue", true);

        BoardSpace jail = new BoardSpace(null, 0, 0, "Jail / Just Visiting", false);

        BoardSpace stCharlesPlace = new BoardSpace(null, 140, 10, "St. Charles Place", true);

        BoardSpace electricCompany = new BoardSpace(null, 150, 4, "Electric Company", true);

        BoardSpace statesAvenue = new BoardSpace(null, 140, 10, "States Avenue", true);

        BoardSpace virginiaAvenue = new BoardSpace(null, 160, 12, "Virginia Avenue", true);

        BoardSpace pennsylvaniaRailroad = new BoardSpace(null, 200, 25, "Pennsylvania Railroad", true);

        BoardSpace stJamesPlace = new BoardSpace(null, 180, 14, "St. James Place", true);

        BoardSpace communityChestTwo = new BoardSpace(null, 0, 0, "Community Chest", false);

        BoardSpace tennesseeAvenue = new BoardSpace(null, 180, 14, "Tennessee Avenue", true);

        BoardSpace newYorkAvenue = new BoardSpace(null, 200, 16, "New York Avenue", true);

        BoardSpace freeParking = new BoardSpace(null, 0, 0, "Free Parking", false);

        BoardSpace kentuckyAvenue = new BoardSpace(null, 220, 18, "Kentucky Avenue", true);

        BoardSpace chanceTwo = new BoardSpace(null, 0, 0, "Chance", false);

        BoardSpace indianaAvenue = new BoardSpace(null, 220, 18, "Indiana Avenue", true);

        BoardSpace illinoisAvenue = new BoardSpace(null, 240, 20, "Illinois Avenue", true);

        BoardSpace bandoRailroad = new BoardSpace(null, 200, 25, "B. & O. Railroad", true);

        BoardSpace atlanticAvenue = new BoardSpace(null, 260, 22, "Atlantic Avenue", true);

        BoardSpace ventnorAvenue = new BoardSpace(null, 260, 22, "Ventnor Avenue", true);

        BoardSpace waterWorks = new BoardSpace(null, 150, 4, "Water Works", true);

        BoardSpace marvinGardens = new BoardSpace(null, 280, 24, "Marvin Gardens", true);

        BoardSpace gotojail = new BoardSpace(null, 0, 0, "Go To Jail", false);

        BoardSpace pacificAvenue = new BoardSpace(null, 300, 26, "Pacific Avenue", true);

        BoardSpace northCarolinaAvenue = new BoardSpace(null, 300, 26, "North Carolina Avenue", true);

        BoardSpace communityChestThree = new BoardSpace(null, 0, 0, "Community Chest", false);

        BoardSpace pennsylvaniaAvenue = new BoardSpace(null, 320, 28, "Pennsylvania Avenue", true);

        BoardSpace shortLine = new BoardSpace(null, 200, 26, "Short Line", true);

        BoardSpace chanceThree = new BoardSpace(null, 0, 0, "Chance", false);

        BoardSpace parkPlace = new BoardSpace(null, 350, 35, "Park Place", true);

        BoardSpace luxuryTax = new BoardSpace(null, 0, 0, "Luxury Tax", false);

        BoardSpace boardwalk = new BoardSpace(null, 400, 50, "Boardwalk", true);

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

        ArrayList<BoardSpace> storage = new ArrayList<>();

        storage.add(go);

        storage.add(communityChest);

        storage.add(balticAvenue);

        storage.add(incomeTax);

        storage.add(readingRailroad);

        storage.add(orientalAvenue);

        storage.add(chance);

        storage.add(vermontAvenue);

        storage.add(connecticutAvenue);

        storage.add(jail);

        storage.add(stCharlesPlace);

        storage.add(electricCompany);

        storage.add(statesAvenue);

        storage.add(virginiaAvenue);

        storage.add(pennsylvaniaRailroad);

        storage.add(stJamesPlace);

        storage.add(communityChestTwo);

        storage.add(tennesseeAvenue);

        storage.add(newYorkAvenue);

        storage.add(freeParking);

        storage.add(kentuckyAvenue);

        storage.add(chanceTwo);

        storage.add(indianaAvenue);

        storage.add(illinoisAvenue);

        storage.add(bandoRailroad);

        storage.add(atlanticAvenue);

        storage.add(ventnorAvenue);

        storage.add(waterWorks);

        storage.add(marvinGardens);

        storage.add(gotojail);

        storage.add(pacificAvenue);

        storage.add(northCarolinaAvenue);

        storage.add(communityChestThree);

        storage.add(pennsylvaniaAvenue);

        storage.add(shortLine);

        storage.add(chanceThree);

        storage.add(parkPlace);

        storage.add(luxuryTax);

        storage.add(boardwalk);

        System.out.println(gameBoard);


        // Game setup
        Game game = new Game(players, gameBoard);

        while(true) {
            Player currentPlayer = (Player) players.first.t;
            turn(currentPlayer, storage);
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
    public static void turn(Player player, ArrayList<BoardSpace> storage) {
        int max = 6;
        int min = 1;
        int diceRoll = (int)Math.floor(Math.random()*(max-min+1)+min);
        int diceRoll2 = (int)Math.floor(Math.random()*(max-min+1)+min);
        System.out.println(player.getIcon() + ", you rolled a " + (diceRoll) + " and a " + diceRoll2 + ". You were on " + storage.get(player.getCurrentSpace()));
        if(diceRoll == diceRoll2) {
            System.out.println("Wow, double roll! Extra Turn Time!");
        }
        player.setCurrentSpace(player.getCurrentSpace() + (diceRoll+diceRoll2));
        System.out.println("Now " + player.getIcon() +  " is on " + storage.get(player.getCurrentSpace()));
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
