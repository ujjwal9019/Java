Code Explaination  = 

package CollectionFramework;

import java.util.ArrayList;
import java.util.List;

public class LearnList {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();    
        List<Integer> list2 = new ArrayList<>();
        
        // Adding elements to list2
        list2.add(1);
        list2.add(2);
        list2.add(3);
        
        // Adding elements to list
        list.add(1);
        list.add(20);
        list.add(30);
        
        // Printing the list
        System.out.println(list); 
        
        // Checking the size of the list
        System.out.println(list.size());
        
        // Checking if the list contains the element 20
        System.out.println(list.contains(20));    

        // Uncomment to remove element at index 1
        // list.remove(1);

        // Uncomment to remove the object 10 from the list
        // list.remove(Integer.valueOf(10));

        // Uncomment to add all elements from list2 to list
        // list.addAll(list2);    

        // Uncomment to remove all elements that are present in list2 from list
        // list.removeAll(list2);

        // Uncomment to retain only elements that are present in both lists
        // list.retainAll(list2);

        // Uncomment to clear all elements from the list
        // list.clear();

        // Converting ArrayList to Array
        Object a[] = list.toArray();

        // Printing the list
        System.out.println(list);
    }
}

So these are the methods of collection Intewrface That are common among data structure 

Additional Operations
The following operations are commented out in the code. You can uncomment them to see their effects:

1 - Removing an element by index:
list.remove(1);

2 - Removing an element by value:
list.remove(Integer.valueOf(10));

3 - Adding all elements from another list:
list.addAll(list2);

4 - Removing all elements that are present in another list:
list.removeAll(list2);

5 - Retaining only elements that are present in another list:

list.retainAll(list2);

6 - Clearing all elements from the list:
list.clear();

7 - Converting the ArrayList to an array:
Object a[] = list.toArray();


There are seperate list methods that are only present in List Interface are  =  

1 = void add(int index, E element): Inserts the specified element at the specified position in the list. 

list.add(1, 100); // Adds 100 at index 1
 
2 = E get(int index): Returns the element at the specified position in the list.

Integer element = list.get(1); // Retrieves the element at index 1

3 = E set(int index, E element): Replaces the element at the specified position with the specified element. 

list.set(1, 200); // Sets the element at index 1 to 200

4 = E remove(int index): Removes the element at the specified position in the list.

list.remove(1); // Removes the element at index 1

Search Operations:

5 - list.indexOf(20): Finds the first occurrence of 20.

6 - list.lastIndexOf(20): Finds the last occurrence of 20.

Range-View:

7 - list.subList(1, 3): Creates a sublist from index 1 to 2.
