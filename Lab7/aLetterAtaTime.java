/* Christian Chiarull
* 19 Jul, 11:21
* sec 002
* count letters
*/
import java.util.*;

public class aLetterAtaTime{
  public static void main(String[] args){

    Scanner user_input = new Scanner(System.in);
    int a = 0; // initialize a variable
    System.out.print("What is your message? "); // enter message
    String message = user_input.nextLine();

    int k = message.length(); // gets length
    System.out.println("\nYour message is " + k + " characters long.");

    char first = message.charAt(0); // gets first character
    System.out.println("The first character is at position " + 0 + " and is " + "'"+first+"'.");

    int m = message.length() - 1; // finds last char position
    char last = message.charAt(m); // finds last character
    System.out.println("The last character is at position " + m + " and is " + "'"+last+"'.");
    System.out.println("\nHere are all the characters, one at a time:\n");

    int n = 0;
    for(int c = message.length(); n < c; n++){
    System.out.println("\t"+n +" - '" + message.charAt(n) + "'");
      // count uppercase because thats what the program appeared to do
      if(message.charAt(n) == 'a' || message.charAt(n) == 'A'){
        a++;
      }
    }
    // display number of a's
    System.out.println("\nYour message contains the letter 'a' " + a  + " times. Isn't that interesting?");
  }
}
