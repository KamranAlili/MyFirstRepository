/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.genericslesson;

/**
 *
 * @author KamranAlili
 */
public class Main {

    public static void main(String[] args) {
      
        Container <User> container = new Container<>(new User());
       
        method1(container);
    }
  
    private static void method1(Container <?> container) { //Unbound wildcard
       Object obj = container.doo();
      
    }
 
    
}
