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
interface TestFuncInterface3 {
    void testM3(String name);
}

public class ConstructorRefTest {

    public ConstructorRefTest(String name) {
        System.out.println("Constructor called : " + name);
    }
    public static void main(String[] args) {
        TestFuncInterface3 obj = ConstructorRefTest::new;
        obj.testM3(" new Object Created !!! ");
    }
}
