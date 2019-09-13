
package person;

import static person.HairColor.*;

public class Person {

    HairColor hairColor = BLONDE;
    
    public Person() { //our constructor
        
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        Person peterParker = new Person();
        Person spiderMan = peterParker; //an alias
        
        peterParker.hairColor = PINK;
        
        System.out.println("Hair color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair color of Spiderman: " + spiderMan.hairColor); 
        
        spiderMan.hairColor = BLACK;
        
        System.out.println("Hair color of Peter Parker: " + peterParker.hairColor);
        System.out.println("Hair color of Spiderman: " + spiderMan.hairColor); 
    }
    
}
