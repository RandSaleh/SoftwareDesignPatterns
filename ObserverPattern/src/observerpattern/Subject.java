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
public interface Subject {
    
  
  public   void register(Observer o);
  public void deRegister(Observer o);
  public  void update(double applePrice,double googlePrice,double amazonPrice);
    
}



