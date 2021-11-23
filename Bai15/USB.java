/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai15;

/**
 *
 * @author nguye
 */
public class USB {
    public String maHang;
    public int gia;
    public int soLuong;

    public USB() {
    }

    public USB(String maHang, int gia, int soLuong) {
        this.maHang = maHang;
        this.gia = gia;
        this.soLuong = soLuong;
    }

    public String getMaHang() {
        return maHang;
    }

    public void setMaHang(String maHang) {
        this.maHang = maHang;
    }

    public int getGia() {
        return gia;
    }

    public void setGia(int gia) {
        this.gia = gia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }
    
    public int tongTien(int a,int b)
    {
        return a*b;
    }
    public void showInfo()
    {
        System.out.println("Ma Hang :" + this.getMaHang());
        System.out.println("Gia : " + this.getGia());
        System.out.println("So Luong : " + this.getSoLuong());
        System.out.println("Tong tien thanh toan :" + tongTien(this.gia,this.soLuong));
    }
}
