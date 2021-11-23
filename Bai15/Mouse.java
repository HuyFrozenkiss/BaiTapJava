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
public class Mouse extends USB {

    public Mouse() {
    }

    public Mouse(String maHang, int gia, int soLuong) {
        super(maHang, gia, soLuong);
    }

    @Override
    public int tongTien(int a,int b)
    {
        return (int) (a*0.8 *b);
    }
    @Override
    public void showInfo()
    {
        super.showInfo();
    }
}
