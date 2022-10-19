# Monopoly Project
 
## Monopoly Simulator Designed by Arjun and Elliot

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
int balance, BoardSpace properties[], char icon, boolean inJail <br />
public int getBalance() <br />
public BoardSpace[] getProperties() <br />
public char getIcon() <br />
public boolean getInJail <br />
public void setBalance(int newBalance) <br />
public void setIcon(char newIcon) <br />
public void setInJail <br />

![Monopoly](https://user-images.githubusercontent.com/33406133/196270275-82d102c0-19de-4eeb-95ed-5f357a787c09.jpg)
