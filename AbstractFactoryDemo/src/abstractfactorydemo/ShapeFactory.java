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
public class ShapeFactory extends AbstractFactory{

    @Override
    Shape getShape(String name) {
          if (name.equalsIgnoreCase("SQUARE"))
            return new Square();
          if (name.equalsIgnoreCase("RECTANGLE"))
            return new Rectangle();
          
          return null ;
        
        
    }
    
}
