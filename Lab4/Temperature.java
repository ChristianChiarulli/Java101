/*
*Christian Chiarulli
*11 Jul, 12.01
*sec 002
*Convert Temperature project
*/


import java.util.Scanner;

public class Temperature{
  public static void main(String[] args){

    double temperature, Cel=0, Fah=0, new_temp=0;
    char type;

    Scanner user_input = new Scanner(System.in);

    System.out.println("Welcome to Temple Weather Channel");
    System.out.println("Temperature Conversion Program\n");

    System.out.print("\t[Q1] Enter a temperature in degrees (for example 29.6): ");
    temperature = user_input.nextDouble();
    System.out.print("\t[Q2] Enter 'F' (or 'f') for Fahrenheit or 'C' (or 'c') for Celsius: ");
    type = user_input.next().charAt(0);

    System.out.print("\n");

    switch(type){
    case 'c':
    case 'C':
      new_temp = (9*temperature/5) +32;
      System.out.println("\t" + temperature + " degrees C = " + new_temp + " degrees Fahrenheit\n");
      System.out.println("Program ended");
      break;
    case 'f':
    case 'F':
      new_temp = 5*(temperature -32)/9;
      System.out.println("\t" + temperature + " degrees F = " + new_temp + " degrees Celsius\n");
      System.out.println("Program ended");
      break;
    default:
      System.out.println("\tUnknown units -");
      System.out.println("\tCannot do calculation -");
      System.out.println("\tPlease next time enter either 'F' for Fahrenheit of 'C' for Celsius.\n");
      System.out.println("Program ended");
    }



  }
}
