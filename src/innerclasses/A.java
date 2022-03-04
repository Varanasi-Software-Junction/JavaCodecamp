/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package innerclasses;

/**
 *
 * @author rakesh
 */
public class A {
    class B
    {
        
    }
    public static void main(String[] args) {
        A a=new A();
        A.B b=a.new  B();
        
    }
}
