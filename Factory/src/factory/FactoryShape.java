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
public class FactoryShape {
    
    public Shape getShape(String typeName){
    if (typeName ==null)return null ;
    if (typeName.equals("Rectangle")) 
        return new Rectangle();
    if (typeName.equals("Squar")) 
        return new Squar();
    
     if (typeName.equals("Triangle")) 
        return new Triangle();
      
         return null ;
    
        }
    
}
