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
public class EnemyRobotAdapter implements EnemyAttacker {

    EnemyRobot enemyRobot ;

    public EnemyRobotAdapter(EnemyRobot enemyRobot) {
        this.enemyRobot = enemyRobot;
    }
    
    
    @Override
    public void assignDriver(String driver) {
        enemyRobot.reactHumen(driver);
    }

    @Override
    public void fireWearpon() {
        
        enemyRobot.snashWithHand();
    }

    @Override
    public void driveForward() {
        
        enemyRobot.walkForward();
        
    }
    
}
