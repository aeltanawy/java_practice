
package animal;

public class Cat extends Animal {
    
    public Cat(int age) {
        super(age);
        System.out.println("A cat has been created with age " + age + ".");
    }
    
    public void meaw() {
        System.out.println("A cat meaws.");
    }
    
    public void prance() {
        System.out.println("A cat is prencing.");
    }
}
