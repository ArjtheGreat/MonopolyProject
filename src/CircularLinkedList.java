/*********************
 *
 * Author: Arjun Maitra and Elliot Duke
 * Assignment: Monopoly, Circular Linked List Class
 * Date due: 10/26
 */

// All code by Maitra
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
}
