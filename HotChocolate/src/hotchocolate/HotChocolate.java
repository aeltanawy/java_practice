
package hotchocolate;

import java.util.concurrent.TimeUnit;

public class HotChocolate {

    public static final double tooHot = 185;
    public static final double tooCold = 160;
    
    public static void drinkHotChocolate(double cocoTemp) throws TooHotException,
            TooColdException {
        if (cocoTemp >= tooHot) {
            throw new TooHotException();
        } else if (cocoTemp <= tooCold) {
            throw new TooColdException();
        }
    }
    
    public static void main(String[] args) throws TooHotException, TooColdException, 
            InterruptedException {
        // TODO code application logic here
        double currentCocoTemp = 140;
        boolean wrongTemp = true;
        while (wrongTemp) {
            try {
                drinkHotChocolate(currentCocoTemp);
                System.out.println("That cocoa was good!");
                wrongTemp = false;
            } catch (TooHotException e1) {
                System.out.println("That is too hot!!!!");
                currentCocoTemp -= 5;
            } catch (TooColdException e2) {
                System.out.println("That is too cold!!!");
                currentCocoTemp += 5;
            }  
            TimeUnit.SECONDS.sleep(2);
        }
        System.out.println("And it's gone.");
    }
    
}
