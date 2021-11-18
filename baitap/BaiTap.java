/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

import BaiTap10.Cylinder;
import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class BaiTap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Cylinder c = new Cylinder();
        c.setRadius(2);
        c.setColor("Red");
        c.setHeight(4);
        c.showCylinder();
    }
    
}
