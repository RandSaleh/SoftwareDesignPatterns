
package factorypatternenimydemo;
abstract public  class EnemyShip {
    /// Bad stuff 
    String name;
    double amountDamge;
    //// common things btween the sub classess 

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getAmountDamge() {
        return amountDamge;
    }

    public void setAmountDamge(double amountDamge) {
        this.amountDamge = amountDamge;
    }
    
    ///////// behavioural methods 
    
    public void followHero(){
        System.out.println(getName()+" is following the hero ! ");
    }
    
    public void displayOnScreen(){
        System.out.println(getName()+" is on the screen ! ");
    }
    
    public void enemyShoot(){
        System.out.println(getName()+"  is shooting ! ");
    }
    
    
   public void doStuff(){
   displayOnScreen();
   followHero();
   enemyShoot();
   } 
    
    
}
