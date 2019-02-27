/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author randsaleh
 */
public class AdapterDesignPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        EnemyTank enemyTank = new EnemyTank();
        System.out.println("The EnemyTank  ... ");
        enemyTank.assignDriver("RAND");
        enemyTank.driveForward();
        enemyTank.fireWearpon();
        System.out.println("The robot now  ......");
        
        EnemyRobot robot = new EnemyRobot();
        robot.reactHumen("NOOR");
        robot.snashWithHand();
        robot.walkForward();
        System.out.println("The AdapterRobot now ...... ");
        
        
        EnemyAttacker enemyRobotAdapter = new EnemyRobotAdapter(robot);
        
        enemyRobotAdapter.assignDriver("MARK");
        
        enemyRobotAdapter.driveForward();
        enemyRobotAdapter.fireWearpon();
        
        
        
    }
    
}
