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
public class Example3 {

    public void m1(String x) {
        System.out.println("String argument method");
    }

    public void m1(Object o) {
        System.out.println("EObject Argument method ");
    }

    public static void main(String[] args) {
        Example3 e3= new Example3();
        e3.m1(null); // Out will be 'String argument Method'
                     // same parameter for child and parents then child get the high priority
    }

}
