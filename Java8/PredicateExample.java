package Java8;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class PredicateExample {
    public static void main(String[] args) {
       Predicate <Integer> salary = x -> x > 10000 ; 
       Predicate <String> startwithV = x -> x.toLowerCase().charAt(0) == 'v';
       Predicate <String> endwithL = x -> x.charAt(x.length() - 1) == 'l';
       Predicate <String> and = startwithV.and(endwithL);
       Predicate <String> or = startwithV.or(endwithL);      
       //check if the string pass in isequal is same as in predicate
       Predicate <Object> preddicate = Predicate.isEqual("ujju");
       System.out.println(preddicate.test("ujju"));
    //    System.out.println(or.test("ipul"));
    }
}
