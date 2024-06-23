package Java8;
import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.*;
import java.util.*;

public class StreamsBasics {
    public static void main(String[] args) {
        // This is imperative approach
     int sum = 0;
        int [] arr = {1,2,3,4,5,6};
        for(int i  = 0 ; i < arr.length ; i ++) {
            if(arr[i] % 2 == 0){
                sum += arr[i];
            }
        } 
      //stream

      int [] arr2 = {1,2,3,4,5,6};
      int sum2 = Arrays.stream(arr2).filter(x -> x %2 ==0).sum();
      System.out.println(sum2);
    }
}
