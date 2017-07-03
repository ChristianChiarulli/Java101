import java.util.Scanner;

class BMR{
	public static void main(String[] args){

	   Scanner user_input = new Scanner(System.in);
     double weight, height, age, male, female;
     System.out.println("This program will calculate your BMR");
     System.out.print("Enter your weight: ");
	   weight = user_input.nextInt();
     System.out.print("Enter your height: ");
     height = user_input.nextInt();
		 System.out.print("Enter your age: ");
     age = user_input.nextInt();
     System.out.print("If you are a man your BMR is: ");
     male = 66 + (6.2*weight) + (12.7*height) - (6.76*age);
     System.out.println(male);
		 System.out.print("If you are a woman your BMR is: ");
     female = 655.1 + (4.35*weight) + (4.7*height) - (4.7*age);
     System.out.println(female);
	}
}
