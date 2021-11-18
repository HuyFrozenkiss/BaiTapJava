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
public class Student {
   public String maSV;
   public float diemTB;
   public int tuoi;
   public String lop;

    public Student() {
    }

    public Student(String maSV, float diemTB, int tuoi, String lop) {
        this.maSV = maSV;
        this.diemTB = diemTB;
        this.tuoi = tuoi;
        this.lop = lop;
    }

    public String getMaSV() {
        return maSV;
    }

    public void setMaSV(String maSV) {
        this.maSV = maSV;
    }

    public float getDiemTB() {
        return diemTB;
    }

    public void setDiemTB(float diemTB) {
        this.diemTB = diemTB;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }
    public void inputInfo()
    {
        Scanner input = new Scanner(System.in);
        do
        {
            System.out.println("Nhap ma Sv : ");
            this.maSV = input.nextLine();
        }while(this.maSV.length() != 8);
        do
        {
            System.out.println("Nhap diem trung binh :");
            this.diemTB = input.nextFloat();
        }while(this.diemTB < 0 || this.diemTB >10);
        do
        {
            System.out.println("Nhap tuoi >= 18 : ");
            this.tuoi = input.nextInt();
        }while(this.tuoi < 18);
        input.nextLine();
        do
        {
            System.out.println("Nhap lop : ");
            this.lop = input.nextLine();
        }while(this.lop.charAt(0) != 'A' && this.lop.charAt(0) != 'C');
    }
    
    public void showInfo()
    {
        System.out.println("Ma SV :" + this.maSV);
        System.out.println("Lop : " + this.lop);
        System.out.println("Diem TB : " + this.diemTB);
        System.out.println("Lop : " + this.lop);
    }
    
    public void hocBong()
    {
        if(this.diemTB >= 8.0)
        {
            System.out.println("Dat hoc bong");
        }
        else
        {
            System.out.println("Say no");
        }
    }
}
