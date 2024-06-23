package Java8;

import java.util.function.Predicate;
import java.util.function.BiPredicate;

public class Bipredicates {
    public static void main(String[] args) {
     
    Predicate <Integer> pred = x -> x % 2 == 0 ;
    System.out.println(pred.test(10));   
 
    BiPredicate <Integer , Integer > Bypred = (x , y) -> x % 2 ==0 && y % 2 == 0 ;
    System.out.println(Bypred.test(20,35 ));
    } 
}
