/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author nguye
 */
public class Employee {
    public String id;
    public String firstName;
    public String lastName;
    public int salaryMonthly;

    public Employee() {
    }

    public Employee(String id, String firstName, String lastName, int salaryMonthly) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salaryMonthly = salaryMonthly;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public int getSalaryMonthly() {
        return salaryMonthly;
    }

    public void setSalaryMonthly(int salaryMonthly) {
        this.salaryMonthly = salaryMonthly;
    }
    
    public String getFullName(String firstName, String lastName)
    {
        return firstName + " " + lastName;
    }
    public int getSalaryYearly(int salaryMonthly)
    {
        return salaryMonthly*12;
    }
    public void showInfo()
    {
        System.out.println("ID : " + this.getId());
        System.out.println("First name " + this.getFirstName() );
        System.out.println("Last name  " + this.getLastName());
        System.out.println("Full Name " + this.getFullName(firstName, lastName));
        System.out.println("Salary Monthy " + this.getSalaryMonthly());
        System.out.println("=> Salary Yearly " + this.getSalaryYearly(salaryMonthly));
    }
}
