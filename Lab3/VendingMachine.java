import java.util.Scanner;

public class VendingMachine{
	public static void main(String[] args){

	   Scanner user_input = new Scanner(System.in);
     int price, Q=0, D=0, N=0, P=0, change;
     change = 100;
     System.out.println("Welcome to  \"Temple Vending Machine!\"\n");
     System.out.print("Enter price of item: ");
	   price = user_input.nextInt();
     System.out.println("");
     System.out.println("You bought an item for " + price + " cents and paid a dollar, so your change is: \n");

     change = change - price;

     while(change >= 25){
       Q++;
       change = change-25;
     }
     while(change >= 10 && change < 25){
       D++;
       change = change-10;
     }
     while(change >= 5 && change < 10){
       N++;
       change = change-5;
     }
     while(change >= 1 && change < 5){
       P++;
       change = change-1;
     }


     System.out.println("\t"+Q+"  quarters(s)");
     System.out.println("\t"+D+"  dime(s)");
     System.out.println("\t"+N+"  nickel(s)");
     System.out.println("\t"+P+"  penny(ies)\n");

      System.out.println("Thank you for using \"Temple Vending Machine\"");

	}
}
