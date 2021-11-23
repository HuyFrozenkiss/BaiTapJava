/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai14;

import java.util.Scanner;

/**
 *
 * @author nguye
 */
public class BaiTap14 {
    public static void main(String[] args) {
        Student st = new Student();
        Scanner scanner = new Scanner(System.in);   
        System.out.println("Nhập họ tên sinh viên: ");
        st.hoTen = scanner.nextLine();
        System.out.println("Nhập lớp: ");
        st.lop = scanner.nextLine();
        System.out.println("Nhập điểm toán: ");
        st.toan = scanner.nextDouble();
        System.out.println("Nhập điểm lý: ");
        st.ly = scanner.nextDouble();
        System.out.println("Nhập điểm hóa: ");
        st.hoa = scanner.nextDouble();
        st.showInfo();
        System.out.println("======Hoc sinh chuyen toan===========");
        StudentMath st1 = new StudentMath();
        scanner.nextLine();
        System.out.println("Nhập họ tên sinh viên: ");
        st1.hoTen = scanner.nextLine();
        System.out.println("Nhập lớp: ");
        st1.lop = scanner.nextLine();
        System.out.println("Nhập điểm toán: ");
        st1.toan = scanner.nextDouble();
        System.out.println("Nhập điểm lý: ");
        st1.ly = scanner.nextDouble();
        System.out.println("Nhập điểm hóa: ");
        st1.hoa = scanner.nextDouble();
        st1.showInfo();
    }
}
