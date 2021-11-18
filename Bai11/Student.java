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
public class Student extends Person {
    public String code;

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }
    public void showStudent()
    {
        super.showPerson();
        System.out.println("Code : " + this.getCode());
    }
}
