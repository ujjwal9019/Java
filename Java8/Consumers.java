package Java8;
import java.util.function.Consumer;
import java.util.List;
import java.util.Arrays;
public class Consumers {
    public static void main(String[] args) {
       Consumer <List<Integer>> consumer1 = s -> {
        for (Integer i   : s) {
            System.out.println(i + 10);
        }

       };
    //    consumer1.accept(Arrays.asList(1,2,3,4,5));

       Consumer <List<Integer>> Consumer2 = li -> {
        for (Integer i : li) {
            System.out.println(i);
        }
       }; 
    //    Consumer2.accept(Arrays.asList(1,2,3,4,5));


Consumer2.andThen(consumer1).accept(Arrays.asList(1,2,3,4,5));
    }
}
