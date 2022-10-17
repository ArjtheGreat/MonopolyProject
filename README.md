# Monopoly Project
 
## Monopoly Simulator Designed by Arjun and Elliot

# Classes and Methods: <br />
Classes: Link, CircularLinkedList, Player, BoardSpace, Main

-All Classes contain Constructors

Main: <br />

Link<T> <br />
public T t, (this acts as the generic object)
Link nextLink
public Node(T t) { this.t = t; }

CircularLinkedList<T> <br />
public T t, (this acts as the generic object)
Link first
Link last
public Node(T t) - set first = null and last = null
public void insertFirst(Object newData) - create a new link using newData. check if the list is empty. 
                                          if it is, set newNode = first and last. 
                                          else, set newNode.nextLink = first, set first = newNode, and set last.nextLink = first.
public Link search(Object value) - set Link currentLink = first. while(currentLink != null), 
                                   check if currentLink.data = value. return the link.
public void isEmpty() - return true if first == null



![Monopoly](https://user-images.githubusercontent.com/33406133/196270275-82d102c0-19de-4eeb-95ed-5f357a787c09.jpg)
