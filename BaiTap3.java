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
public class BaiTap3 {
    public static void main(String[] args) {
        Employee exe03 = new Employee();
        Scanner input = new Scanner(System.in);
        exe03.firstName = input.nextLine();
        exe03.lastName = input.nextLine();
        exe03.salaryMonthly = input.nextInt();
        exe03.showInfo();
        
    }
}
