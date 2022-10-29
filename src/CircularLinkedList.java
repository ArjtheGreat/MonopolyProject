/*********************
 *
 * Author: Arjun Maitra and Elliot Duke
 * Assignment: Monopoly, Circular Linked List Class
 * Date due: 10/26
 */

// Code by Maitra
public class CircularLinkedList<T> {

    public T t;
    Link first;
    Link last;

    // Constructor
    public CircularLinkedList(T t) {
        this.t = t;
    }

    // Checks if List is empty
    public boolean isEmpty() {
        return first == null;
    }


    // Inserts element into start of the list
    public void insertFirst(T newData) {

        // Special Case - List is empty
        if(isEmpty()) {
            Link node = new Link(newData);
            first = node;
            last = node;
        }

        // Normal Case, make sure last element points back to front
        else {
            Link node = new Link(newData);
            node.nextLink = first;
            first = node;
            last.nextLink = first;
        }
    }

    // PS - This was taken from GeeksForGeeks, just for testing purposes
    public String toString()
    {
        String out = "";
        Link temp = first;
        if (first != null) {
            do {
                out += (temp.t + " ");
                temp = temp.nextLink;
            } while (temp != first);
        }
        return out;
    }

    // Deletes Element in List
    public Link delete(Object value) {
        Link currentLink = first;

        // Iterate through linked list and find object
        while(currentLink.nextLink != null) {

            // break connections, make linked list jump
            if(currentLink.nextLink.t.equals(value)) {
                Link temp = currentLink.nextLink;
                currentLink.nextLink = currentLink.nextLink.nextLink;
                return temp;
            }
            currentLink = currentLink.nextLink;
        }
        System.out.println("This value is not in the Linked List");
        return null;
    }

    // Find Num of Elements in Linked List
    public int size() {
        Link temp = first;
        int count = 0;
        while (temp != null) {
            temp = temp.nextLink;
            count++;
        }
        return count;
    }
}
