/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package methodreference;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author P0502878
 */
public class MethodRefWithThread {

    public static void runNewThread() throws RuntimeException {

        for (int x = 0; x < 5; x++) {
            System.out.println("X : " + x
                    + " Thread : " + Thread.currentThread().getName());
        }
    }
    public static void main(String[] args) {

        Thread t = new Thread(MethodRefWithThread::runNewThread);
        t.start();
        for (int y = 0; y < 5; y++) {
            System.out.println("Y : " + y
                    + " Thread : " + Thread.currentThread().getName());
        }    }  }
