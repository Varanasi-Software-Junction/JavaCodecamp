
package collectionspackage;

import java.util.Iterator;


public class MyIterator implements Iterator<Integer>{
private int n,i=0;

    public MyIterator(int n) {
        this.n = n;
    }

    @Override
    public boolean hasNext() {
        if(i<10)
            return true;
        return false;
    }

    @Override
    public Integer next() {
       if(i<10)
           i++;
           return i*n;
    }
    
}
