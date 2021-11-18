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
public class BaiTap11 {
    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Huy");
        person.setAge(20);
        person.setGender("Nam");
        person.showPerson();
        
        System.out.println("========Employee=======");
        Employee ex = new Employee();
        ex.setName("Nguyen Quang Huy");
        ex.setAge(20);
        ex.setGender("Nam");
        ex.setBasicSalary(2000000);
        ex.setCoefficient(2.5);
        ex.showEmployee();
        
        System.out.println("========Manager==========");
        Manager mn = new Manager();
        mn.setName("MTQ");
        mn.setAge(19);
        mn.setGender("Nu");
        mn.setBasicSalary(2000000);
        mn.setCoefficient(2.5);
        mn.setWage(200000);
        mn.showManager();
    }
}
