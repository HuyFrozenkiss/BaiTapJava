/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class BaiTap13 {
    public static void main(String[] args) {
        tenNguoiViet person = new tenNguoiViet();
        Scanner ip = new Scanner(System.in);
        person.ho = ip.nextLine();
        person.ten = ip.nextLine();
        person.showInfo();
        tenNuocNgoai person1 = new tenNuocNgoai(person.ho,person.ten);
        person1.showInfo();
        
    }
}
