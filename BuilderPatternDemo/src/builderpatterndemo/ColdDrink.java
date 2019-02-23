/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatterndemo;

/**
 *
 * @author actc
 */
public abstract  class ColdDrink implements Item {
    

    @Override
    public Packing paking() {
        return new Bottle();
    }
    
    
    
    
}
