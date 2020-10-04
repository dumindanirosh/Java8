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

interface SystemOutTest{

    void print(String str)throws Exception;
}
public class MethodRefSOUT {
    
    public static void main(String[] args) throws Exception {
  
        SystemOutTest sout = System.out::println;
        
        sout.print("Print Info with Method Ref.");
  
                    }
}
