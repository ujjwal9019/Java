package Java8;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import java.util.*;
public class StreamOperation {
    public static void main(String[] args) {
        List<Integer> list  = Arrays.asList(1,2,3,4,56,7,78,9,9);
        List <Integer> FilteredList = list.stream().filter( x -> x % 2 ==0).collect(Collectors.toList());
        System.out.println(FilteredList);

        // Now we have to divide all the even number by 2 
        
        List<Integer> newList = FilteredList.stream().map(x -> x /2).collect(Collectors.toList()); 
        System.out.println(newList);
    }
}
