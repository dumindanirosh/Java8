/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreference;

/**
 *
 * @author P0502878
 */
interface Sayable {

    void say(int x, double y,String ss);
    
}

interface Sayable2 {
    int say2(String x);
}



public class MethodReference3 {

    public static void saySomething(int x, double f, String s) {
        System.out.println("Hello, this is static method. : " + x +  " f : " + f + " s : " + s);
    }
    
    

    public static void main(String[] args) {
        // Referring static method  
        Sayable sayable = MethodReference3::saySomething;
        // Calling interface method  
        sayable.say(10,20.5, "add");
        
        
        Sayable2 sayable2 = Integer::parseInt;
        
        System.out.println("say2 :"  + (sayable2.say2("10")+5));
    }
}
