/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package abstractfactorydemo;

/**
 *
 * @author actc
 */
public class AbstractFactoryDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        AbstractFactory myFactory = FactoryProducer.getFactory(true);
        
        Shape myShape = myFactory.getShape("SQUARE");
        myShape.drow();
        
        myShape=myFactory.getShape("RECTANGLE");
        myShape.drow();
        
        
        myFactory=FactoryProducer.getFactory(false);
        myShape=myFactory.getShape("SQUARE");
        myShape.drow();
        
        
    }
    
}
