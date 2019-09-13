
package starwarsinterfacepractive;


public interface Character {
    public String base = "character"; //you can do properties, has to be publich, is final so can't be changed
    public void attack(); //no implementation
    public void heal(); //no implementation
    public String getWeapon();
}
