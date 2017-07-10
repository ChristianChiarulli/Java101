/* Christian Chiarull
* 10 Jul, 11:21
* sec 002
* Revenue project
*/



import java.util.Scanner;

public class Revenue{
    public static void main(String[] args){
      double price, cost, discount=0, discount_amount=0;
      int quantity;
      Scanner user_input = new Scanner(System.in);

      System.out.println("Welcome to \"Temple\" store\n");

      System.out.print("Enter item price: ");
      price = user_input.nextDouble();
      System.out.print("Enter quantity(ies): ");
      quantity = user_input.nextInt();

      cost = price * quantity;

      System.out.println("\tThe item price: $" + price);
      System.out.println("\tThe order: " + quantity + " item(s)");
      System.out.println("\tThe cost: $" + cost);

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
      System.out.println("\tThe discount: " + discount + "%");

      discount_amount = discount/100 * cost;

      System.out.println("\tThe discount amount: $" + discount_amount);

      cost = cost - discount_amount;

      System.out.println("\tThe total: $" + cost + "\n");

      System.out.println("Thank You for using \"Temple\" store");
  }
}
