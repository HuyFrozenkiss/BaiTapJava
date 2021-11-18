/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

/**
 *
 * @author nguye
 */
public class Teacher extends Person {
    public int salary;

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
    public void showTeacher()
    {
        super.showInfo();
        System.out.println("Salary :"  + this.getSalary());
    }
}
