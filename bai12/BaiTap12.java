/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai12;

/**
 *
 * @author nguye
 */
public class BaiTap12 {
    public static void main(String[] args) {
        System.out.println("=====Student=====");
        Student st = new Student();
        st.setName("Nguyen Quang Huy");
        st.setBirthDay(2001);
        st.setIdCard("MB9500101032006");
        st.setTuitionFee(150000);
        st.showStudent();
        System.out.println("====Teacher======");
        Teacher tc = new Teacher();
        tc.setName("MTQ");
        tc.setBirthDay(2002);
        tc.setIdCard("MB9500");
        tc.setSalary(20000000);
        tc.showTeacher();
        
        System.out.println("====Manager======");
        Manager mn = new Manager();
        mn.setName("Le Cong Dat");
        mn.setBirthDay(2001);
        mn.setIdCard("MB9500101032001");
        mn.setMonthlySpend(1500000);
        mn.showManager();
    }
}
