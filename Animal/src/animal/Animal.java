
package animal;

public class Animal {
    
    private int age; //if provate int age; then you can't call d.age, it can only be called inside Animal
    //can do a getter to make a private variable access outside of Animal.
    
    public Animal(int age) {
        this.age = age;
        System.out.println("An animal has been created with age " + this.age + "!");
    }
    
    public void eat() {
        System.out.println("An animal is eating.");
    }
    
    public int getAge() {
        return this.age;
    }
    
    //object = superclass
    //Animal = subclass
    public static void main(String[] args) {
        // TODO code application logic here
        Animal a = new Animal(5);
        Dog d = new Dog();
        Cat c = new Cat(7);
        d.ruff();
        //System.out.println(d.age);
        System.out.println(d.getAge());
        c.meaw();
        //System.out.println(c.age);
        System.out.println(c.getAge());
        a.eat();
        d.eat();
        d.eat();
        c.eat();
        d.run();
        c.prance();
        
        Animal o = new Dog(); //OK
        //Dog o = new Animal(); //not OK
        o.eat();
        
        
        
    }
    
}
