package Java8;
import java.util.function.Consumer;
import java.util.function.BiConsumer;
public class BiConsumers {
    public static void main(String[] args) {
        Consumer <Integer> consumer = (x) -> System.out.println(x);
        consumer.accept(10);

        BiConsumer <Integer , Integer> biconsumer = (x,y) -> System.out.println(x+y);
        biconsumer.accept(5, 4);
    }
}
