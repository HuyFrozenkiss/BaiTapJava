/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai14;

/**
 *
 * @author nguye
 */
public class StudentMath extends Student{

    public StudentMath() {
    }

    public StudentMath(String hoTen, String lop, double toan, double ly, double hoa) {
        super(hoTen, lop, toan, ly, hoa);
    }

    
    @Override
    public double tinhDiemTrungBinh(double a,double b, double c)
    {
        return (a*2+b+c)/4;
    }
    @Override
    public void showInfo()
    {
        super.showInfo();

        
    }
}
