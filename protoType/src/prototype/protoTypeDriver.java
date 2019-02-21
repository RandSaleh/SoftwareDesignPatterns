
package prototype;

public class protoTypeDriver {

    public static void main(String[] args) {
        
       CloneFactory factory = new CloneFactory (); 
        
        Sheep sally = new Sheep ();
        Sheep clonedSally = (Sheep)factory.getClone(sally);
        System.out.println("The origin  : "+ sally);
        System.out.println("The cloned  : "+ clonedSally);
        System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(sally)));
        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(clonedSally)));
        //--------------------------------------------------------------------------
        
        System.out.println("Creating clone for a dog class ");
        Dog originDog= new Dog();
        Dog copyDog = (Dog) factory.getClone(originDog);
        
        System.out.println("The origin  : "+ originDog);
        System.out.println("The cloned  : "+ copyDog);
        System.out.println("Sally HashCode: " + System.identityHashCode(System.identityHashCode(originDog)));
        System.out.println("Clone HashCode: " + System.identityHashCode(System.identityHashCode(copyDog)));
        
    }
    
}
