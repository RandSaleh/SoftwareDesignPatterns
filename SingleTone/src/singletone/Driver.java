/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletone;

/**
 *
 * @author actc
 */
public class Driver {
       public static void main(String[] args) {
        
           SingleTone instance1= SingleTone.accessSingleTone();
           SingleTone instance2 = SingleTone.accessSingleTone();
           boolean isEqual = (instance1==instance2);
           
           System.out.println("Is it  the same instance !! "+ isEqual);
           
           
        
    }
    
       
}
