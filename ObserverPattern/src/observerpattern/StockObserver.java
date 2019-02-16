/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

/**
 *
 * @author actc
 */
public class StockObserver implements Observer{
double applePrice,  googlePrice,  amazonPrice;


Subject sub ;

    public StockObserver(Subject sub) {
        this.sub = sub;
   
        sub.register(this);
    }




    @Override
    public void update(double applePrice, double googlePrice, double amazonPrice) {
        this.amazonPrice=amazonPrice;
        this.applePrice=applePrice;
        this.googlePrice=googlePrice;
        printPrices();
        
    }
    public void printPrices(){
      System.out.println(  "Amazon : " + amazonPrice + "\n apple : " +
                applePrice + "\n Google : " + googlePrice + "\n");

    }
    
    
    
    
    
    
    
}
