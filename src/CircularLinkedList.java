/*********************
 *
 * Author: Arjun Maitra and Elliot Duke
 * Assignment: Monopoly, Circular Linked List Class
 * Date due: 10/26
 */
public class CircularLinkedList<T> {

    public T t;
    Link first;
    Link last;

    public CircularLinkedList(T t) {
        this.t = t;
    }
    public boolean isEmpty() {
        return first == null;
    }
    public void insertFirst(T newData) {
        if(isEmpty()) {
            Link node = new Link(newData);
            first = node;
            last = node;
        }
        else {
            Link node = new Link(newData);
            node.nextLink = first;
            first = node;
            last.nextLink = first;
        }
    }

    public Link search(Object value) {
        Link currentLink = first;
        while(currentLink != null) {
            if(currentLink.t.equals(value)) {
                return currentLink;
            }
            currentLink = currentLink.nextLink;
        }
        System.out.println("This value is not in the Linked List");
        return null;
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
