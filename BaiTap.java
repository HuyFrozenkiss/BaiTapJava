/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

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
       Circle exe01 = new Circle();
       Scanner input = new Scanner(System.in);
       exe01.Radius = input.nextFloat();
       input.nextLine();
       exe01.color = input.nextLine();
       exe01.showCircle();
    }
    
}
