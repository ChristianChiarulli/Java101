import java.util.Scanner;

public class WaterWell{
	public static void main(String[] args){

	   Scanner user_input = new Scanner(System.in);
     double volume, depth, radius, gallons, pi=3.1415;
     System.out.println("This program calculates how much water will be available in a well\n");
     System.out.print("\tWhat is the radius of the casing in inches? ");
	   radius = user_input.nextInt();
     System.out.print("\tWhat is the depth of the well in feet? ");
	   depth = user_input.nextInt();

     radius = radius / 12;

     volume = pi*radius*radius*depth;
     gallons = volume * 7.48;

     System.out.println("\tThe well contains "+ gallons +" gallons.\n");
     System.out.println("Program successfully ended");
     System.out.println("Please run the program again to do another calculation.");
	}
}
