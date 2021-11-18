/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai11;

/**
 *
 * @author nguye
 */
public class Programmer extends Student {
    public int experienceYears;

    public int getExperienceYears() {
        return experienceYears;
    }

    public void setExperienceYears(int experienceYears) {
        this.experienceYears = experienceYears;
    }
    public void showProgrammer()
    {
        super.showStudent();
        System.out.println("Experience :" + this.getExperienceYears());
    }
}
