import java.util.ArrayList;

/**
* This class creates an integer stack.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-05-31
*/
public class MrCoxallStack {
  private ArrayList<Integer> stackAsArray = new ArrayList<>();
  
  /**
  * The Push method pushes an integer to the ArrayList.
  */
  public void push(int pushNumber) {
    stackAsArray.add(pushNumber);
  }
  
  /**
  * The Pop method pops an integer from top of the ArrayList.
  */
  public int pop() {
    int tmp = stackAsArray.get(stackAsArray.size() - 1);
    stackAsArray.remove(stackAsArray.size() - 1);
    return tmp;
  }
  
  /**
  * The Peek method returns an integer from top of the ArrayList.
  */
  public int peek() {
    return stackAsArray.get(stackAsArray.size() - 1);
  }
  
  /**
  * The Clear method clears all integers from the ArrayList.
  */
  public void clear() {
    stackAsArray.clear();
  }
  
  /**
  * The showStack method outputs the ArrayList.
  */
  public final void showStack() {
    System.out.print("\nStack: ");
    for (int count = 0; count < stackAsArray.size(); count++) {
      System.out.print(stackAsArray.get(count) + ", ");
    }
    System.out.print("\n");
  }
}