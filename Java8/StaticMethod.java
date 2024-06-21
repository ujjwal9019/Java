package Java8;
// A method with static keyword and body and which are define in 
// interface and canot be overide and changed is called as static method


interface A {
static void sayBye(){
System.out.println("ujju");
}
}
public class StaticMethod implements A{
public static void main(String[] args) {
    // So static method can not be call with the help of parent object 
    StaticMethod obj = new StaticMethod();
    // obj.sayBye();


    // it can be only accesisible with its interface name
    A.sayBye();
}    
}
