/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai15;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class BaiTap15 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        USB usb = new USB();
        System.out.println("Nhap ma hang :");
        usb.maHang = scanner.nextLine();
        System.out.println("Nhap gia :");
        usb.gia = scanner.nextInt();
        System.out.println("Nhap so luong :");
        usb.soLuong = scanner.nextInt();
        usb.showInfo();
        System.out.println("========MOUSE==========");
        scanner.nextLine();
        Mouse mouse = new Mouse();
        System.out.println("Nhap ma hang :");
        mouse.maHang = scanner.nextLine();
        System.out.println("Nhap gia :");
        mouse.gia = scanner.nextInt();
        System.out.println("Nhap so luong :");
        mouse.soLuong = scanner.nextInt();
        mouse.showInfo();
    }
}
