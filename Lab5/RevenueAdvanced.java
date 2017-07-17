/* Christian Chiarull
* 16 Jul, 11:21
* sec 002
* Revenue project
*/



import java.util.Scanner;

public class RevenueAdvanced{
    public static void main(String[] args){
      // declare variables
      double cost, discount=0, discount_amount=0;

      Scanner user_input = new Scanner(System.in);
      // get user input for price and quantity
      System.out.println("Welcome to \"Temple\" store\n");

      System.out.print("Enter item price: ");
      double price = user_input.nextDouble();
      //catch price error
      if(price <=0){
        System.out.println("\tThis is not a valid item price.\n\tPlease run the program again");
        System.out.println("\nThank You for using \"Temple\" store");
        System.exit(0);
      }
      System.out.print("Enter quantity: ");
      int quantity = user_input.nextInt();
      // catch quantity error
      if(quantity <=0){
        System.out.println("\tThis is not a valid quantity order.\n\tPlease run the program again");
        System.out.println("\nThank You for using \"Temple\" store");
        System.exit(0);
      }
      cost = price * quantity;

      System.out.println("\tThe item price: $" + price);
      System.out.println("\tThe order: " + quantity + " item(s)");
      System.out.println("\tThe cost: $" + cost);
      // calculate discount based on price nad quantity
      if(quantity >= 1 && quantity <= 49){
        discount = 0;
      }
      else if(quantity >= 50 && quantity <= 99){
        discount = 10;
      }
      else if(quantity >= 100 && quantity <= 149){
        discount = 15;
      }
      else if(quantity >= 150){ // Even though the project said greater than I think this is a better implementation.
        discount = 25;
      }
      // display final answers
      System.out.println("\tThe discount: " + discount + "%");

      discount_amount = discount/100 * cost;

      System.out.println("\tThe discount amount: $" + discount_amount);

      cost = cost - discount_amount;

      System.out.println("\tThe total: $" + cost + "\n");

      System.out.println("Thank You for using \"Temple\" store");
  }
}
