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

    // This is used for water works and electric company
    static int lastDiceRoll;
    public static void main(String[] args) {

        // Players Set up
        CircularLinkedList<Player> players = getPlayers();
        System.out.println("Hello, " + players);

        // Board Set     up
        BoardSpace go = new BoardSpace(null, 0, 0, "Go", false);


        CircularLinkedList<BoardSpace> gameBoard = new CircularLinkedList<>(go);

        BoardSpace communityChest = new BoardSpace(null, 0, 0, "Community Chest", false);

        BoardSpace MediterraneanAvenue = new BoardSpace(null, 60, 2, "Narrow Sea", true );

        BoardSpace balticAvenue = new BoardSpace(null, 60, 4, "Pentos", true);

        BoardSpace incomeTax = new BoardSpace(null, 0, 0, "Income Tax", false);

        BoardSpace readingRailroad = new BoardSpace(null, 200, 25, "Kings Road", true);

        BoardSpace orientalAvenue = new BoardSpace(null, 100, 4, "Asshai", true);

        BoardSpace chance = new BoardSpace(null, 0, 0, "Chance", false);

        BoardSpace vermontAvenue = new BoardSpace(null, 100, 6, "Dorne", true);

        BoardSpace connecticutAvenue = new BoardSpace(null, 120, 8, "Highgarden", true);

        BoardSpace jail = new BoardSpace(null, 0, 0, "Dungeons", false);

        BoardSpace stCharlesPlace = new BoardSpace(null, 140, 10, "Casterly Rock", true);

        BoardSpace electricCompany = new BoardSpace(null, 150, 4, "Dragon Breeder Company", true);

        BoardSpace statesAvenue = new BoardSpace(null, 140, 10, "Flea Bottom", true);

        BoardSpace virginiaAvenue = new BoardSpace(null, 160, 12, "Stark's Realm", true);

        BoardSpace pennsylvaniaRailroad = new BoardSpace(null, 200, 25, "Eastern Road", true);

        BoardSpace stJamesPlace = new BoardSpace(null, 180, 14, "High Septon Place", true);

        BoardSpace communityChestTwo = new BoardSpace(null, 0, 0, "Community Chest", false);

        BoardSpace tennesseeAvenue = new BoardSpace(null, 180, 14, "The Twins", true);

        BoardSpace newYorkAvenue = new BoardSpace(null, 200, 16, "Storm's End", true);

        BoardSpace freeParking = new BoardSpace(null, 0, 0, "Free Horse Parking", false);

        BoardSpace kentuckyAvenue = new BoardSpace(null, 220, 18, "Dragonstone", true);

        BoardSpace chanceTwo = new BoardSpace(null, 0, 0, "Chance", false);

        BoardSpace indianaAvenue = new BoardSpace(null, 220, 18, "Vale", true);

        BoardSpace illinoisAvenue = new BoardSpace(null, 240, 20, "Sept of Baelor", true);

        BoardSpace bandoRailroad = new BoardSpace(null, 200, 25, "Northern Road", true);

        BoardSpace atlanticAvenue = new BoardSpace(null, 260, 22, "Riverrun", true);

        BoardSpace ventnorAvenue = new BoardSpace(null, 260, 22, "Braavos", true);

        BoardSpace waterWorks = new BoardSpace(null, 150, 4, "Water Works", true);

        BoardSpace marvinGardens = new BoardSpace(null, 280, 24, "Aegon's Gardens", true);

        BoardSpace gotojail = new BoardSpace(null, 0, 0, "Go To Dungeons", false);

        BoardSpace pacificAvenue = new BoardSpace(null, 300, 26, "Pyke", true);

        BoardSpace northCarolinaAvenue = new BoardSpace(null, 300, 26, "Red Keep", true);

        BoardSpace communityChestThree = new BoardSpace(null, 0, 0, "Community Chest", false);

        BoardSpace pennsylvaniaAvenue = new BoardSpace(null, 320, 28, "Hardhome", true);

        BoardSpace shortLine = new BoardSpace(null, 200, 26, "Valyrian Road", true);

        BoardSpace chanceThree = new BoardSpace(null, 0, 0, "Chance", false);

        BoardSpace parkPlace = new BoardSpace(null, 350, 35, "The Stepstones", true);

        BoardSpace luxuryTax = new BoardSpace(null, 0, 0, "Luxury Tax", false);

        BoardSpace boardwalk = new BoardSpace(null, 400, 50, "The Wall", true);

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

        gameBoard.insertFirst(MediterraneanAvenue);

        gameBoard.insertFirst(go);

        ArrayList<BoardSpace> storage = new ArrayList<>();

        storage.add(go);

        storage.add(MediterraneanAvenue);

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


        // Game setup
        Game game = new Game(players, gameBoard);
        System.out.println("Welcome to Game of Thrones Monopoly. When you play the Game of Thrones, you win or you die. There is no middle ground. Let the game begin!");
        while(!hasGameEnded(game)) {
            Player currentPlayer = (Player) players.first.t;
            turn(currentPlayer, storage);
            move(currentPlayer, game);
            System.out.println(currentPlayer.getIcon() + " currently Has: " + currentPlayer.getBalance() + " Gold Dragons, and they hold these properties: " + currentPlayer.getProperties());
            players.first = players.first.nextLink;
            game.printBoard();
        }
        System.out.println("The Game of Thrones Has Ended. Only One Player Remains Supreme, They Have A Monopoly Over The Realm!");
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
            ArrayList<BoardSpace> properties = new ArrayList<BoardSpace>();
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
        lastDiceRoll = diceRoll+diceRoll2;
        if(player.getCurrentSpace() + (diceRoll) > 39) {
            player.setBalance(player.getBalance() + 200);
            player.setCurrentSpace(Math.abs(player.getCurrentSpace() + (diceRoll) - 40));
        }
        else {
            player.setCurrentSpace(player.getCurrentSpace() + (diceRoll));
        }
        System.out.println("Now " + player.getIcon() +  " is on " + storage.get(player.getCurrentSpace()));
    }



    // Moves player
    public static void move(Player player, Game game) {
        for(int i = 0; i <game.getBoardSpace(player.getCurrentSpace()-1).getCurrentPlayers().length; i++) {
            if(game.getBoardSpace(player.getCurrentSpace()-1).getCurrentPlayers()[i] == null) {
                game.getBoardSpace(player.getCurrentSpace()-1).getCurrentPlayers()[i] = player;
                if(game.getBoardSpace(player.getCurrentSpace()-1).isPurchasable() && game.getBoardSpace(player.getCurrentSpace()-1).getOwner() == null) {

                    Scanner in = new Scanner(System.in);
                    System.out.println("Would you like to purchase this property?");
                    if(in.nextLine().equals("y")) {
                        if(game.getBoardSpace(player.getCurrentSpace()-1).getName().contains("Road")) {
                            if(game.getNumOwnedRailRoads() == 0) {
                                player.setBalance(player.getBalance()-25);
                            }
                            if(game.getNumOwnedRailRoads() == 1) {
                                player.setBalance(player.getBalance()-50);
                            }
                            if(game.getNumOwnedRailRoads() == 2) {
                                player.setBalance(player.getBalance()-100);
                            }
                            if(game.getNumOwnedRailRoads() == 3) {
                                player.setBalance(player.getBalance()-200);
                            }
                        }
                        else {
                            player.setBalance(player.getBalance()-game.getBoardSpace(player.getCurrentSpace()-1).cost);
                        }
                        game.getBoardSpace(player.getCurrentSpace()-1).setOwner(player);
                        game.getBoardSpace(player.getCurrentSpace()-1).setPurchasable(false);
                        player.addProperty(game.getBoardSpace(player.getCurrentSpace()-1));
                    }
                }
                else {
                    if(game.getBoardSpace(player.getCurrentSpace()-1).getOwner() == player) {

                    }
                    else {
                        player.setBalance(player.getBalance() - getBoardSpaceCost(game.getBoardSpace(player.getCurrentSpace()-1), player.getBalance()));
                    }

                }
                break;
            }
        }
    }

    // Gets Cost of Landing on A Space
    public static int getBoardSpaceCost(BoardSpace space, int balance) {
        Scanner in = new Scanner(System.in);
        if(space.getName().equals("Income Tax") || space.getName().equals("luxury Tax")) {
            System.out.println("Would you like to pay a flat $900 Dollar Fee or a 10% Tax ($/%)");
            if(in.nextLine().equals("$")) {
                return -1 * 900;
            }
            else {
                return (int) (balance*0.1);
            }
        }
        if(space.getName().equals("Water Works") || space.getName().equals("Dragon Breeder Company")) {
            int util = 0;
            for(BoardSpace playerSpaces : space.getOwner().getProperties()) {
                if(playerSpaces.getName().equals("Water Works") || playerSpaces.getName().equals("Dragon Breeder Company")) {
                    util++;
                }
            }
            if (util == 2) {
                return lastDiceRoll * 10;
            }
            return lastDiceRoll*4;
        }
        if(space.getName().equals("Community Chest")) {
            // 900 Dollar Tax or 10% tax
            return 1 * space.getCost();
        }
        return  1 * space.getTax();
    }

    public static boolean hasGameEnded(Game game) {
        int numPlayersNotBankrupt = 0;
        Link temp = game.getPlayers().first;
        if(((Player) temp.t).getBalance() > 0) {
            numPlayersNotBankrupt++;
        }
        temp = temp.nextLink;
        while(temp != game.getPlayers().first) {
            Player player = (Player) temp.t;
            if(player.getBalance() > 0) {
                numPlayersNotBankrupt++;
            }
            if(numPlayersNotBankrupt > 1) {
                return false;
            }
            temp = temp.nextLink;
        }
        return true;
    }
}
