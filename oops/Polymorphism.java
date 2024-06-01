class Child {
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

public class Polymorphism{
    public static void main(String[] args) {
Child s1 = new Child();
s1.name = "ujju";
s1.age = 20 ; 

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name , s1.age );
    }
}
