import java.util.Scanner;

//Solution
/*
public class Practice04_1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    System.out.print(" Enter a number to sum numbers from 1 to that number: ");

    int total = 0;
    int c = 1;
    int n = keyboard.nextInt();
    do {
      System.out.print(c + " ");
      total = total + c;
      c++;
    }while(c <= n);
      System.out.println("\n total: "+ total);
  }
}
*/

public class Practice04_1 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    System.out.print(" Enter a number to sum numbers from 1 to that number: ");

    int total = 0;
    int n = keyboard.nextInt();
    for(int c = 1; c <=n ; c++) {
      System.out.print(c + " ");
      total = total + c;
    }
      System.out.println("\n total: "+ total);
  }
}
