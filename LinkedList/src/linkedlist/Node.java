
package linkedlist;

public class Node {
    //properties
    Node next;
    int data; //assuming our data is int but could be other data type
    
    //constructors
    public Node(int newData) {
        data = newData;
        next = null;
    }
    
    public Node(int newData, Node newNext) {
        data = newData;
        next = newNext;
    }
    
    //Getter & Setters
    public int getData() {
        return data;
    }
    
    public Node getNext() {
        return next;
    }
    
    public void setData(int newData) {
        data = newData;
    }
    
    public void setNext(Node newNode) {
        next = newNode;
    }
}
