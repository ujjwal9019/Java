package Java8;
import java.util.function.Supplier;
public class Suppliers {
    public static void main(String[] args) {
     
    Supplier <Integer> supplier = () -> 1; 
    System.out.println(supplier.get());   
    }
}
