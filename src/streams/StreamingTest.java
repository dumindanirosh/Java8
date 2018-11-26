/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 *
 * @author duminda
 */
public class StreamingTest {

    public static void main(String[] args) {

        Student s1 = new Student("AAA", 76);
        Student s2 = new Student("BBB", 45);
        Student s3 = new Student("CCC", 85);
        Student s4 = new Student("DDD", 30);
        Student s5 = new Student("EEE", 66);
        Student s6 = new Student("FFF", 90);

        List<Student> studentList = new ArrayList<Student>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);
        studentList.add(s4);
        studentList.add(s5);
        studentList.add(s6);

        // Create Student list which having marks > 50 (Without Streaming)
       List<Student> newStudentList1 = getStudentList(studentList);
       
       System.out.println("New Student List Size : " + newStudentList1.size());
       
        // Create Student list which having marks > 50 (Without Streaming)
       List<Student> newStudentList2 = getStudentList2(studentList);
       
       System.out.println("New Student List Size : " + newStudentList2.size());
       
        
    }

    //Create List without Java 8 Streaming
    public static List getStudentList(List<Student> studentList) {

        List<Student> markList = new ArrayList<Student>();

        for (Student s : studentList) {
            if (s.marks > 50) {
                markList.add(s);
            }
        }
      return markList;    
    }
    
    //Create List with Java 8 Streaming
    public static List getStudentList2(List<Student> studentList) {

        List<Student> markList = studentList.stream()
                                 .filter(s -> s.marks > 50)
                                 .map(s -> s)
                                 .collect(Collectors.toList());
      return markList;    
    }

}
