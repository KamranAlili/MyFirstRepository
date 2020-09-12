/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.collectionsapipart2;

import java.util.Objects;

/**
 *
 * @author KamranAlili
 */
public class Teacher{
    
    private int age;
    private String name;
    private String surname;

    public Teacher(int age, String name, String surname) {
        this.age = age;
        this.name = name;
        this.surname = surname;
    }

  
      
    @Override
    public int hashCode() {
        int a = 4;
        a = 89 * a + this.age;
        a = 89 * a + Objects.hashCode(this.name);
        a = 89 * a + Objects.hashCode(this.surname);
        return a;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Person other = (Person) obj;
        if (this.age != other.age) {
            return false;
        }
        if (!Objects.equals(this.name, other.name)) {
            return false;
        }
        if (!Objects.equals(this.surname, other.surname)) {
            return false;
        }
        return true;
    }
}
