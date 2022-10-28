import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/*********************
 *
 * Author: Arjun Maitra and Elliot Duke
 * Assignment: Monopoly, Main Class
 * Date due: 10/26
 */

// All code by Maitra
public class Main {

    // This is used for water works and electric company
    static int lastDiceRoll;

    // This Is Used to Keep track if there is a double roll
    static boolean doubleRoll;

    // Keeps track of last space, for turn method
    static int lastSpace;

    public static void main(String[] args) {

        // Players Set up
        CircularLinkedList<Player> players = getPlayers();
        System.out.println("Hello, " + players);

        // Board Setup
        BoardSpace go = new BoardSpace(null, 0, 0, "Go", false);



        // A ton of lines for all the squares
        CircularLinkedList<BoardSpace> gameBoard = new CircularLinkedList<>(go);

        // This one line contains all the different spaces
        BoardSpace communityChest = new BoardSpace(null, 0, 0, "Community Chest", false); BoardSpace MediterraneanAvenue = new BoardSpace(null, 60, 2, "Narrow Sea", true ); BoardSpace balticAvenue = new BoardSpace(null, 60, 4, "Pentos", true); BoardSpace incomeTax = new BoardSpace(null, 0, 0, "Income Tax", false); BoardSpace readingRailroad = new BoardSpace(null, 200, 25, "Kings Road", true); BoardSpace orientalAvenue = new BoardSpace(null, 100, 4, "Asshai", true); BoardSpace chance = new BoardSpace(null, 0, 0, "Chance", false); BoardSpace vermontAvenue = new BoardSpace(null, 100, 6, "Dorne", true); BoardSpace connecticutAvenue = new BoardSpace(null, 120, 8, "Highgarden", true); BoardSpace jail = new BoardSpace(null, 0, 0, "Dungeons Or Passing Through", false); BoardSpace stCharlesPlace = new BoardSpace(null, 140, 10, "Casterly Rock", true); BoardSpace electricCompany = new BoardSpace(null, 150, 4, "Dragon Breeder Company", true); BoardSpace statesAvenue = new BoardSpace(null, 140, 10, "Flea Bottom", true); BoardSpace virginiaAvenue = new BoardSpace(null, 160, 12, "Stark's Realm", true); BoardSpace pennsylvaniaRailroad = new BoardSpace(null, 200, 25, "Eastern Road", true); BoardSpace stJamesPlace = new BoardSpace(null, 180, 14, "High Septon Place", true); BoardSpace communityChestTwo = new BoardSpace(null, 0, 0, "Community Chest", false); BoardSpace tennesseeAvenue = new BoardSpace(null, 180, 14, "The Twins", true); BoardSpace newYorkAvenue = new BoardSpace(null, 200, 16, "Storm's End", true); BoardSpace freeParking = new BoardSpace(null, 0, 0, "Free Horse Parking", false); BoardSpace kentuckyAvenue = new BoardSpace(null, 220, 18, "Dragonstone", true); BoardSpace chanceTwo = new BoardSpace(null, 0, 0, "Chance", false); BoardSpace indianaAvenue = new BoardSpace(null, 220, 18, "Vale", true); BoardSpace illinoisAvenue = new BoardSpace(null, 240, 20, "Sept of Baelor", true); BoardSpace bandoRailroad = new BoardSpace(null, 200, 25, "Northern Road", true); BoardSpace atlanticAvenue = new BoardSpace(null, 260, 22, "Riverrun", true); BoardSpace ventnorAvenue = new BoardSpace(null, 260, 22, "Braavos", true); BoardSpace waterWorks = new BoardSpace(null, 150, 4, "Water Works", true); BoardSpace marvinGardens = new BoardSpace(null, 280, 24, "Aegon's Gardens", true); BoardSpace gotojail = new BoardSpace(null, 0, 0, "Go To Dungeons", false); BoardSpace pacificAvenue = new BoardSpace(null, 300, 26, "Pyke", true); BoardSpace northCarolinaAvenue = new BoardSpace(null, 300, 26, "Red Keep", true); BoardSpace communityChestThree = new BoardSpace(null, 0, 0, "Community Chest", false); BoardSpace pennsylvaniaAvenue = new BoardSpace(null, 320, 28, "Hardhome", true); BoardSpace shortLine = new BoardSpace(null, 200, 26, "Valyrian Road", true); BoardSpace chanceThree = new BoardSpace(null, 0, 0, "Chance", false); BoardSpace parkPlace = new BoardSpace(null, 350, 35, "The Stepstones", true); BoardSpace luxuryTax = new BoardSpace(null, 0, 0, "Luxury Tax", false); BoardSpace boardwalk = new BoardSpace(null, 400, 50, "The Wall", true); gameBoard.insertFirst(boardwalk); gameBoard.insertFirst(luxuryTax); gameBoard.insertFirst(parkPlace); gameBoard.insertFirst(chanceThree); gameBoard.insertFirst(shortLine); gameBoard.insertFirst(pennsylvaniaAvenue); gameBoard.insertFirst(communityChestThree); gameBoard.insertFirst(northCarolinaAvenue); gameBoard.insertFirst(pacificAvenue); gameBoard.insertFirst(gotojail); gameBoard.insertFirst(marvinGardens); gameBoard.insertFirst(waterWorks); gameBoard.insertFirst(ventnorAvenue); gameBoard.insertFirst(atlanticAvenue); gameBoard.insertFirst(bandoRailroad); gameBoard.insertFirst(illinoisAvenue); gameBoard.insertFirst(indianaAvenue); gameBoard.insertFirst(chanceTwo); gameBoard.insertFirst(kentuckyAvenue); gameBoard.insertFirst(freeParking); gameBoard.insertFirst(newYorkAvenue); gameBoard.insertFirst(tennesseeAvenue); gameBoard.insertFirst(communityChestTwo); gameBoard.insertFirst(stJamesPlace); gameBoard.insertFirst(pennsylvaniaRailroad); gameBoard.insertFirst(virginiaAvenue); gameBoard.insertFirst(statesAvenue); gameBoard.insertFirst(electricCompany); gameBoard.insertFirst(stCharlesPlace); gameBoard.insertFirst(jail); gameBoard.insertFirst(connecticutAvenue); gameBoard.insertFirst(vermontAvenue); gameBoard.insertFirst(chance); gameBoard.insertFirst(orientalAvenue); gameBoard.insertFirst(readingRailroad); gameBoard.insertFirst(incomeTax); gameBoard.insertFirst(balticAvenue); gameBoard.insertFirst(communityChest); gameBoard.insertFirst(MediterraneanAvenue); gameBoard.insertFirst(go);

        // Used for printing out the spaces
        ArrayList<BoardSpace> storage = new ArrayList<>(); storage.add(go); storage.add(MediterraneanAvenue); storage.add(communityChest); storage.add(balticAvenue); storage.add(incomeTax); storage.add(readingRailroad); storage.add(orientalAvenue); storage.add(chance); storage.add(vermontAvenue); storage.add(connecticutAvenue); storage.add(jail); storage.add(stCharlesPlace); storage.add(electricCompany); storage.add(statesAvenue); storage.add(virginiaAvenue); storage.add(pennsylvaniaRailroad); storage.add(stJamesPlace); storage.add(communityChestTwo); storage.add(tennesseeAvenue); storage.add(newYorkAvenue); storage.add(freeParking); storage.add(kentuckyAvenue); storage.add(chanceTwo); storage.add(indianaAvenue); storage.add(illinoisAvenue); storage.add(bandoRailroad); storage.add(atlanticAvenue); storage.add(ventnorAvenue); storage.add(waterWorks); storage.add(marvinGardens); storage.add(gotojail); storage.add(pacificAvenue); storage.add(northCarolinaAvenue); storage.add(communityChestThree); storage.add(pennsylvaniaAvenue); storage.add(shortLine); storage.add(chanceThree); storage.add(parkPlace); storage.add(luxuryTax); storage.add(boardwalk);


        // Game setup
        Game game = new Game(players, gameBoard);
        System.out.println("Welcome to Game of Thrones Monopoly. When you play the Game of Thrones, you win or you die. There is no middle ground. Let the game begin!");

        // adds players to go
        Link temp = game.getPlayers().first;
        Player insertPlayer = (Player) temp.t;
        go.addPlayer(insertPlayer);
        temp = temp.nextLink;

        // Iterate and add
        while(temp != game.getPlayers().first) {
            insertPlayer = (Player) temp.t;
            go.addPlayer(insertPlayer);
            temp = temp.nextLink;
        }

        // Iterative loop that runs through the game
        while(!hasGameEnded(game)) { // until only 1 player is not bankrupt
            doubleRoll = false; // this checks if it is double roll, in case you have to get an extra turn
            Player currentPlayer = (Player) players.first.t; // current player
            turn(currentPlayer, storage); // rolls dice

            // checks if current player is in jail, if they roll a double, they get out
            if(doubleRoll && currentPlayer.isInJail()) {
                System.out.println("You got out of jail");
                currentPlayer.setInJail(false);
            }

            // moves the player to their new square, updates balance, purchases, etc
            else {
                move(currentPlayer, game);
            }

            // Prints out player stats, for info and testing purposes
            System.out.println(currentPlayer.getIcon() + " currently Has: " + currentPlayer.getBalance() + " Gold Dragons, and they hold these properties: " + currentPlayer.getProperties() + " and they currently have a mortgage on these properties: " + currentPlayer.getMortagedProperties());

            // Moves to the next player IF NOT double roll
            if(!doubleRoll) {
                players.first = players.first.nextLink;
            }

            // print out board
            game.printBoard(currentPlayer);
        }
        System.out.println("The Game of Thrones Has Ended. Only One Player Remains Supreme, They Have A Monopoly Over The Realm!");
    }

    // Prompts User For Players
    public static CircularLinkedList<Player> getPlayers() {

        // The Players Linked List
        CircularLinkedList<Player> players = new CircularLinkedList<Player>(new Player(0, null, 'A', false, "color"));

        // Keeps Tracks of # of players so they have at least 2 and dont go over 6
        int numPlayers = 1;
        Scanner in = new Scanner(System.in);
        while(true) {

            // Color Setup
            String color;
            if(numPlayers==1){
                //green
                color = "\u001B[42m";
            }
            else if(numPlayers==2){
                //yellow
                color = "\u001B[43m";
            }
            else if(numPlayers==3){
                //blue
                color = "\u001B[44m";
            }
            else if(numPlayers==4){
                //purple
                color = "\u001B[45m";
            }
            else{
                //cyan
                color = "\u001B[46m";
            }

            // Create New Player and all the assorted variables
            System.out.println("Player " + numPlayers + " character: ");
            char icon = in.nextLine().toCharArray()[0];

            // empty arraylist for the properties
            ArrayList<BoardSpace> properties = new ArrayList<BoardSpace>();
            Player player = new Player(1500, properties, icon, false, color);

            // all start at go
            player.setCurrentSpace(0);

            // add to link list
            players.insertFirst(player);

            // go from 2-6
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

        // Sell Property to Bank
        Scanner in = new Scanner(System.in);
        // Gotta check if player as at least 1 property
        if(player.getProperties().size() > 0) {
            System.out.println(player + ", would you like to sell a property to the Bank? (y/n)");

            if(in.nextLine().equals("y")) {
                // Print Out Your Info
                Player a = player;
                System.out.println(a + " currently owns " + a.getProperties());

                // Prompt Users for What Properties They Want To Sell
                System.out.println("What properties would you like to sell to the Bank? (Property1, Property2, Property3)");
                ArrayList<BoardSpace> givenProperties = new ArrayList<>();
                String[] givenPropertiesSplit = in.nextLine().split(", ");

                // Added Properties to Given Properties
                for(int i = 0; i < givenPropertiesSplit.length; i++) {
                    for(BoardSpace y : a.getProperties()) {
                        if(y.getName().equals(givenPropertiesSplit[i])) {
                            givenProperties.add(y);
                        }
                    }
                }

                // Remove ownership of the properties, give back original cost to player
                for(BoardSpace space : givenProperties) {
                    a.getProperties().remove(space);
                    a.setBalance(a.getBalance()+space.getCost());
                    space.setOwner(null);
                    System.out.println("Transaction Success! You sold " + space.getName() + " to the bank. +" + space.getCost());
                }
            }
        }
        // Pay Fine to get out of jail
        if(player.isInJail()) {
            // Checks if has Get Out of Jail Free Card
            boolean getOutOfJailFreeAvailable = false;
            for(int i = 0; i<player.getProperties().size(); i++) {

                if(player.getProperties().get(i).getName().equals("Get Out Of Jail Free")) {
                    getOutOfJailFreeAvailable = true;
                }
                player.getProperties().remove(player.getProperties().get(i));
            }
            if(getOutOfJailFreeAvailable) {
                System.out.println("You used your Get Out Of Jail Free Card to Get Out Of Jail.");
            }
            else {
                System.out.println("Do you wanna pay a $50 fine to get out of jail? (y/n)");
                String jailResponse = in.nextLine();
                if(jailResponse.equals("y")) {
                    player.setBalance(player.getBalance()-50); // updates balance
                    player.setInJail(false); // moves them out of jail
                }
            }
        }

        // Dice Rolling - 6 possible values for each dice, rolling two dices
        int max = 6;
        int min = 1;
        int diceRoll = (int)Math.floor(Math.random()*(max-min+1)+min);
        int diceRoll2 = (int)Math.floor(Math.random()*(max-min+1)+min);

        // Gives user info on dice roll and their old space
        System.out.println(player.getIcon() + ", you rolled a " + (diceRoll) + " and a " + diceRoll2 + ". You were on " + storage.get(player.getCurrentSpace()));

        // Double roll! update the global static variable
        if(diceRoll == diceRoll2) {
            System.out.println("Wow, double roll! Extra Turn Time!");
            doubleRoll = true;
        }

        // Updates the global static variable for the last dice roll in case player lands on Water Works or Electrc Company
        lastDiceRoll = diceRoll+diceRoll2;
        lastSpace = player.getCurrentSpace();
        // Make sure the player doesnt go over 40, and sends them in a circle.
        if(player.getCurrentSpace() + (lastDiceRoll) > 39) {
            player.setBalance(player.getBalance() + 200);
            System.out.println(player + ", you passed go! +200");
            player.setCurrentSpace(Math.abs(player.getCurrentSpace() + (lastDiceRoll) - 40));
        }

        // normal movement
        else {
            player.setCurrentSpace(player.getCurrentSpace() + (lastDiceRoll));
        }

        // updates to new square
        System.out.println("Now " + player.getIcon() +  " is on " + storage.get(player.getCurrentSpace()));
    }



    // Moves player
    public static void move(Player player, Game game) {

        Scanner in = new Scanner(System.in);

        // Cut off connection from old space
        BoardSpace oldSpace = game.getBoardSpace(lastSpace);
        for(int i = 0; i<oldSpace.getCurrentPlayers().length; i++) {
            if(oldSpace.getCurrentPlayers()[i] != null && oldSpace.getCurrentPlayers()[i].equals(player)) {
                oldSpace.getCurrentPlayers()[i] = null;
            }
        }
        // iterates through all the players on space
        for(int i = 0; i <game.getBoardSpace(player.getCurrentSpace()).getCurrentPlayers().length; i++) {
            // Checks for the first empty space. adds the player in that empty space
            if (game.getBoardSpace(player.getCurrentSpace() - 1).getCurrentPlayers()[i] == null) {
                game.getBoardSpace(player.getCurrentSpace() - 1).getCurrentPlayers()[i] = player;
                break;
            }
        }


        // Checks if this space purchasable and has no owner.
        if(game.getBoardSpace(player.getCurrentSpace()).isPurchasable() && game.getBoardSpace(player.getCurrentSpace()).getOwner() == null) {

            // Prompts user if they want to purchase
            System.out.println("Would you like to purchase this property? It costs " + game.getBoardSpace(player.getCurrentSpace()).getCost() + " Gold Dragons. (y/n)");
            String out = in.nextLine();

            // If they say yes
            if(out.equals("y")) {

                // Railroad Check. Railroads increae by 2x for each railroad purchased.
                if(game.getBoardSpace(player.getCurrentSpace()).getName().contains("Road")) {
                    // No Railroads Purchased yet
                    if(game.getNumOwnedRailRoads() == 0) {
                        player.setBalance(player.getBalance()-25);
                    }

                    // 1 Railroad Purchased
                    if(game.getNumOwnedRailRoads() == 1) {
                        player.setBalance(player.getBalance()-50);
                    }

                    // 2 Railroad Purchased
                    if(game.getNumOwnedRailRoads() == 2) {
                        player.setBalance(player.getBalance()-100);
                    }

                    // 3 Railroad Purchased
                    if(game.getNumOwnedRailRoads() == 3) {
                        player.setBalance(player.getBalance()-200);
                    }
                }

                // Normal Purchase payment
                else {
                    player.setBalance(player.getBalance()-game.getBoardSpace(player.getCurrentSpace()).cost);
                }

                // hands player ownership of new space. it is not purchasable anymore.
                game.getBoardSpace(player.getCurrentSpace()).setOwner(player);
                game.getBoardSpace(player.getCurrentSpace()).setPurchasable(false);
                player.addProperty(game.getBoardSpace(player.getCurrentSpace()));
            }
        }

        // Space is not available for purchase
        else {

            // Player owns the space, so skip this next step
            if(game.getBoardSpace(player.getCurrentSpace()).getOwner() != null && game.getBoardSpace(player.getCurrentSpace()).getOwner().equals(player)) {

            }

            // Player lands on Chance, draws a Chance
            else if (game.getBoardSpace(player.getCurrentSpace()).getName().equals("Chance")) {


            }
            // Player lands on Go to Jail, rip
            else if (game.getBoardSpace(player.getCurrentSpace()).getName().equals("Go To Dungeons")) {
                player.setInJail(true);
                player.setCurrentSpace(10);
            }

            // Normal Rent Payment
            else {
                if(game.getBoardSpace(player.getCurrentSpace()).isHasBeenMortgaged()) {

                }
                // Special Conditions For Income and Luxury Taxes
                else if(game.getBoardSpace(player.getCurrentSpace()).getName().equals("Income Tax") || game.getBoardSpace(player.getCurrentSpace()).getName().equals("luxury Tax")) {

                    // Two Possible Conditions - Flat or Percent
                    System.out.println("Would you like to pay a flat $200 Dollar Fee or a 10% Tax ($/%)");
                    String out = in.nextLine();

                    // For Flat Fee
                    if(out.equals("$")) {
                        player.setBalance(player.getBalance()-200);
                    }
                    // For Percent Fee
                    else {
                        player.setBalance(player.getBalance()- (int) (player.getBalance()*0.1));
                    }
                }
                else if(game.getBoardSpace(player.getCurrentSpace()).getOwner() !=null) {

                    // Transfer Money between players
                    int transferMoney = getBoardSpaceCost(game.getBoardSpace(player.getCurrentSpace()), player.getBalance());
                    player.setBalance(player.getBalance() - transferMoney);
                    game.getBoardSpace(player.getCurrentSpace()).getOwner().setBalance(player.getBalance() + transferMoney);

                    // Notify What Player Owes
                    System.out.println("You owe " + game.getBoardSpace(player.getCurrentSpace()).getOwner() + " " + game.getBoardSpace(player.getCurrentSpace()).getTax() + " Gold Dragons for rent on his property.");
                }
            }

        }

        if(player.getProperties().size() > 0) {
            // Extra Element - Trading Between Players
            // Prompt User For Trade
            System.out.println("Would you like to trade with another player? (y/n)");

            if(in.nextLine().equals("y")) {

                // Locate the Player to Trade with
                boolean keepTrading = true;
                while(keepTrading) {
                    System.out.println("Who would you like to trade with? (PlayerIcon)");
                    String targetPLayer = in.nextLine();

                    // Temp Finds PLayer
                    Link temp = game.getPlayers().first;
                    while(!temp.t.toString().equals(targetPLayer)) { // Locates Player with Inputed Char
                        temp = temp.nextLink;
                    }

                    // Print Out Players Info
                    Player x = (Player) temp.t;
                    System.out.println(x + " currently owns " + x.getProperties());

                    // Prompt Users for Traded Properties
                    System.out.println("What properties would you like to trade for? (Property1, Property2, Property3)");
                    ArrayList<BoardSpace> offeredProperties = new ArrayList<>();
                    String[] offeredPropertiesSplit = in.nextLine().split(", ");

                    // Added Properties to Offered Properties
                    for(int i = 0; i < offeredPropertiesSplit.length; i++) {
                        for(BoardSpace y : x.getProperties()) {
                            if(y.getName().equals(offeredPropertiesSplit[i])) {
                                offeredProperties.add(y);
                            }
                        }
                    }

                    // Print Out Your Info
                    Player a = player;
                    System.out.println(a + " currently owns " + a.getProperties());

                    // Prompt Users for What Properties They Want To Trade
                    System.out.println("What properties would you like to give? (Property1, Property2, Property3)");
                    ArrayList<BoardSpace> givenProperties = new ArrayList<>();
                    String[] givenPropertiesSplit = in.nextLine().split(", ");

                    // Added Properties to Given Properties
                    for(int i = 0; i < givenPropertiesSplit.length; i++) {
                        for(BoardSpace y : a.getProperties()) {
                            if(y.getName().equals(givenPropertiesSplit[i])) {
                                givenProperties.add(y);
                            }
                        }
                    }

                    // Does User Accept
                    System.out.println(x + ", do you accept the trade? (y/n)");
                    String acceptedTrade = in.nextLine();
                    if(acceptedTrade.equals("y")) {

                        // Iterate Through Offered Properties, Swap Ownership
                        for(BoardSpace space : offeredProperties) {
                            x.getProperties().remove(space);
                            a.getProperties().add(space);
                        }

                        // Iterate Through Given Properties, Swap Ownership
                        for(BoardSpace space : givenProperties) {
                            a.getProperties().remove(space);
                            x.getProperties().add(space);
                        }

                        // Print Out New Property Ownership
                        System.out.println("Now " + a + " owns " + a.getProperties());
                        System.out.println("Now " + x + " owns " + x.getProperties());
                    }
                    keepTrading = false;
                }
            }

            // Extra Element - Mortgage
            System.out.println("Would you like to mortgage any of your properties? (y/n)");
            String mortgageResponse = in.nextLine();
            if (mortgageResponse.equals("y")) {

                // Get the Properties that they want to mortgage
                System.out.println("What properties would you like to mortgage? You currently own these properties: " + player.getProperties());
                String[] mortgagedPropertiesSplit = in.nextLine().split(", ");

                // Added Properties to Mortgaged Properties. T
                for(int i = 0; i < mortgagedPropertiesSplit.length; i++) {
                    for(BoardSpace y : player.getProperties()) {
                        if(y.getName().equals(mortgagedPropertiesSplit[i]) && !y.isHasBeenMortgaged()) {

                            // Set Property to Mortgaged
                            game.addMortgage(y, player);
                        }
                    }
                }
            }

            // Unmortgage Property - available ONLY if player has no properties
            if(player.getMortagedProperties().size()>0) {

                // Prompt User
                System.out.println("Would you like to unmortgage any of your properties? (y/n)");
                String unMortageResponse = in.nextLine();

                if (unMortageResponse.equals("y")) {

                    // What Properties?
                    System.out.println("What properties would you like to unmortgage?");
                    String[] unmortgagedPropertiesSplit = in.nextLine().split(", ");

                    // Added Properties to Given Properties
                    for(int i = 0; i < unmortgagedPropertiesSplit.length; i++) {
                        for(BoardSpace y : player.getProperties()) {
                            if(y.getName().equals(unmortgagedPropertiesSplit[i]) && y.isHasBeenMortgaged()) {

                                // Unmortgage Property
                                game.removedMortgage(y, player);
                            }
                        }
                    }
                }
            }
        }
    }

    // Returns Cost of Landing on A Space
    public static int getBoardSpaceCost(BoardSpace space, int balance) {
        Scanner in = new Scanner(System.in);

        // Special Conditions for Water Works and Electric Company (AKA Dragon Breeder Company)
        if(space.getName().equals("Water Works") || space.getName().equals("Dragon Breeder Company")) {

            // Checks to see if the owner of the property owns the other utility, as this effects tax
            int util = 0;
            for(BoardSpace playerSpaces : space.getOwner().getProperties()) {
                if(playerSpaces.getName().equals("Water Works") || playerSpaces.getName().equals("Dragon Breeder Company")) {
                    util++;
                }
            }

            // if they own 2 utlities, the tax is 10*the dice roll! the dice roll is accessed using the lastDiceRoll global static variable
            if (util == 2) {
                return lastDiceRoll * 10;
            }

            // if they only own 1, its just 4*dice roll
            return lastDiceRoll*4;
        }

        // Normal Tax
        return  1 * space.getTax();
    }


    // Checks to see if game has ended
    public static boolean hasGameEnded(Game game) {

        // Keeps track of number of bankrupt players
        int numPlayersNotBankrupt = 0;

        // the iterative link variable
        Link temp = game.getPlayers().first;

        // checks for the first player
        if(((Player) temp.t).getBalance() > 0) {
            numPlayersNotBankrupt++;
        }

        // move on to the next
        temp = temp.nextLink;

        // go around the circle until you reach the start
        while(temp != game.getPlayers().first) {

            // Checks if player's balance is less than 0
            Player player = (Player) temp.t;
            if(player.getBalance() > 0) {
                numPlayersNotBankrupt++;
            }

            // If more than one player still has profit, then the game goes on
            if(numPlayersNotBankrupt > 1) {
                return false;
            }
            temp = temp.nextLink;
        }
        return true;
    }
}
