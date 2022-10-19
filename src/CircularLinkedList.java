/*********************
 *
 * Author: Arjun Maitra and Elliot Duke
 * Assignment: Monopoly, Circular Linked List Class
 * Date due: 10/26
 */
public class CircularLinkedList<T> {

    public T t;
    Link first;

    public CircularLinkedList(T t) {
        this.t = t;
    }

    public void insertFirst(T newData) {
        Link node = new Link(newData);
        node.nextLink = first;
        first = node;
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
}
