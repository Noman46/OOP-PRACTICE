/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noman.practice.encapsulation;

/**
 *
 * @author Noman Ibrahim
 */
public class Student {

    private String name;
    private int roll;
    private double cgpa;

    public Student() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name, int pass) {
        if(pass==1234){
            this.name = name;}
        else{
        System.out.println("Your password is incorrect");
        }
        
    }

    public int getRoll() {
        return roll;
    }

    public void setRoll(int roll) {
        this.roll = roll;
    }

    public double getCgpa() {
        return cgpa;
    }

    public void setCgpa(double cgpa) {
        this.cgpa = cgpa;
    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", roll=" + roll + ", cgpa=" + cgpa + '}';
    }
    

}
