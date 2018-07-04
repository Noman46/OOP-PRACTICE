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
public class Example5 {

    public void m1(int i) {
        System.out.println("INTEGER ARG");
    }

    public void m1(int... i) {
        System.out.println("Var ARG");
    }

    public static void main(String[] args) {
       Example5 e= new Example5();
       e.m1();
       
    }

}
