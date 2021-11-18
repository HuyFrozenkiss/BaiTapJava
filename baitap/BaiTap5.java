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
public class BaiTap5 {
    public static void main(String[] args) {
        Date exe05 = new Date();
        Scanner input = new Scanner(System.in);
        exe05.day = input.nextInt();
        exe05.month = input.nextInt();
        exe05.year = input.nextInt();
        exe05.showInfo();
    }
}
