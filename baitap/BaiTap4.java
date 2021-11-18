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
public class BaiTap4 {
    public static void main(String[] args) {
        Account exe04 = new Account();
        Scanner input = new Scanner(System.in);
        exe04.id = input.nextLine();
        exe04.name = input.nextLine();
        exe04.balance = input.nextInt();
        int amount = input.nextInt();
        exe04.debit(amount);
        exe04.showInfo();
    }
}
