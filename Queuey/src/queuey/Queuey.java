
package queuey;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queuey {

    LinkedList queue = new LinkedList();
    
    // making a queue instance
    public Queuey() {
        queue = new LinkedList();
    }
    
    // is our queue empty
    public boolean isEmpty() {
        return queue.isEmpty();
    }
    
    // what is the size of our queue
    public int size() {
        return queue.size();
    }
    
    // Enqueueing an item
    public void enqueue(String n) {
        queue.addLast(n);
    }
    
    // dequeuing an item
    public String dequeue() {
        return (String) queue.remove(0);
    }
    
    // peek at first item
    public String peek() {
        return (String) queue.get(0); //(int) called casting
        //return (int) queue.get(0); //(int) called casting
    }

    public static void main(String[] args) {
        // TODO code application logic here
        Stack<String> stacky = new Stack<>(); //built in stack
        stacky.push("there");
        stacky.push("hi");
        System.out.println(stacky.pop() + "! ");
        System.out.println("Size: " + stacky.size());
        stacky.peek();
        System.out.println(stacky.pop() + " ");
        
        Queue<String> q = new LinkedList<>(); //built in queue, can't instanstiate abstract or interface classes
        q.add("hi");
        q.add("there");
        System.out.println(q.remove() + " ");
        System.out.println(q.remove() + ".");
        
        
        //Queuey q = new Queuey();
        //q.enqueue("Hi");
        //q.enqueue("there");
        //System.out.println(q.dequeue() + " ");
        //System.out.println(q.dequeue() + ".");


        //q.enqueue(5);
        //q.enqueue(7);
        //q.enqueue(6);
        //System.out.println("First out " + q.dequeue());
        //System.out.println("Peek at first item " + q.peek());
        //System.out.println("Third out " + q.dequeue());

        
    }
    
}
