package collectionspackage;

import java.util.function.Consumer;

public class IntegerConsumer implements Consumer<Integer> {

    @Override
    public void accept(Integer t) {
        System.out.println(t);
    }

    @Override
    public Consumer<Integer> andThen(Consumer<? super Integer> after) {
        return Consumer.super.andThen(after); //To change body of generated methods, choose Tools | Templates.
    }

    public static void main(String[] args) {
        IntegerConsumer consumer = new IntegerConsumer();
        consumer.accept(10);
        consumer.andThen(consumer).andThen(consumer).accept(10);
    }
}
