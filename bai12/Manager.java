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
public class Manager extends Person{
    public int monthlySpend;

    public int getMonthlySpend() {
        return monthlySpend;
    }

    public void setMonthlySpend(int monthlySpend) {
        this.monthlySpend = monthlySpend;
    }
    public void showManager()
    {
        super.showInfo();
        System.out.println("Monthly Spendly :" + this.getMonthlySpend());
    }
}
