package Java8;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
public class StreamOperation {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,56,7,78,10);
        List <Integer> FilteredList = list.stream().
        filter( x -> x % 2 ==0)
        .map(x->x/2)
        .distinct()    // mtlb sarre unique print ho no duplicate
        .sorted((a,b) -> (b-a))
        .limit(4)
        .skip(1)      // kitne element starting se skip krna cahate hai
        .collect(Collectors.toList());
        System.out.println(FilteredList);


        // Ex-2 Iteration in Stream
        List<Integer> Iteration = Stream.
        iterate(0, x -> x + 1).
        limit(101)
        .skip(1)
        .collect(Collectors.toList());
        System.out.println(Iteration);

    }
}
