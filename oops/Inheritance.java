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

// multi level Inheritance
// class EqulateralTriangle extends Triangle {
//     public void area (int l , int h){
//         System.out.println(1/2 * l * h);
//     }
// }


// hierarical Inheritance
 class Circle extends Shape {
    public void area (int r){
System.out.println(3.14 * r * r);
    }
 }




}

public class Inheritance {
public static void main(String[] args) {
    Triangle t1 = new Triangle();
    t1.color = "blue";
}    
}
