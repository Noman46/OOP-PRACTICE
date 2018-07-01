
package noman.practice.isA;

/**
 *
 * @author Noman Ibrahim
 */
public class Parent {
    public void m1(){
        System.out.println("This is public m1 method");
    }
    private String m2(){
        System.out.println("This is private m2 method");
    return null;
    }
    
    public static void m3(){
        System.out.println("This is static m3 method");
    }
    public void getM2(){
         m2(); //Procedure of calling privat method.
    }
    
}
