/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package outsidepackage;

import accessmodifiers.A;

/**
 *
 * @author Champak Roy
 */
public class OutsideClass {
    void print()
  {
      A a=new A();
      System.out.println(a.packagevar);
      System.out.println(a.publicevar);
      System.out.println(privatevar);
      System.out.println(a.protectedvar);
  }
    
}

