
package factorypatternenimydemo;
import java.util.Scanner;
public class FactoryPatternEnimyDemo {

    public static void main(String[] args) {
        FactoryEnemyShip myFactory = new FactoryEnemyShip();
        
        
        
        EnemyShip tempShip = null;
        Scanner userInput = new Scanner (System.in);
        String userOption ="";
        System.out.println("What type of Ship ! ");
        
        
        if (userInput.hasNextLine()){
        userOption = userInput.nextLine();
        
        }
        if (userOption !=null){
        if (userOption.equals("U"))
         myFactory.getEnemyShip("U").doStuff();
        else 
            if (userOption.equals("R"))
                myFactory.getEnemyShip("R").doStuff();
        
        }
        
        
    }
    
}
