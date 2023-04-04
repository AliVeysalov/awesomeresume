/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bean.Student;
import bean.Teacher;
import java.util.HashMap;

/**
 *
 * @author ali.veysalov
 */
public class Main {

    public static void main(String[] args) {
        HashMap<Teacher, Student> students = new HashMap<>();
        Teacher teacher = new Teacher(1, "Sarkhan", "Rasullu");
        Teacher teacher2 = new Teacher(2, "Sarkhan2", "Rasullu2");
        students.put(teacher, new Student(1, "Eldar", "Novruzov"));
        students.put(teacher, new Student(2, "Azay", "Jalil"));

        System.out.println("get is called");
        students.get(teacher);
    }
//       public static void main(String[] args) {
//          Map<Integer,String> students= new HashMap<>();
//        students.put(1 ,"Azay");
//        students.put(2,"Eldar");
//        String value = students.get(1);
//        System.out.println("key=1, value="+value);
//    }
}
