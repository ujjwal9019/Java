package CollectionFramework.CompratorNdComparable;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;





public class Comparator  {
    
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Alice", 22));
        students.add(new Student("Bob", 21));
        students.add(new Student("Charlie", 23));

        System.out.println("Sorting by Name:");
        Collections.sort(students, new NameComparator());
        for (Student student : students) {
            System.out.println(student);
        }

        System.out.println("Sorting by Age:");
        Collections.sort(students, new AgeComparator());
        for (Student student : students) {
            System.out.println(student);
        }
    }
}
