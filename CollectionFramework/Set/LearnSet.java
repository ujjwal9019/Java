package CollectionFramework.Set;
import java.util.Set;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;
public class LearnSet {
    public static void main(String[] args) {
        
        // Set<Integer> set = new LinkedHashSet<>();  //0(1)
         
        // Set<Integer> set = new HashSet<>();    // 0(n)
        
        Set<Integer> set = new TreeSet<>();  // 0(longn)

        set.add(10);
        set.add(20);
        set.add(50);
        set.add(60);

        // set.remove(10);

        System.out.println(set.contains(10));
        System.out.println(set);
    }
}
