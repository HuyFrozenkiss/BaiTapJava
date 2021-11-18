/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baitap;

/**
 *
 * @author nguye
 */
public class Date {
    public int day;
    public int month;
    public int year;

    public Date() {
    }

    public Date(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }
    public boolean isLeapYear(int year)
    {
     if (year % 400 == 0)
     {
         return true;
     }
     if(year % 4 == 0 && year % 100 != 0)
     {
         return true;
     }
       return false;
    }
    public void checkDay(int month)
    {
        if(month == 1 || month == 3 || month == 5 || month == 7 || month == 8 || month ==10 || month == 12)
        {
            System.out.println("thang " + month  + " co 31 ngay ");
        }
        else if( month == 4 || month == 6 || month ==9 || month ==11)
        {
            System.out.println("thang " + month  + " co 30 ngay ");
        }
        else
        {
            if(isLeapYear(this.getYear()))
            {
                System.out.println("thang 2 co 29 ngay ");
            }
            else
            {
                System.out.println("thang 2 co 28 ngay");
            }
        }
    }
    public void showInfo()
    {
        System.out.println("Ngay : " + this.getDay());
        System.out.println("Thang : " + this.getMonth());
        System.out.println("Nam : " + this.getYear());
        if(isLeapYear(this.getYear()))
        {
            System.out.println("La nam nhuan");
        }
        else
        {
            System.out.println("Khong la nam nhuan");
        }
        checkDay(this.getMonth());
    }
}
