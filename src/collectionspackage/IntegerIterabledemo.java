
package collectionspackage;

import java.util.Iterator;
import java.util.Spliterator;
import java.util.function.Consumer;

public class IntegerIterabledemo implements Iterable<Integer>{
    public static void main(String[] args) {
        IntegerIterabledemo ii=new IntegerIterabledemo(3);
        for(int i:ii)
            System.out.println(i);
    }
private int n;
private Table  demo;
    public IntegerIterabledemo(int n) {
        this.n = n;
        demo=new Table(n);
    }

    @Override
    public Iterator<Integer> iterator() {
       return new Table(n);
    }

    @Override
    public void forEach(Consumer<? super Integer> action) {
        forEach(action);
    }

    @Override
    public Spliterator<Integer> spliterator() {
        return Iterable.super.spliterator(); //To change body of generated methods, choose Tools | Templates.
    }
    
}
