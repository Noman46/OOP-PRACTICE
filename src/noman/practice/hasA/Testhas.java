/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noman.practice.hasA;

/**
 *
 * @author Noman Ibrahim
 */
public class Testhas {

    public int m1(){
     Anyclass a = new Anyclass();
    int z= a.add(20, 10);
     int y=a.sub(30,10);
     return z+y;
     
    }
    public static void main(String[] args) {
        Testhas h= new Testhas();
        h.m1();
        System.out.println(h.m1()+10);
    }
    
}
