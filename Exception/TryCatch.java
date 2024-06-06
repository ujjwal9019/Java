package Exception ;
public class TryCatch{

public static void main(String[] args) {
int a[] = new int[5];

try {
    System.out.println(a[8]);    
} catch (Exception e) {
    System.out.println(e);
}

System.out.println("ujju");
    
}
}