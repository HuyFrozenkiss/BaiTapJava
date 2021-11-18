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
public class Employee extends Person{
    public double basicSalary;
    public double coefficient;

    public double getBasicSalary() {
        return basicSalary;
    }

    public void setBasicSalary(double basicSalary) {
        this.basicSalary = basicSalary;
    }

    public double getCoefficient() {
        return coefficient;
    }

    public void setCoefficient(double coefficient) {
        this.coefficient = coefficient;
    }

    public double salary()
    {
        return this.coefficient* this.basicSalary;
    }
    
    public void showEmployee() 
    {
        super.showPerson();
        System.out.println("Basic Salary :" + this.getBasicSalary());
        System.out.println("Coefficient : "+ this.getCoefficient());
        System.out.printf("Salary : %.2f\n",salary() );
    }

    
    
    
    
}
