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
@FunctionalInterface
interface Test {

    void test();

}

class Test2 implements Runnable {

    @Override
    public void run() {
        System.out.println("Runnnnnn");
    }

}

public class MethodReference4 {

    public MethodReference4() {

        System.out.println("MethodReference4 Constructor : ");
    }

    public MethodReference4(Test s) {

        System.out.println("MethodReference4 Constructor : " + s);
    }

    public static String ThreadStatus2() {
        System.out.println("Thread Status" + Thread.currentThread().getName());
        return "t";
    }

    public static void main(String[] args) {

        // MethodReference4 obj = new MethodReference4(MethodReference4::ThreadStatus2);
        System.out.println("Thread Status" + Thread.currentThread().getName());
        Thread t = new Thread(MethodReference4::ThreadStatus2);

        t.start();
    }

}
