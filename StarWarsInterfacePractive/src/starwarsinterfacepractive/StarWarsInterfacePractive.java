
package starwarsinterfacepractive;

import java.util.Random;

public class StarWarsInterfacePractive {

    public static Character summonCharacter() {
        Random rand = new Random();
        if (Math.abs(rand.nextInt()) % 2 == 0) {
            return new Enemy();
        } else {
            return new Hero();
        }
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        Enemy darthVader = new Enemy();
        Hero ObiWanKenobi = new Hero();
        darthVader.attack();
        ObiWanKenobi.attack();
        darthVader.heal();
        ObiWanKenobi.heal();
        //System.out.println("Enemy weapon: " + darthVader.weapon);
        System.out.println("Enemy weapon: " + darthVader.getWeapon());        
        //System.out.println("Hero weapon: " + ObiWanKenobi.weapon);
        System.out.println("Hero weapon: " + ObiWanKenobi.getWeapon()); 
        Character spy = summonCharacter(); //instantiate a Character
        spy.attack();
        spy.heal();
    }
    
}
