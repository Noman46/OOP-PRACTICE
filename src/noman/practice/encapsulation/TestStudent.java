/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package noman.practice.encapsulation;

/**
 *
 * @author Noman Ibrahim
 */
public class TestStudent {

   
    public static void main(String[] args) {
        Student st = new Student();
        st.setName("noman", 1234);
        System.out.println(st.getName());
       
    }
    
}
