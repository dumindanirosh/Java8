/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package functional_interface;

/**
 *
 * @author duminda
 * interface which maintain only one abstract method called Functional Interface
 */
//@FunctionalInterface
public interface Manager {
    
    public void achieveTarget();
  
    // Using default keyword can create concrete method 
     default void checkTargets(){  
        System.out.println("Check Targets");  
    }  
}
