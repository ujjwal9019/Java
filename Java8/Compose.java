package Java8;

import java.util.function.Function;

public class Compose {
    public static void main(String[] args) {
     
    // Function <Integer , Integer> func1 = x -> x * 2;
    // Function <Integer , Integer> func2 = x -> x * x * x ;

    // System.out.println(func1.andThen(func2).apply(3));
    
    // System.out.println(func2.andThen(func1).apply(3));
    
    // System.out.println(func1.compose(func2).apply(3));
    
        
    Function <String , String> Identity = Function.identity();
    System.out.println(Identity.apply("vipul")); 

    }
}
