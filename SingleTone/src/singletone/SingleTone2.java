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
public class SingleTone2 {
    private static SingleTone2 instance = new SingleTone2();
    
    private SingleTone2(){}
    
    public static synchronized SingleTone2 getAccess2(){
    
    if (instance ==null)
        instance = new SingleTone2();
    
    return instance;
        
    }
    
    
}
