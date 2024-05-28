class Pen {
    String color ; 
    String type ; //BALL , GEL ;  
    
public void write(){
    System.out.println("write something");
}
public void printcolor() {
System.out.println(this.color);
}


}

class Student {
String name ;
int age ;
public void printInfo() {
    System.out.println(this.name);
    System.out.println(this.age);
}
// Non peramiterized constructr
// Student(){
//     System.out.println("constructor created ");
// }
//perameterized constructor

// Student(String name , int age){
//     this.name = name;
//     this.age = age ; 
// }

// copy  constructor
Student(Student s2){
    this.name = s2.name;
    this.age = s2.age ; 
}
Student(){

}

}

public class OOPS{
    public static void main(String[] args) {
//     Pen pen1 = new Pen();
//     pen1.color = "blue";
//     pen1.type = "gel"; 
//     pen1.write();
//     Pen pen2 = new Pen();
//     pen2.color = "green";
//     pen2.type = "ball pen" ;


//  pen1.printcolor();
//  pen2.printcolor(); 

// Student s1 = new Student("aman" , 24);
// Student s2 = new Student();
// s1.age = 15;
// s1.name = "ujjwal";
// s2.name = "SACHIN" ; 
// s2.age = 20 ; 
// s1.printInfo();
// s2.printInfo();

Student s1 = new Student();
s1.name = "aman";
s1.age = 25 ;
Student  s2 = new Student(s1); 
s2.printInfo();


    }
}