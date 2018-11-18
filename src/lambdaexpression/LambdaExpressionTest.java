/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lambdaexpression;

/**
 *
 * @author duminda
 * 
 * 
 * 
 */
public class LambdaExpressionTest {
   
    /*
    Lambda Expression Syntax
    parameter -> expression body
    
    1. Data Type Declaration is Optional 
    2. Parenthesis optional
    3. Curly Braces are option
    4. Return keyword option
  
    
    */
    public static final double INTERST = 0.1;
    
    public static void main(String[] args) {
        
    //   LambdaExpressionTest 
    //  1. Parameters without Data Type
    Account account1 = (a,b) -> a * INTERST * b;
    
    System.out.println("Account1 Interest : " + account1.calcInterest(10000, 5));
    
    //  2. Parameters with Data Type
    Account account2 = (double a, int b) -> a * INTERST * b;
    
    System.out.println("Account2 Interest : " + account2.calcInterest(20000, 10));
    
    // 3. If return statement mention, curly braces are required .
    Account account3 = (double a, int b) ->  { return a * INTERST * b; } ; 
    
    System.out.println("Account3 Interest : " + account3.calcInterest(30000, 5));
    
    // 4. Paramterters can be empty
    PrintService printService = () -> System.out.println("Hiii... Im Print Service");
    printService.printMessage();
    
    //  5. Parameters without Data Type
    
    PrintService2 printService2 = (msg) -> System.out.println("Hii Print Message : " + msg);
    printService2.printService("Hii Testing Printing Message 2");
  
    //  6. Parameters with Data Type
    
    PrintService2 printService3 = (String msg) -> System.out.println("Hi Print Message : " + msg);
    printService3.printService("Hii Testing Printing Message 3");
    
    //  5. Parameters with Curly Braces
    PrintService2 printService4 = (String msg) -> { System.out.println("Hi Print Message : " + msg);};
    printService4.printService("Hii Testing Printing Message 4");
  
    }
    // Functional Interface
    interface Account{
        double calcInterest(double amount, int years);
       // double calcInterest2(double amount, int years, double interest);
 
    }
    
    interface PrintService{
        void printMessage();
    }
    
    interface PrintService2{
        void printService(String msg);
    }
}
