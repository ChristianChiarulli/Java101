/* Christian Chiarull
* 19 Jul, 11:21
* sec 002
* counting machine
*/
import java.util.Scanner;

public class CountingMachine{
  public static void main(String[] args){
    Scanner user_input = new Scanner(System.in);
    // count from this input
    System.out.print("Count from: ");
    int from = user_input.nextInt();
    // count to this input
    System.out.print("Count to  : ");
    int to = user_input.nextInt();
    // count by this input
    System.out.print("Count by  : ");
    int by = user_input.nextInt();
    System.out.println();
    // simple operation
    for (int n = from; n <= to; n += by){
      System.out.print(n+ " ");
    }
  }
}
