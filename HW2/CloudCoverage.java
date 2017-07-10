import java.util.Scanner;
public class CloudCoverage{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int data = keyboard.nextInt();
    if (data >= 0 && data <= 30) {
    System.out.println("clear");
  } else if (data >= 31 && data <= 70) {
    System.out.println("partly cloudy");
  } else if (data >= 71 && data <= 99) {
    System.out.println("cloudy");
  } else if (data == 100) {
    System.out.println("overcast");
    } else {
    System.out.println("Invalid data");
    }
  }
}
