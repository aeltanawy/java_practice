
package starwarsinterfacepractive;


public class Enemy implements Character { //you have to impelement all of Character methods inside Character interface, and has to be exact
    
//can have properties
    public String weapon = "Lightsaber";
    
    //a constructor
    public Enemy() {
    }
    
    public String getWeapon() {
        return weapon;
    }
    
    public void attack() {
        System.out.println("The enemy attacks you");
    }
    
    //@Override, no need for this
    public void heal() {
        System.out.println("The enemy heals himself");
    }
    
    public void weaponDraw() {
        System.out.println("draw out the weapon");
    }
}
