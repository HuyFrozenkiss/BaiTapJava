/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai14;

;

/**
 *
 * @author nguye
 */
public class Student {
    public String hoTen;
    public String lop;
    public double toan;
    public double ly;
    public double hoa;

    public Student() {
    }

    public Student(String hoTen, String lop, double toan, double ly, double hoa) {
        this.hoTen = hoTen;
        this.lop = lop;
        this.toan = toan;
        this.ly = ly;
        this.hoa = hoa;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public double getToan() {
        return toan;
    }

    public void setToan(double toan) {
        this.toan = toan;
    }

    public double getLy() {
        return ly;
    }

    public void setLy(double ly) {
        this.ly = ly;
    }

    public double getHoa() {
        return hoa;
    }

    public void setHoa(double hoa) {
        this.hoa = hoa;
    }
    public double tinhDiemTrungBinh(double a, double b, double c)
    {
        return (a+b+c)/3;
    }
    public void showInfo()
    {
        System.out.println("Ho ten :" + this.getHoTen());
        System.out.println("Lop : " + this.getLop());
        System.out.println("Diem Toan : " + this.getToan());
        System.out.println("Diem Ly : " + this.getLy());
        System.out.println("Diem Hoa : " + this.getHoa());
        System.out.println("Diem tb : " + tinhDiemTrungBinh(this.toan,this.ly,this.hoa));
    }
}
