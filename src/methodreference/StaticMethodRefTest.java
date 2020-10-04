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
interface TestFuncInterface {

  void testRun(String name);
}
public class StaticMethodRefTest {

    public static void testMethod(String name) {
        System.out.println(name);
  }
  public static void main(String[] args) {
    TestFuncInterface obj = StaticMethodRefTest::testMethod;
    obj.testRun(" Static method reference executed. ");
  } }
