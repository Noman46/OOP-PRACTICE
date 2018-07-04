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
public class Test {

    public void m1(Animal a) {
        System.out.println("Animal Method");
    }

    public void m1(Monkey a) {
        System.out.println("Monkey Method Method");
    }

    public static void main(String[] args) {
        Test t = new Test();
        Animal a = new Animal();
        Animal a1= new Monkey();
        Monkey m = new Monkey();
        t.m1(a);
        t.m1(a1);
        t.m1(m);
        
        // In overloading method resulotion always takes care by metod reference in compile time.
        // That is why it is called Compile time Polymorphism/static polymorphism or erly bimding

}
}
