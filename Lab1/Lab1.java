import java.util.Scanner;

class Hello{
	public static void main(String[] args){
	System.out.println("My favorite computer scientist is Guido Van Rossum\nhe created python\nPython was the successor to the ABC language.\nVan Rossum released it in 1991.");
        System.out.println("Have you  heard of this person before?");
	Scanner user_input = new Scanner(System.in);
        String var;
	var = user_input.next();
	if(var.equals("yes"))
	{
	System.out.println("\"I hope you learned something today!\"");
	}
        else{
	System.out.println("Well go look him up");
	}


	}

}
