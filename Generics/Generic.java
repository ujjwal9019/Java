package Generics;
// This is generic class
class Dog<E> {
    E id ;
    public  Dog(E id){
        this.id = id;
    }
    E getId(){
        return id ;
    }
}



public class Generic {
    public static void main(String[] args) {
        Dog<Integer> dg = new Dog<>(2);
        System.out.println(dg.getId());
    }
}
