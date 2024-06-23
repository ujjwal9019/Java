package Java8;

import java.util.Arrays;
import java.util.List;

import CollectionFramework.CompratorNdComparable.Student;

public class MethodReference {
    public static void print(String s){
        System.out.println(s);

    }
    public static void main(String[] args) {
     
    List<String> Student = Arrays.asList("ujju" , "anmol" , " vbvh");
    // so we can replace lambda exp with method ref
    // Student.forEach(x -> System.out.println(x) ); 

    // so this is method ref we are not invoking print func
    // we are just giving refernece of it
        Student.forEach(MethodReference :: print);
    }
}
