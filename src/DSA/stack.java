package DSA;

import java.util.Stack;

public class stack {
  public static void main(String[] args) {
    Stack<String> stack = new Stack<>();
    stack.add("Raunak");
    stack.add("Krisha");
    stack.add("James");
    stack.add("Pam");
    stack.add("Dwight");

    stack.pop();  //To remove elements from the stack
    stack.pop();
    System.out.println(stack.peek());  //To take a look at the current top element of the stack
    System.out.println(stack);
    System.out.println(stack.isEmpty()); //To check if stack is empty or not
    stack.pop();
    stack.pop();
    stack.pop();
    System.out.println(stack.isEmpty());
  }
}
