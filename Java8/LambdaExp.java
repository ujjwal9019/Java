package Java8;

@FunctionalInterface
 interface Employee {
    String getName();
} 
// class SoftwareEngineer implements Employee {

//     @Override
//     public String getName() {
        
//         return "Software Enginner";
//     }
    
// }
public class LambdaExp {
    public static void main(String[] args) {
        Employee employee = () -> "software enginner";

System.out.println(employee.getName());

    }
    
 }
