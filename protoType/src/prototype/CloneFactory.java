/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prototype;

/**
 *
 * @author actc
 */
public class CloneFactory {
    
    /// This Factory can recieve any subclass from animal and call the mentod in this interface 
    
    public Animal getClone (Animal sampleAnimal){
    return sampleAnimal.makeCopy();
    
    }
    
    
}
