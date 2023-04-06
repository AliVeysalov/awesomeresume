/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import bean.Student;
import bean.Teacher;
import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author ali.veysalov
 */
public class Main {

    public static void main(String[] args) {
//        HashMap<String, Integer> students = new HashMap<>();
//        String s1 = "FB";
//        String s2 = "Ea";
//        System.out.println(s1.hashCode() + " " + s2.hashCode());
//        students.put(s1, 1);
//        students.put(s2, 2);

//        HashMap<Teacher, Student> students = new HashMap<>();
//        Teacher teacher = new Teacher(1, "Sarkhan", "Rasullu");
//        Teacher teacher2 = new Teacher(2, "Sarkhan2", "Rasullu2");
//        students.put(teacher, new Student(1, "Eldar", "Novruzov"));
//        students.put(teacher, new Student(2, "Azay", "Jalil"));
//
//        System.out.println("get is called");
//        students.get(teacher2);
        Map<Teacher, Student> students = new TreeMap<>();
        Teacher teacher = new Teacher(1, "Sarkhan", "Rasullu");
        Teacher teacher2 = new Teacher(2, "Sarkhan2", "Rasullu2");
        Teacher teacher3 = new Teacher(3, "Sarkhan3", "Rasullu3");

        students.put(teacher, new Student(1, "Eldar", "Novruzov"));
        students.put(teacher, new Student(2, "Azay", "Jalil"));
        students.put(teacher, new Student(3, "Nargiz", "Yusifli"));

        System.out.println(students.keySet());
        System.out.println(students.values());

//       Map m= Collections.synchronizedMap(new HashMap<>());
//        System.out.println(m.getClass().getName());
    }

//       public static void main(String[] args) {
//          Map<Integer,String> students= new HashMap<>();
//        students.put(1 ,"Azay");
//        students.put(2,"Eldar");
//        String value = students.get(1);
//        System.out.println("key=1, value="+value);
//    }
}
