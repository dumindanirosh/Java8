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
interface Operation {

    double calcInterest(double amount, double interest);
}

public class SimpleCalcTest {

    public static void main(String[] args) {

        Operation o = new Operation() {
            @Override
            public double calcInterest(double amount, double interest) {

                return amount * interest;
            }
        };

        System.out.println("Calc Interest : " + o.calcInterest(10000, 0.05));

        Operation o2 = (a, i) -> {
            return a * i;
        };
        
        System.out.println("Calc Interest : " + o2.calcInterest(20000, 3));
        
        
      //  System.out.println("Calc Interest :" + );
    }

}
