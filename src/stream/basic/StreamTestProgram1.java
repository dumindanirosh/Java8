/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stream.basic;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * Stream API basically introduced for represent similar operations which used
 * by SQL Stream API introduced with Java8 process large collections of data
 * efficiently and effectively Further Stream API, so much powerful , it
 * supports with Multi Core Architecture. (Multi Threaded) Typical SQL Select
 * Query vs Java Stream API SELECT EMPLOYEE_ID,DEPT_NAME FROM T_EMPLOYEE WHERE
 * DEPT_NAME='IT' GROUP BY EMPLOYEE_ID,DEPT_NAME ORDER BY DESC; STREAM() = TABLE
 * FILTER() = WHERE DEPT_NAME='IT' MAP() = EMPLOYEE_ID,DEPT_NAME
 *
 *
 * @author User
 */
public class StreamTestProgram1 {

    public static void main(String[] args) {

        List<String> nameList = Arrays.asList("Diyana", "Sham", "Ama", "Neel", "John", "Kennedy", "Anne");

        // Excercise 1
        // Print the Name which starts with A
        // Answer 1 : Stream Using with Lambda Expression
        System.out.println("------------------------------------------");
        System.out.println("Stream Using with Lambda Expression");
      
        nameList.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(name -> System.out.println(name));

        // Answer 2 : Using using with Annoymous object
        System.out.println("------------------------------------------");
        System.out.println("Using using with Annoymous object");
      
        nameList.stream()
                .filter(new Predicate<String>() {

                    @Override
                    public boolean test(String name) {

                        if (name.startsWith("A")) {
                            return true;
                        } else {
                            return false;
                        }
                    }

                })
                .forEach(new Consumer<String>() {

                    @Override
                    public void accept(String name) {
                        System.out.println("Name : " + name);
                    }

                });
        System.out.println("------------------------------------------");
        System.out.println("Stream Using with Lambda Expression and Method Reference");
        // Answer 3 : Stream Using with Lambda Expression and Method Reference
        nameList.stream()
                .filter(name -> name.startsWith("A"))
                .forEach(System.out::println);

    }

}
