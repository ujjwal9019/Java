package Java8;

import java.util.function.Function;

import java.util.function.BiFunction;

public class BiFunctions {
    public static void main(String[] args) {
        Function<String  , Integer> func = str -> str.length();
        System.out.println(func.apply("ujju"));

        BiFunction < String , String , Integer > bifunc = (x, y) ->  x.length() + y.length();
        System.out.println(bifunc.apply("ujju", "vbv"));
    }
}
