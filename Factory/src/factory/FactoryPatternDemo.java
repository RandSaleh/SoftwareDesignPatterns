/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factory;

/**
 *
 * @author actc
 */
public class FactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        FactoryShape myFactory = new FactoryShape();
        
        Shape shape = myFactory.getShape("Squar");
        shape.drow();
        
        
        
        
    }
    
}
