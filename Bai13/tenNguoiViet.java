/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai13;

/**
 *
 * @author nguye
 */
public class tenNguoiViet {
    public String ho;
    public String ten;

    public tenNguoiViet() {
    }

    public tenNguoiViet(String ho, String ten) {
        this.ho = ho;
        this.ten = ten;
    }

    public String getHo() {
        return ho;
    }

    public void setHo(String ho) {
        this.ho = ho;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }
    
    public void showInfo()
    {
        System.out.println(ho + " " + ten);
    }
}
