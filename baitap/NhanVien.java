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
public class NhanVien {

    public String hoTen;
    public int tuoi;
    public String diaChi;
    public double tienLuong;
    public int tongSoGioLam;

    public NhanVien() {
    }

    public NhanVien(String hoTen, int tuoi, String diaChi, double tienLuong, int tongSoGioLam) {
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }

    public void inputInfo() {
        Scanner input = new Scanner(System.in);
        this.hoTen = input.nextLine();
        this.tuoi = input.nextInt();
        input.nextLine();
        this.diaChi = input.nextLine();
        this.tienLuong = input.nextDouble();
        this.tongSoGioLam = input.nextInt();
    }

    public double getTinhThuong()
    {
        if(this.tongSoGioLam >= 200)
        {
            return this.tienLuong*1.2;
        }
        else if(this.tongSoGioLam  <100)
        {
            return this.tienLuong;
        }
        else
        {
            return this.tienLuong*1.1;
        }
    }
    public void printInfo()
    {
        System.out.println("Ho Ten :"  + this.hoTen);
        System.out.println("Tuoi : " + this.tuoi);
        System.out.println("Dia Chi : " + this.diaChi);
        System.out.println("Tong so gio lam :" + this.tongSoGioLam);
        System.out.println("Tien Luong sau khi duoc thuong : " + this.getTinhThuong());
        
    }

}
