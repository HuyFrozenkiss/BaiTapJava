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
public class Person {
    public String name;
    public int birthDay;
    public String idCard;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(int birthDay) {
        this.birthDay = birthDay;
    }

    public String getIdCard() {
        return idCard;
    }

    public void setIdCard(String idCard) {
        this.idCard = idCard;
    }
    public void showInfo()
    {
        System.out.println("Name : " + this.getName());
        System.out.println("Birthday :" + this.getBirthDay());
        System.out.println("ID CARD :" + this.getIdCard());
    }
}
