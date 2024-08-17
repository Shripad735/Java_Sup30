import java.util.Scanner;

public class ReverseLineStack {

  public String[] stack;
  public int top; 
  public int maxSize;

  public void createStack(int size) {
    stack = new String[size];
    top = -1;
    maxSize = size;
  }

  public void peek() {
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return;
    }
    System.out.println("Element at the top of the stack is: " + stack[top]);
  }

  public void push(String element) {
    if (isFull()) {
      System.out.println("Stack is already full");
      return;
    }
    top++;
    stack[top] = element;
    System.out.println("Element " + element + " pushed to stack");
  }

  public boolean isEmpty() {
    return top == -1;
  }

  public boolean isFull() {
    return top == maxSize - 1;
  }

  public String pop() {
    if (isEmpty()) {
      System.out.print("Stack is already empty ");
      return null; 
    }
    String element = stack[top];
    top--;
    return element;
  }

  public void printStack() {
    if (isEmpty()) {
      System.out.println("Stack is empty");
      return;
    }
    for (int i = top; i >= 0; i--) {
      System.out.print(stack[i] + " ");
    }
    System.out.println(); 
  }

  public static void main(String[] args) {
    String inputString;
    Scanner in = new Scanner(System.in);
    System.out.print("Enter the string: ");
    inputString = in.nextLine(); 

    String[] words = inputString.split("\\s");
    ReverseLineStack stack = new ReverseLineStack();
    stack.createStack(words.length);

    for (String word : words) {
      stack.push(word);
    }

    System.out.println("Reversed String:");
    stack.printStack();
  }
}