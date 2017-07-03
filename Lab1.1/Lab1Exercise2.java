import java.util.Scanner;

class RectangleArea{
	public static void main(String[] args){

	   Scanner user_input = new Scanner(System.in);
     int length;
     int height;
     int result;
     System.out.println("This program will calculate the area of a rectangle");
     System.out.print("Enter a length: ");
	   length = user_input.nextInt();
     System.out.print("Enter a height: ");
     height = user_input.nextInt();
     System.out.print("The area of the recatngle is: ");
     result = length*height;
     System.out.println(result);



	}

}
