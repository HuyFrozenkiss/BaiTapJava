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
public class BaiTap2 {
    public static void main(String[] args) {
        Rectangle exe02 = new Rectangle();
        Scanner input = new Scanner(System.in);
        exe02.lenght = input.nextFloat();
        exe02.width = input.nextFloat();
        exe02.getRectangle(exe02.lenght,exe02.width);
        exe02.showInfo();
    }
}
