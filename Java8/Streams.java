package Java8;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.Stream;
import java.util.*;
public class Streams {
    public static void main(String[] args) {
    // This is a way to convert list into stream
        List <String> list = Arrays.asList("uju" , "vbvh" , "anmol", "paa");
    Stream<String> streamcreation = list.stream();

    // Way to convert array into stream
    String [] arr = {"ujju" , "vbvh" , "anmol" , };
    Stream <String> streamarray = Arrays.stream(arr);


    //Way to create direct strem
    Stream<Integer> IntegerStream = Stream.of( 2,2,3,4,5);
   
    // To itertae in Stream
    Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(100);
 
    
     }
}
