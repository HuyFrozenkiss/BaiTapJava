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
public class Student extends Person {
    public int tuitionFee;

    public int getTuitionFee() {
        return tuitionFee;
    }

    public void setTuitionFee(int tuitionFee) {
        this.tuitionFee = tuitionFee;
    }
    public void showStudent()
    {
        super.showInfo();
        System.out.println("Tuition fee owed :" + this.getTuitionFee());
    }
}
