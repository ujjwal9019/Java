# Java
Java practice 

polymorphism =  same name different work example

.......$$ .......

 public void printInfo(String name){
System.out.println(name);
 }

 public void printInfo(int age){
    System.out.println(age);
 }
 public void printInfo(String name , int age){
    System.out.println(name +"  " + age);
 }
 

public class Ujju{
    public static void main(String[] args) {
Poly s1 = new Poly();
s1.name = "ujju";
s1.age = 20 ; 

        s1.printInfo(s1.name);
        s1.printInfo(s1.age);
        s1.printInfo(s1.name , s1.age );
    }
}



........$$ .......

So in this code this is compile time polymorphism method overloading There are three function with same name but different parameters