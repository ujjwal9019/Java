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


Inheritance = 

It is of 4 type 
1 = Single level Inheritance = 

example = //base class or parent class
class Shape{
 String color;

 public void area() {
System.out.println("Display area");
 }
}

// child class which inherit the prop of parent class
class Triangle extends Shape{
public void area(int l , int h){
    System.out.println(1/2 * l * h);
}

2 = multilevel Inhertance =

//base class or parent class
class Shape{
 String color;

 public void area() {
System.out.println("Display area");
 }
}

// child class which inherit the prop of parent class
class Triangle extends Shape{
public void area(int l , int h){
    System.out.println(1/2 * l * h);
}


class EqulateralTriangle extends Triangle {
    public void area (int l , int h){
        System.out.println(1/2 * l * h);
    }
}

3= hierarical Inheritance = 

//base class or parent class
class Shape{
 String color;

 public void area() {
System.out.println("Display area");
 }
}

// child class which inherit the prop of parent class
class Triangle extends Shape{
public void area(int l , int h){
    System.out.println(1/2 * l * h);
}

 class Circle extends Shape {
    public void area (int r){
System.out.println(3.14 * r * r);
    }
 }

 4 = Hybrid Inheritance = 


