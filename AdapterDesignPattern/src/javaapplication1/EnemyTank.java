/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


package javaapplication1;
import java.util.*;
/**
 *
 * @author randsaleh
 */
public class EnemyTank implements EnemyAttacker{
Random generator = new Random();

    @Override
    public void assignDriver(String driver) {
        System.out.println(driver+" is driving the Tank");
    }

    @Override
    public void fireWearpon() {
        int numRandom = generator.nextInt(10);
        System.out.println("THe amount of damage is "+numRandom);
        
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5);
        System.out.println("THe movement is "+movement+" forwarding ");
        
    }
    
}
