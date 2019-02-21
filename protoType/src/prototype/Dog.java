/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author actc
 */
public class Dog implements Animal{

    @Override
    public Animal makeCopy() {
        Dog sampleDog = null ; 
        
        try {
            sampleDog= (Dog)super.clone();
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Dog.class.getName()).log(Level.SEVERE, null, ex);
        }
        return sampleDog;
        
    }
    
    public String toString(){
    return "This is a Dog now ! ";
    }
    
    
}
