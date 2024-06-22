package Java8;
import java.lang.reflect.Array;
import java.util.ArrayList;

import java.util.ArrayList;
import java.util.function.Function;

public class Apply {
    public static void main(String[] args) {
        Function <String , Integer> function1 = x -> x.length() ;
        Function <String , String> function2 = x -> x.substring(0 ,3);
        Function <list<Student> , list<Student>> withvipprefix = li -> {
List <Student> result = new ArrayList<>();
for (Student s : li){
    if(function2.apply(s.getName()).equalsIgnoreCase("vip")){
        result.add(s);

    }
}
return result ; 

        } ;
Student s1 = new Student(1, "vipul");
Student s2 = new Student(1, "vipwvw");
Student s3 = new Student(1, "ujju");
Student s4 = new Student(4, "vipuls");
List <Student> student = Array.asList(s1,s2,s3,s4);
List<Student> filteredStudent = student.withvipprefix.apply(student);
System.out.println(filteredStudent);




    }
private static class Student {
    int id ;
    int name ;
    @Override
    public String toString() {
        return "Student [id=" + id + ", name=" + name + "]";
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getName() {
        return name;
    }
    public void setName(int name) {
        this.name = name;
    }
    public Student(int id, int name) {
        this.id = id;
        this.name = name;
    } 

    
}
}
