package Exception;

public class TryCatchFinally {
 public static void main(String[] args) {
     int a[]  = new int[5];
     try {
        System.out.println(a[8]);
     } catch (Exception e) {
        System.out.println("exception handled ");
     } finally{
        System.out.println("Compulsory run ");
     }
    

 }   
}
