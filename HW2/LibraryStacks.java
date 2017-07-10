import java.util.Scanner;
public class LibraryStacks{
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    int callNumber = keyboard.nextInt();
    if (callNumber >= 100 && callNumber <= 199){
    System.out.println("basement");
    }
    else if ((callNumber >= 200  && callNumber <= 500) || callNumber > 900){
    System.out.println("main floor");
    }
    else if ((callNumber >=  510 && callNumber <= 900) && !(callNumber >= 700 && callNumber <= 750)) {
    System.out.println("upper floor");
    }
    else if (callNumber >= 700 &&  callNumber <= 750){
    System.out.println("archives");
    }
    else {
    System.out.println("Invalid data");
    }
  }
}
