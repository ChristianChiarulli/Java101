/* Christian Chiarull
* 19 Jul, 11:21
* sec 002
*
*/
import java.util.*;

public class HiLo{
  public static void main(String[] args){

    Scanner user_input = new Scanner(System.in);
    //generates random number
    Random rand = new Random();
    int n = rand.nextInt(101) + 1;
    String hi_lo = null;
    System.out.println("I'm thinking of a number between 1-100. You have 7 guesses.");

    System.out.print("First guess: ");
    int r = user_input.nextInt();

    int number_of_tries = 0;
    // checks if number is higher or lower than random #
    while(n != r && number_of_tries < 6){
      if(n > r){
        hi_lo = "low";
      }
      else{
        hi_lo = "high";
      }
      //System.out.println(n); // this is to display random number to actually get it right
      System.out.println("Sorry, you are too " + hi_lo);
      System.out.print("Guess: #" + (number_of_tries + 2) + " ");
      r = user_input.nextInt();
      if(n == r){
        System.out.println("You guesses it! What are the odds?!?");
        System.exit(0);
      }
      number_of_tries++;
    }
    System.out.println("Sorry, you didn't guess it in 7 tries. You lose.");
  }
}
