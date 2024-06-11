package CollectionFramework.List;

import java.util.ArrayList;
import java.util.List;
// These are the common operation that can be perform in all dsa
public class CollectionList {
    public static void main(String[] args) {
List<Integer> list = new ArrayList<>();    
List<Integer> list2 = new ArrayList<>();
list2.add(1);
list2.add(2);
list2.add(3);
list.add(1);
list.add(20);
list.add(30);
System.out.println(list); 
//check the size   
System.out.println(list.size());
// check if arraylist contain thsi element
System.out.println(list.contains(20));    

//remove the index in list

// list.remove(1);
//remove the object  in list
// list.remove(Integer.valueOf(10));

// add one list to another 
// list.addAll(list2);    

// Remove the same element present in both the lits
// list.removeAll(list2);

// only retain the elemet that are present in both the list 
// list.retainAll(list2);

// to clear all the element in list
// list.clear();

// to convert arraylist to array
Object a[] = list.toArray();

System.out.println(list);
    }
}
