package noman.practice.overloading;

/**
 *
 * @author Noman Ibrahim
 */
public class Example1 extends Example2{
   // Following all methods have same name but different arguments, so they are overloaded methods
    
    public void m1() {
        System.out.println("No arg method");
    }

    public void m1(int i) {
        System.out.println("Int arg method");
    }

    public void m1(double d) {
        System.out.println("Double arg method");
    }
     public void m1(String x){
    System.out.println("Example 1 method");
    }
     public void m1(float d) {
        System.out.println("float arg method");
    }

    public static void main(String[] args) {
       Example1 e = new Example1();
       e.m1();
       e.m1(10);
       e.m1(10.5);
       e.m1(10.5f);
       e.m1(10l);// auto matic promotion
       e.m1("tototo"); // Here the chil class Method is executed as Overloading method resolution only See the reference type.
       // If the Refernce is parent class then parent class method will executes if the reference is child class then the child class method will executes.
       
       Example2 e2 = new Example2();
       e2.m1("tot"); // In this case 
    }

}
