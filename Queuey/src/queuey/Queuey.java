
package queuey;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class Queuey<D> {

    LinkedList<D> queue = new LinkedList();
    
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
    public void enqueue(D n) {
        queue.addLast(n);
    }
    
    // dequeuing an item
    public D dequeue() {
        return queue.remove(0);
    }
    
    // peek at first item
    public D peek() {
        return queue.get(0); //(int) called casting
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
        
        Queue q = new LinkedList<>(); //built in queue, can't instanstiate abstract or interface classes
        q.add("hi");
        q.add("there");
        System.out.println(q.remove() + " ");
        System.out.println(q.remove() + ".");
        
        
        Queuey p = new Queuey();
        p.enqueue("Hi");
        p.enqueue("there");
        System.out.println(p.dequeue() + " ");
        System.out.println(p.dequeue() + ".");

        Queuey i = new Queuey();
        i.enqueue(5);
        i.enqueue(7);
        i.enqueue(6);
        System.out.println("First out " + i.dequeue());
        System.out.println("Peek at first item " + i.peek());
        System.out.println("Third out " + i.dequeue());

        
    }
    
}
