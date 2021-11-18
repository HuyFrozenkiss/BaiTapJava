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
public class Rectangle {
    public float lenght;
    public float width;

    public Rectangle() {
    }

    public Rectangle(float lenght, float width) {
        this.lenght = lenght;
        this.width = width;
    }

    public float getLenght() {
        return lenght;
    }

    public void setLenght(float lenght) {
        this.lenght = lenght;
    }

    public float getWidth() {
        return width;
    }

    public void setWidth(float width) {
        this.width = width;
    }
    
    public float getRectangle()
    {
        return this.getWidth()*this.getLenght();
    }
    public void showInfo()
    {
        System.out.println("Chieu dai : " + this.getLenght());
        System.out.println("Chieu rong : " + this.getWidth());
        System.out.println("Dien tich :" + this.getRectangle());
    }
    
}
