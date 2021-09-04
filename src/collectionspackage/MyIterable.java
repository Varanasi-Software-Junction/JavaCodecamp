/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package collectionspackage;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

/**
 *
 * @author Chmpak
 */
public class MyIterable implements Iterable<Integer>{
private int n;

    public MyIterable(int n) {
        this.n = n;
    }

    @Override
    public Iterator<Integer> iterator() {
   return new MyIterator(n);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator(); //To change body of generated methods, choose Tools | Templates.
    }
    public static void main(String[] args) {
        MyIterable iterable=new MyIterable(3);
        for(int n:iterable)
            System.out.println(n);
       
    }

   
}
