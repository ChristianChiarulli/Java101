import java.util.Scanner;

public class JavaLessonFive{
  // static means it is accessible in other classes

  static Scanner user_input = new Scanner(System.in);
  static double MyPI = 3.14159; // Class variable

  public static void main(String[] args){

    int result = addThem(1,2);

    System.out.println(result);
  }

  public static int addThem(int a, int b){

    int c = a+b;

    return c;
  }
}
