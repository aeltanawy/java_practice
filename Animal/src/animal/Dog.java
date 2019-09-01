
package animal;

public class Dog extends Animal {
    
    //constructor
    public Dog() {
        super(15); //referencing public Animal() consrtuctor
        System.out.println("A dog has been created.");
    }
    
    public void eat() {
        System.out.println("A dog is eating.");
    }
    
    public void sleep() {
        System.out.println("A dog is sleeping.");
    }
    
    //public abstract eat(); if you want a more specific type of dog to be eating and not all
    
    public void ruff() {
        System.out.println("The dog says ruff.");
    }
    
    public void run() {
        System.out.println("A dog is running.");
    }
    
}
