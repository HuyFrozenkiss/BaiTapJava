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
public class Circle {
    public float Radius;
    public String color;

    public Circle() {
    }
    
    
    public Circle(float Radius, String color) {
        this.Radius = Radius;
        this.color = color;
    }
    
    public float getRadius() {
        return Radius;
    }

    public void setRadius(float Radius) {
        this.Radius = Radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public void showCircle()
    {   
        System.out.println("Radius : " + this.getRadius());
        System.out.println("Color : " + this.getColor());
    }
}

