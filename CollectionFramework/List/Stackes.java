package CollectionFramework.List;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class Stackes {
public static void main(String[] args) {
    Stack<Integer> ageStack = new Stack<>();

    // Push elements onto the stack
    ageStack.push(10);
    ageStack.push(20);
    ageStack.push(30);

    // Peek at the top element
    System.out.println("Top of stack: " + ageStack.peek()); // Outputs: 30

    // Pop elements from the stack
    System.out.println("Popped: " + ageStack.pop()); // Outputs: 30
    System.out.println("Popped: " + ageStack.pop()); // Outputs: 20

    // Check stack size
    System.out.println("Size of stack: " + ageStack.size()); // Outputs: 1

    // Check if stack is empty
    System.out.println("Is stack empty? " + ageStack.isEmpty()); // Outputs: false

    // Peek at the remaining element
    System.out.println("Top of stack: " + ageStack.peek()); // Outputs: 10
}
    

}
