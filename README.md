# Monopoly Project
 
## Monopoly Simulator Designed by Arjun

# Classes and Methods: <br />
Classes: Link, CircularLinkedList, Player, BoardSpace, Main, Game <br />

-All Classes contain Constructors <br />

Main: <br />

Link<T> <br />
public T t, (this acts as the generic object) <br />
Link nextLink <br />
public Node(T t) { this.t = t; } <br />

CircularLinkedList<T> <br />
public T t, (this acts as the generic object) <br />
Link first <br />
Link last <br />
public Node(T t) - set first = null and last = null <br />
public void insertFirst(Object newData) - create a new link using newData. check if the list is empty.  <br />
                                          if it is, set newNode = first and last. <br />
                                          else, set newNode.nextLink = first, set first = newNode, and set last.nextLink = first. <br />
public Link search(Object value) - set Link currentLink = first. while(currentLink != null), <br />
                                   check if currentLink.data = value. return the link. <br />
public Link delete(Object value) - set temp = first. iterate through the linked list and do temp = temp.next until temp.nextLink.equals(value). set temp = currentLink.nextLink and currentLink.nextLink = currentLink.nextLink.nextLink. return temp <br />
public void isEmpty() - return true if first == null <br />


Player <br />
int balance, BoardSpace properties[], char icon, boolean inJail, int currentSpace, String colorName <br />
public int getBalance() <br />
public BoardSpace[] getProperties() <br />
public char getIcon() <br />
public boolean getInJail <br />
public void setBalance(int newBalance) <br />
public void setIcon(char newIcon) <br />
public void setInJail <br />
public String getColorName() <br />
public void setColorName(String colorName) <br />
public ArrayList<BoardSpace> getMortagedProperties() - iterate through getProperties() and if hasBeenMortgaged, add to arrayList. return arraylist <br />

BoardSpace <br />
Player owner, int tax, int cost, String name, boolean isPurchasable, String colorStr, boolean hasBeenMortgaged <br />
public int getOwner() <br />
public void setOwner(Player owner) <br />
public int getCost() <br />
public void setCost(int cost) <br />
public int getTax() <br />
public void setTax(int tax) <br />
public String getName() <br />
isPurchasable() <br />
public void setPurchasable() <br />
public String getColorStr() <br />
public void setColorStr(String colorStr) <br />
public boolean isHasBeenMortgaged() <br />
public void setHasBeenMortgaged(boolean hasBeenMortgaged) <br />

Game <br />
CircularLinkedList<Player> players, CircularLinkedList<BoardSpace> gameBoard <br />
public CircularLinkedList<Player> getPlayers() <br />
public void setPlayers(CircularLinkedList<Player> players) <br />
public CircularLinkedList<BoardSpace> getGameBoard() <br />
public void setGameBoard(CircularLinkedList<BoardSpace> gameBoard) <br />
public BoardSpace getBoardSpace(int x) - returns xth element of linked list. temp = first, iterate through the linked list and x--, temp = temp.next until x = 0. return temp
public int getNumOwnedRailRoads(Player player) - set numOwnedRailroads = 0, iterate through the gameBoard linked list, i
                                                 if the property name.contains("Road"), which means its a railroad, check if the owner.equals(player). if yes, numOwnedRailroads++
                                                 return numOwnedRailroads
public void addMortgage(BoardSpace space, Player player) - give the player back the 100% of the cost of the property. set hasBeenMortaged for the property = true
public void removedMortgage(BoardSpace space, Player player) - subtract 110% of the cost of the property from the player's balance. set hasBeenMortaged for the property = false


Main <br />
public static void main(String[] args) - Create a scanner, ask to input all players. Cap between 2 and 6.
                                         Create Player player from the inputs. Add player to the CircularLinkedList<Player> players
                                         then create all of the 40 BoardSpace, and add them to the CircularLinkedList<BoardSpace> gameBoard
                                         create an arrayList of all the boardspaces which will be used for printing
                                         create a while loop with condition !hasGameEnded(game)
                                         the first element in the linked list = temp
                                         the first player is the first link the players linked list. Player player = (Player) temp.t;
                                         check if player is in jail, if so ask if they wanna leave and pay a 50 buck fee
                                         run turn(player) 
                                         run move(currentPlayer, game)
                                         if the player hasnt rolled a double, temp = temp.next
                                         when the game has ended, print out the info
public static CircularLinkedList<Player> getPlayers() - create a CircularLinkedList<Player> players
                                                        depending on the number of players, assign a color. while there are still players, 
                                                        ask them to input data such as icon, etc and make a new player. add it to players.
                                                        return players
public static void turn(Player player, ArrayList<BoardSpace> storage) - premove stuff: ask the player if they would like to sell a property, add the properties they input into a List, 
                                    and set the owner of the property to null and give the player the cost of the property in cash.
                     check if the player is in jail, and ask if they would like to pay a fee
                     move stuff:
                     create two variables for diceroll, and set them to a Math.rand value from 1-6. add the two together to get the dice roll       
                     check if the diceRoll is a double roll (use a global static variable to use in main?)
                     update the players.currentSpace, if the roll + currentSpace is over 40, then subtract the dice roll by 40 to get the proper location
                     if they pass go, add 200 dollars to the player's balance
public static void move(Player player, Game game) - cut off the players connection from their old space (maybe using a global variable) 
                                                    iterate through the player.currentSpace and find the first empty space in the currentPlayers array. add them to the array
                                                    check if the player.currentSpace's owner is null. if it is prompt them to purchase
                                                    if they do wanna purchase, subtract the cost of the property from player.balance 
                                                    set the owner of the space = player, set the property.isPurchasable = false, and player.addProperty(space)
                                                    if it is not available for purchase, check if the player owns the property. if they do, do nothing
                                                    if it is Jail, setInJail(true) and move them to jail
                                                    else, if the owner of the space is another player (!= null), then transfer money to the other player and subtract money from player.getBalance
                                                    post-move stuff:
                                                    if the player has propert(ies), then prompt them if they want to trade
                                                    String targetPlayer is the icon (as a String) of the player they are locating
                                                    find the player in the players linked list by iterating through the list until player.getName = targetPLayer
                                                    prompt the player what properties they want from the other player. add all of these properties to an arraylist
                                                    prompt the player what properties they want to give. add all these properties to an arraylist
                                                    prompt the other player if they accept the trade, if they do accept, then swap owners for the properties in the two array lists
                                                    if the player has propert(ies), then prompt them if they want to add a mortgage
                                                    ask which properties they want to mortgage and add the properties to an array list
                                                    iterate through the arraylist and addMortage() to the property
                                                    if the player has propert(ies) with mortgage, then prompt them if they want to remove a mortgage
                                                    ask which properties they want to unmortgage and add the properties to an array list
                                                    iterate through the arraylist and removeMortage() to the property
public static int getBoardSpaceCost(BoardSpace space, int balance) - returns the value of the rent of landing on a space
                                                                     check if the space is Income Tax or Luxury Tax, if it is prompt the user if they want to subtract 900 from their balance or pay a 10% luxury tax. return whatever they choose
                                                                     check if the space is a utility. if it is, check if the owner of one owns the other utility. if they do, return their diceRoll*10. if they do not, return diceRoll*4 (Post-pseudocode note: I moved this to turn() because it made more sense there)
                                                                     if none of the above, return the rent of the space
public static boolean hasGameEnded(Game game) - set an int for numOfNotBankruptPlayers, iterate through the Players Linked list and 
                                                if player.getBalance > 0, numOfNotBankruptPlayers++. if numOfNotBankruptPlayers == 1, then the game is over as only one player has money.
![Monopoly](https://user-images.githubusercontent.com/33406133/196270275-82d102c0-19de-4eeb-95ed-5f357a787c09.jpg)
