import java.util.*;

public class aLetterAtaTime{
  public static void main(String[] args){

    Scanner user_input = new Scanner(System.in);
    int a = 0;
    System.out.print("What is your message? ");
    String message = user_input.nextLine();
    int n = 0;
    for(int c = message.length(); n < c; n++){
    System.out.println(n +" - '" + message.charAt(n) + "'");
      if(message.charAt(n) == 'a'){
        a++;
      }
    }
    System.out.println("\nYour message contains the letter 'a' " + a + " times. Isn't that interesting?");
  }
}
