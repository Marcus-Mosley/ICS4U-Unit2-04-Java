import java.util.Scanner;

/**
* This class uses the MrCoxallStack.
*
* @author  Marcus A. Mosley
* @version 1.0
* @since   2021-05-28
*/
public class StackForm {
  /**
  * The Main method receives input and checks viability.
  */
  public static void main(String[] args) {
    MrCoxallStack astack = new MrCoxallStack();
    while (true) {
      int anumber = 0;
      try {
        // Input
        Scanner input = new Scanner(System.in);
        System.out.print("\nWhat would you like to do (1: Push, 2: "
            + "Pop, 3: Peek, 4: Clear, 5: Exit)? ");
        anumber = input.nextInt();
        if (anumber == 1) {
          try {
            // Input
            System.out.print("\nPlease enter a number: ");
            anumber = input.nextInt();
            astack.push(anumber);
            System.out.print("\nPushed " + anumber + " to Stack.");
            astack.showStack();
          } catch (Exception e) {
            System.out.printf("\nThat is not a number, please input a number! \n");
          }
        } else if (anumber == 2) {
          int pop = astack.pop();
          System.out.print("\nPopped " + pop + " from Stack.");
          astack.showStack();
        } else if (anumber == 3) {
          int peek = astack.peek();
          System.out.print("\n" + peek + " is at the top of the Stack. \n");
        } else if (anumber == 4) {
          astack.clear();
          System.out.print("\nThe Stack has been successfully cleared.");
          astack.showStack();
        } else if (anumber == 5) {
          break;
        } else {
          System.out.print("\nNot a valid option!");
        }
      } catch (NumberFormatException e) {
        System.out.printf("\nThat is not a number, please input a number! \n");
      } catch (ArrayIndexOutOfBoundsException e) {
        System.out.printf("\nThe stack is empty! \n");
      }
    }
  }
}