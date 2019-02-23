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
public class VegBurger extends Burger{

    @Override
    public String name() {
        return "VogBurger";
    }

    @Override
    public float price() {
        return 40;
    }
    
}
