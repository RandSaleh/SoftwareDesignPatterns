
package factorypatternenimydemo;

public class FactoryEnemyShip {
   
    public EnemyShip getEnemyShip (String name){
    
    if (name ==null )return null ;
    
    if (name.equals("U"))return new UFOEnemyShip();
    if (name.equals("R")) return new RocketEnemyShip();
    
    return null; 
    
    
    }
    
    
}
