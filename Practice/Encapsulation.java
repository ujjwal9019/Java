package Practice;

public class Encapsulation {

    private String name ;
    private int age ; 

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
    Encapsulation(String name , int age){
this.name = name ;
this.age = age;
    }
        // Method to display person details
        public void displayInfo() {
            System.out.println("Name: " + name);
            System.out.println("Age: " + age);
        }

    
    public static void main(String[] args) {
        Encapsulation enc = new Encapsulation("UJJU", 120);

        //MODIFIYING THROUGH SETER 

        enc.setName("vbvh");
        enc.setAge(50);


enc.displayInfo();

//accesing data through getter
System.out.println("Accesing name through getter");
System.out.println(enc.getName());
System.out.println(enc.getAge());

        
    }
    
}
