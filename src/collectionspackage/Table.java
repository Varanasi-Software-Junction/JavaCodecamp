package collectionspackage;

import java.util.Iterator;
import java.util.function.Consumer;


  public  class Table implements Iterator<Integer> {

        private int n, i;
        
        public Table(int n) {
            this.n = n;
            this.i = 1;
        }
        
        @Override
        public boolean hasNext() {
            return i <= 10;
        }
        
        @Override
        public Integer next() {
            if (i > 10) {
                return -1;
            }
            i++;
            return n * (i - 1);
        }
        
        @Override
        public void remove() {
            i--;
        }
        
        @Override
        public void forEachRemaining(Consumer<? super Integer> action) {
            for (int i = this.i; i <= 10; i++) {
                action.accept(i);
            }
        }
        
    }

