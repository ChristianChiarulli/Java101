import java.util.Scanner;

public class Practice_01_Expressions_Scanner{
  public static void main(String[] args){
    Scanner console = new Scanner(System.in);

    System.out.print("Please enter an int: ");
    int x = console.nextInt();

    System.out.print("Please enter an double: ");
    double y = console.nextDouble();

    System.out.print("Please enter an string: ");
    String s = console.next();

    System.out.println();
    System.out.println(x + y + s);
    System.out.println(x + s + y);
    System.out.println(y + x + s);
    System.out.println(y + s + x);
    System.out.println(s + x + y);
    System.out.println(s + y + x);
  }
}
