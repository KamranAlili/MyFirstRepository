/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import java.util.Map;
import java.util.TreeMap;

/**
 *
 * @author KamranAlili
 */
public class Main {
    
    public static void main(String[] args) {
  
        
        
        Map <Integer, String> tmap = new TreeMap<>();
         
        tmap.put(new Integer(1), "");
        tmap.put(new Integer(20), "");
        tmap.put(new Integer(3), "");
        
        
        System.out.println(tmap.keySet());
        
        
//        HashMap<Teacher, Student> students = new HashMap<>();
//        Teacher teacher = new Teacher(1, "Sarkhan", "Rasullu");
//        Teacher teacher2 = new Teacher(2, "Sarkhan2", "Rasullu2");
//              
//        students.put(teacher, new Student(1, "Eldar", "Novruzov"));
//        students.put(teacher2, new Student(2, "Azay", "Jalil"));
//              
//        System.out.println("get is called");
//        students.get(teacher2);
   
    }
}

