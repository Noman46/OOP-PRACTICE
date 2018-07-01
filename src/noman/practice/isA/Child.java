/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noman.practice.isA;

/**
 *
 * @author Noman Ibrahim
 */
public class Child extends Parent {

    public static void main(String[] args) {
        Child c = new Child();
        c.m1(); // Output: This is public m1 method
        //c.m2(); // Private properties can not be inherited.
        c.m3();
        // Output: this is static m3 method.
        // Static members can be inherited but can not be overriden.(polymorphism out of scope)
    }

}
