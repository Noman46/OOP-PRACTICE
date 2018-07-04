/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noman.practice.overriding;

/**
 *
 * @author Noman Ibrahim
 */
public class Child extends Parent {

    private void m1() {
        System.out.println("Private Method");
    }

   
    public void m4() {
        System.out.println("Simple method in child class");
    }

    public static void main(String[] args) {
        Parent p = new Parent();
        Child c = new Child();

        //p.m1(); private method can not be inherited,thus can not be overriden
        p.m2(); // Static method can be inherited but can not be overridden
        p.m3(); // final meethod got inherited but can not be overridden.
        p.m4(); // Runtime polymorphism
        c.m4();
        c.m2();// Runtime polymorphism
    }

}

/*
Static Method
Final Method
Simple method in child class
Simple method in child class
*/

/*
Static Method
Final Method
Simple method
Simple method in child class
Static Method
*/
