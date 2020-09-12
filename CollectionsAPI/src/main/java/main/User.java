/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author KamranAlili
 */
public class User implements Comparable<User>{
    public int age;
    
    public User(int age) {
       this.age = age;
    }
  
    @Override
    public int compareTo(User o) {
        int result = 0;
        if(o.age == this.age){
           result = 0;
        }else if(o.age > this.age) {
        result = 1;
        }else if(o.age < this.age) {
         result = -1;
        }
        return result;
    }

}
