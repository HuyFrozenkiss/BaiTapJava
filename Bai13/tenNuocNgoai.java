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
public class tenNuocNgoai extends tenNguoiViet {

    public tenNuocNgoai() {
    }
    
    public tenNuocNgoai(String ho, String ten) {
        super(ho, ten);
    }
    
    @Override
    public void showInfo()
    {
        System.out.println(ten +" " + ho.toUpperCase());
    }
}
