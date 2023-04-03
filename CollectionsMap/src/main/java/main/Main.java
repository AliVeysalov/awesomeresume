/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author ali.veysalov
 */
public class Main {
    public static void main(String[] args) {
          Map<Integer,String> students= new HashMap<>();
        students.put(1 ,"Azay");
        students.put(2,"Eldar");
        String value = students.get(1);
        System.out.println("key=1, value="+value);
    }
}
