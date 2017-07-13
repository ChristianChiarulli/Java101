/* Christian Chiarull
* 10 Jul, 11:21
* sec 002
* Revenue project
*/
import java.util.Scanner;

public class PaycheckAdvanced{
  public static void main(String[] args){
          // declaring variaqbles
          double  hourly_salary, weekly_time, net_pay=0,
          over_time=0, net_pay_ot=0, ot_rem=0, ot_time=0;

          Scanner user_input = new Scanner(System.in);
          //Prompt user for information
          System.out.println("Welcome to \"TEMPLE HUMAN RESORCES\"\n");

          System.out.print("\tEnter Employee Number: ");
          String employee_num = user_input.next();
          try{
            Integer.parseInt(employee_num) == Integer.valueOf(employee_num
          }
          if(Integer.parseInt(employee_num) == Integer.valueOf(employee_num)){
            System.out.println("This is not a valid Employee Number.\nPlease run the program again");
            System.out.println("Thank you for using \"TEMPLE HUMAN RESOURCES\"");
          }
          else{
            System.exit(0);
          }
          System.out.print("\tEnter Hourly Salary: ");
          hourly_salary = user_input.nextDouble();
          System.out.print("\tEnter Weekly Time: ");
          weekly_time = user_input.nextDouble();
          System.out.println("==============================");

          // if no overtime is worked then the first statement executes if there was overtime execute the elseif

          if(weekly_time >= 0 && weekly_time <= 40){
            net_pay = weekly_time * hourly_salary;
          }
          else if(weekly_time > 40){
            ot_time = weekly_time-40;
            over_time = 1.5 * hourly_salary;
            net_pay = 40 * hourly_salary;
            net_pay_ot = (40 * hourly_salary) + (10 * over_time);
            ot_rem = net_pay_ot - net_pay;
          }

          System.out.println("\n\tEmployee #: " + employee_num);
          System.out.println("\tHourly Salary: $" + hourly_salary);
          System.out.println("\tWeekly Time: " + weekly_time + " hour(s)");
          System.out.println("\tRegular Pay for " + weekly_time + "hour(s): $" + net_pay);
          System.out.println("\tOvertime Pay for " + ot_time + " hour(s): $" + ot_rem);
          net_pay += ot_rem;
          System.out.println("\tNet Pay: $" + net_pay);
          System.out.println("==============================");

          System.out.println("Thank you for using \"TEMPLE HUMAN RESOURCES\"");
  }
}
