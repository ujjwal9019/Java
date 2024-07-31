package Practice;

import Practice.chicken.Horse;
import Practice.chicken.donkey;

abstract class animal {
    //This is abstract function means We can not use it it is just a method define so to implemnet in other clqass

abstract void walk() ;
}


class chicken extends animal {
public void walk(){
    System.out.println("chicks have 2 legs");
}    

class donkey extends animal {
    public void walk(){
        System.out.println("hhjbn sdaj");
    }
}
} 

public class Abstraction {
    public static void main(String[] args) {
        chicken chick = new chicken();

        chick.walk();

        donkey whore = new donkey();
        whore.walk();
  
    }
    
}
