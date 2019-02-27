/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;
import java.util.Random;
/**
 *
 * @author randsaleh
 * The Adapter will send the method calls to obj that use the EnemyAttacker interface to right methods 
 * defined in the EnemyRobot 
 */

public class EnemyRobot {
    Random generator = new Random ();
    public void snashWithHand(){
    
    int amountDamage = generator.nextInt(10);
        System.out.println("THe robot cause damage "+amountDamage+" by hands");
    
    
    }
    
    public void walkForward(){
    int stepMovement = generator.nextInt(5)+1;
        System.out.println("THe robot move within "+stepMovement );
    
    }
    
public void reactHumen (String driverName){
    System.out.println("THe robot is tramps on "+driverName);


}


    
    
}
