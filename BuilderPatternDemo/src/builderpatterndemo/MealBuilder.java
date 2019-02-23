
package builderpatterndemo;

public class MealBuilder {
    public Meal prepareVogMeal(){
    Meal meal = new Meal ();
    meal.addItems(new VegBurger());
    meal.addItems(new CocaCola());
    return meal;
    }
    public Meal prepareNonVogMeal(){
    Meal meal = new Meal ();
    meal.addItems(new ChickenBurger());
    meal.addItems(new Pepsi());
    return meal;
    }
 
}
