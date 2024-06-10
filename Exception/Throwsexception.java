package Exception;

public class Throwsexception {
    
public static void main(String[] args) {
    int c[] = new int[5];
    try {
        getNumber(c);     
    } catch (Exception e) {
        System.out.println(e);
    }
   

}

// so we know this method  can give error so we apply throws so that other devloper can handle this method 

static  int getNumber(int a []) throws ArrayIndexOutOfBoundsException{
return a[8];
}
}
