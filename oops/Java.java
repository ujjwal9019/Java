class Polymorphism {
 String name ; 
 int age ;

//  Student(String name  , int age){
//     this.name = name;
//     this.age = age;
//  }
 public void printInfo(String name){
System.out.println(name);
 }

 public void printInfo(int age){
    System.out.println(age);
 }
 public void printInfo(String name , int age){
    System.out.println(name +"  " + age);
 }
} 

public class Java{
    public static void main(String[] args) {
Polymorphism s1 = new Polymorphism();
s1.name = "ujju";
s1.age = 20 ; 

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name , s1.age );
    }
}
