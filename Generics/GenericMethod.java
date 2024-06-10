package Generics;

public class GenericMethod {
   public static void main(String[] args) {
    getData("ujju");
    GenericMethod obj = new GenericMethod();
    obj.DoubleData(5);
   } 
   
//    generic method
static <E> void getData(E data){
    System.out.println(data);

}
// bounded generics means sirf number type ke lega string wagera ke nhi 

<E extends Number> void DoubleData(E data){
    System.out.println(data);
}
}


