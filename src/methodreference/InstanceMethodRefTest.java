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
interface TestFuncInterface2 {
    void testMethod(String name);
}
public class InstanceMethodRefTest {

    public static void testM(String name)throws RuntimeException {
        System.out.println(name);
    }
    public static void main(String[] args) throws Exception {
       TestFuncInterface2 obj = InstanceMethodRefTest::testM;
       obj.testMethod(" Instance method reference executed. ");
}   }
