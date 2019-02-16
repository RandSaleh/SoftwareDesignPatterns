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
public class ObserverPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        StockGrabber subject = new StockGrabber();
        
        StockObserver observer1 = new StockObserver(subject);
        
        subject.setApplePrice(50);
        subject.setAmazonPrice(500);
        subject.setGooglePrice(508);

        
        
        
    }
    
}
