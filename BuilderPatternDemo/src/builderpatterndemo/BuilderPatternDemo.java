/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package builderpatterndemo;

public class BuilderPatternDemo {

    public static void main(String[] args) {
        
        MealBuilder mealBuilder= new MealBuilder();
        Meal vegMeal = mealBuilder.prepareVogMeal();
        vegMeal.showItems();
        vegMeal.getPrice();
        
        Meal nonVegMeal = mealBuilder.prepareNonVogMeal();
        nonVegMeal.showItems();
        nonVegMeal.getPrice();

       
        
        
        
    }
    
}
