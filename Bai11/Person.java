/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai11;

/**
 *
 * @author nguye
 */
public class Person {
    public String name;
    public int age;
    public String gender;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public void showPerson() {
        System.out.println("Name :" + this.getName());
        System.out.println("Age : "+ this.getAge());
        System.out.println("Gender : " +this.getGender());
    }
    
}
