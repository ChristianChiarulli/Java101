import java.util.Scanner;
/*
public class Practice04 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter 5 numbers to find the biggest among: ");

    int max = -1;
    int n;
    int c = 0;
    while(c < 5) {
      System.out.print("Enter a number: ");
      n = keyboard.nextInt();
      if(n > max) {
        max = n;
      }
      c++;
    }
    System.out.println("The maximum number is: " + max);
  }
}
*/

//Solution
public class Practice04 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter 5 numbers to find the biggest among: ");

    int max = -1;
    int n;
    for(int c = 0; c < 5; c++) {
      System.out.print("Enter a number: ");
      n = keyboard.nextInt();
      if(n > max) {
        max = n;
      }
    }
    System.out.println("The maximum number is: " + max);
  }
}


//Solution
public class Practice04 {
  public static void main(String[] args) {

    Scanner keyboard = new Scanner(System.in);
    System.out.println("Enter 5 numbers to find the biggest among: ");

    int max = -1;
    int n;
    int c = 0;
    do {
      System.out.print("Enter a number: ");
      n = keyboard.nextInt();
      if(n > max) {
        max = n;
      }
      c++;
    }while(c < 5);
    System.out.println("The maximum number is: " + max);
  }
}
