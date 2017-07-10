import java.util.Scanner;
public class Divide{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    System.out.print("Enter divisor: ");
    int divisor = keyboard.nextInt();
    System.out.print("Enter dividend: ");
    int dividend = keyboard.nextInt();
    int result = dividend % divisor;
    if (result == 0){
    System.out.println("Does divide evenly");
    }
    else {
    System.out.println("Does not Divide evenly");
    }
  }
}
