package Java8;
// Default method is nothing just a method with a body and it come with java 8 not before
interface Parent{
    default void sayHello(){
        System.out.println("hii");
    }
}
class Child implements Parent{

}
public class DefaultMethods {
    public static void main(String[] args) {
     
   Child c = new Child();
   c.sayHello();    
    }
}
