/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionsapipart2;

import java.net.Socket;
import java.util.HashMap;

/**
 *
 * @author KamranAlili
 */
public class Main {
    
    public static void main(String[] args) {
       
       Student s = new Student(25, "Azay", "Jalil");
       Student s1 = new Student(25, "Azay", "Jalil");
       
       HashMap<Student, Integer> map = new HashMap<>();
       map.put(s, 1);
       map.put(s1, 2);
       
       System.out.println(map);
    }  
    
    private static Socket method() {
         Socket socket = null;   
         
         return socket;
    }
    
}
