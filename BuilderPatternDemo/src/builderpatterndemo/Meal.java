/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatterndemo;

import java.util.ArrayList;

/**
 *
 * @author actc
 */
public class Meal {
    ArrayList <Item>items = new ArrayList<Item>();
    public void addItems (Item item){
    items.add(item);
        System.out.println("Item is added sucessfully ");
    }
    public float getPrice(){
    float sum=0 ;
    for (Item item : items){
    sum+=item.price();
    }
    System.out.println("The total price "+sum);
    return sum ; 
    }
    
    public void showItems(){
    for (Item item:items){
        System.out.println(item.name()+"  "+ item.price());
    }
    
    
    }
    
}
