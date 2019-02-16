/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package singletone;

public class SingleTone {
private static SingleTone instance = new SingleTone() ;
private SingleTone(){

}

public static SingleTone accessSingleTone(){
return instance;
}

 
}
