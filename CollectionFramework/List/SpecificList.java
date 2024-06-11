package CollectionFramework.List;
// These  are specific to list only 

import java.util.ArrayList;
import java.util.List;

import javax.swing.text.html.HTMLDocument.Iterator;

public class SpecificList {
    public static void main(String[] args) {
     
    List<Integer> list = new ArrayList<>();   
    list.add(1);
    list.add(20);
    list.add(30);
   
    // get element at specific index
    // System.out.println(list.get(0));

    // set element at specfic index
// list.set(1,200);

// add element at specfic index and the element present  at that will shift shift to next
// list.add(2,1000);

// remove the element at particular index

// list.remove(1);

// print the position of element of element  first occuance
// System.out.println(list.indexOf(20));

// Iteration in list by three method

// 1 - by for loop
// for(int i = 0 ; i < list.size() ; i++){
//     System.out.println(list.get(i));
// }

// 2 -  by foreach loop

// for (Integer E : list) {
// System.out.println(E);    
// }

// 3 - by iterator 

// Iterator<Integer> fe = list.iterator();
// while (fe.hasNext()) {
//     System.out.println(fe.next());
// }

//   


System.out.println(list);


    }
}
