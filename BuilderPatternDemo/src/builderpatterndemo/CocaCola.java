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
public class CocaCola extends ColdDrink{

    @Override
    public String name() {
        return "CocaCola";
    }

    @Override
    public float price() {
        return 7;
    }
    
}
