
package linkedlist;

public class Node<D> {
    //properties
    Node next;
    D data; //assuming our data is int but could be other data type
    
    //constructors
    public Node(D newData) {
        data = newData;
        next = null;
    }
    
    public Node(D newData, Node newNext) {
        data = newData;
        next = newNext;
    }
    
    //Getter & Setters
    public D getData() {
        return data;
    }
    
    public Node<D> getNext() {
        return next;
    }
    
    public void setData(D newData) {
        data = newData;
    }
    
    public void setNext(Node<D> newNode) {
        next = newNode;
    }
}
