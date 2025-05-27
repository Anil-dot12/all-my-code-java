public class MyStack {
  private int maxSize;
  private int[] array;
  private int top;
  public MyStack(int capacity) {
    array = new int[capacity];
    top = -1;
  }
  public void pushElement(int element) {
    if (top == array.length - 1) {
      System.out.println("Stack is full. Cannot push element.");
    } else {
      top++;
      array[top] = element;
      System.out.println("Pushed : " + element);
    }
  }
  public int popElement() {
    if (top == -1) {
      System.out.println("Stack is empty. Cannot pop element.");
      return -1;
    } else {
      int poppedElement = array[top];
      top--;
      System.out.println("Popped : " + poppedElement);
      return poppedElement;
    }
  } 
  void printStack() {
	  System.out.print("Print all Stack elements:\n");
    for (int i = top; i > -1; i--) {
      System.out.print(array[i]+"\n");
    }
  }
  public static void main(String[] args) {
    MyStack stack = new MyStack(5);
    stack.pushElement(10);
    stack.pushElement(20);
    stack.pushElement(30);
    stack.printStack();
    
    System.out.print("\n");
    
    stack.popElement();
    stack.popElement();
    stack.printStack();
    
    System.out.print("\n");
    
    stack.pushElement(40);
    stack.pushElement(50);
    stack.printStack();
  }
}
