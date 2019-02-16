/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerpattern;

public interface Observer {
    
  public void update(double applePrice,double googlePrice,double amazonPrice);  
  ///// here we put the data that we want to update 
}
