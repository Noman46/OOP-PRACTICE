package noman.practice.overriding;

/**
 *
 * @author Noman Ibrahim
 */
public class Parent {

    private void m1() {
        System.out.println("Private Method");
    }

    static void m2() {
        System.out.println("Static Method");
    }

    final void m3() {
        System.out.println("Final Method");
    }

    public void m4() {
        System.out.println("Simple method");
    }

}
