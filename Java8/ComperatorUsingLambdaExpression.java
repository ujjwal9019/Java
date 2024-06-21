package Java8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class MyClass implements Comparator<Integer>{
public int compare(Integer a , Integer b){
    return b-a ; 
}
}
public class ComperatorUsingLambdaExpression {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(2);
        list.add(6);
        
        list.add(4);
    System.out.println(list);
    System.out.println("after sort");
    Collections.sort(list ,  (a,b) -> b-a);
    System.out.println(list);
    }
}
