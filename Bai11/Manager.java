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
public class Manager extends Employee {
    public double wage;

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    public double salaryManager()
    {
        return coefficient* basicSalary + wage;
    }
    
    public void showManager()
    {
        super.showEmployee();
        System.out.println("Wage :" + this.getWage());
        System.out.printf("Salary Manager : %.2f ", salaryManager());
    }
}
