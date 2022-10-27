# Monopoly Project
 
## Monopoly Simulator Designed by Arjun and Elliott

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


BoardSpace <br />
Player owner, int tax, int cost, String name, boolean isPurchasable, String colorStr <br />
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

Game <br />
CircularLinkedList<Player> players, CircularLinkedList<BoardSpace> gameBoard <br />
public CircularLinkedList<Player> getPlayers() <br />
public void setPlayers(CircularLinkedList<Player> players) <br />
public CircularLinkedList<BoardSpace> getGameBoard() <br />
public void setGameBoard(CircularLinkedList<BoardSpace> gameBoard) <br />

Main <br />
public static void main(String[] args) - Create a scanner, ask to input all players. Cap between 2 and 6.
                                         Create Player() from the inputs. 
public void runTurn() - rolls the dice, moves player to right square, prints out board, taxes them
public void printBoard - prints out board

![Monopoly](https://user-images.githubusercontent.com/33406133/196270275-82d102c0-19de-4eeb-95ed-5f357a787c09.jpg)
