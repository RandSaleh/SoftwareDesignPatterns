/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

import java.util.ArrayList;

/**
 *
 * @author actc
 */
public class StockGrabber implements Subject  {

    ArrayList <Observer> listObservers ;
    
    double applePrice;
    double googlePrice;
    double amazonPrice;

    public StockGrabber() {
        listObservers=new ArrayList<Observer>();
        
    }
    
    
    @Override
    public void register(Observer o) {
        this.listObservers.add(o);
    }

    @Override
    public void deRegister(Observer o) {
        this.listObservers.remove(o);
    }

    @Override
    public void update(double applePrice,double googlePrice,double amazonPrice) {
        
        for (Observer temp :listObservers){
        temp.update(applePrice, googlePrice, amazonPrice);
        }
        
        
        
    }

    public double getApplePrice() {
        return applePrice;
    }

    public void setApplePrice(double applePrice) {
        this.applePrice = applePrice;
        update(applePrice, googlePrice, amazonPrice);
    }

    public double getGooglePrice() {
        return googlePrice;
    }

    public void setGooglePrice(double googlePrice) {
        this.googlePrice = googlePrice;
        update(applePrice, googlePrice, amazonPrice);

    }

    public double getAmazonPrice() {
        return amazonPrice;

    }

    public void setAmazonPrice(double amazonPrice) {
        this.amazonPrice = amazonPrice;
        update(applePrice, googlePrice, amazonPrice);

    }
    
}
