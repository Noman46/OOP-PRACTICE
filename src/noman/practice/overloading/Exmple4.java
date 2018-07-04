/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noman.practice.overloading;

/**
 *
 * @author Noman Ibrahim
 */
public class Exmple4 {

    public void m1(String x) {
        System.out.println("String argument method");
    }

    public void m1(StringBuffer o) {
        System.out.println("StringBuffer Argument method ");
    }

    public static void main(String[] args) {
        Exmple4 e4= new Exmple4();
       // e4.m1(null); // It will give compile time error
                     // same parameter for child and chil then nobody will get high priority.
                     // Gives compile time error
                     // String and StringBuffer are child of Object Class
    }

}
