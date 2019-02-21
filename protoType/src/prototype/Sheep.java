/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

import java.util.logging.Level;
import java.util.logging.Logger;

public class Sheep implements Animal{

    @Override
    public Animal makeCopy() {
        Sheep sheepObj = null;
        
        try {
            sheepObj = (Sheep) super.clone();
            
            
           
        } catch (CloneNotSupportedException ex) {
            Logger.getLogger(Sheep.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return sheepObj ; 
        
        
    }
    
    public String toString(){
    return " Hello!, Iam Dolly ";
    }
    
    
    
    
}
