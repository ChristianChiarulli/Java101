/* Christian Chiarull
* 10 Jul, 11:21
* sec 002
* Calorie project
*/ 


import java.util.Scanner;

public class Calories{
  public static void main(String[] args){

    Scanner user_input = new Scanner(System.in);
    // this part of the code prompts the user to input their arguments for height weight, gender nad activity level
    System.out.println("This program will calculate the number of 230 calorie\ncandy bars to eat to maintain your weight.\n");

    System.out.print("\t[Q1] What is your age in years? ");
    int age = user_input.nextInt();
    System.out.print("\t[Q2] What is your total height in inches? ");
    double height = user_input.nextDouble();
    System.out.print("\t[Q3] What is your weight in pounds? ");
    double weight = user_input.nextDouble();
    System.out.print("\t[Q4] Enter 'M' (or 'm') for male calculation or 'F' (or 'f') for female: ");
    char gender = user_input.next().charAt(0);
    System.out.println("\t[Q5]Are you:");
    System.out.println("\t\tA. Sedentary\n\t\tB. Somewhat active (exercise occasionally)\n\t\tC. Active (exercise 3-4 days per week)\n\t\tD. Highly active (exercise every day)\n");

    System.out.print("\t\tEnter A, B, C, or D: ");
    char activity = user_input.next().charAt(0);

    double BMR=0;
      // picks calculation based on gender
      switch(gender){
        case 'F':
        case 'f':
        BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        // checks activity for female
        switch(activity){
          case 'A':
          BMR += BMR*.2;
          System.out.println("\n\tWith those measurements, you should eat " + BMR/230 +" candy bars per day\n\tto maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
          case 'B':
          BMR += BMR*.3;
          System.out.println("\n\tWith those measurements, you should eat " + BMR/230 +" candy bars per day\n\tto maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
          case 'C':
          BMR += BMR*.4;
          System.out.println("\n\tWith those measurements, you should eat " + BMR/230 +" candy bars per day\n\tto maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
          case 'D':
          BMR += BMR*.5;
          System.out.println("\n\tWith those measurements, you should eat " + BMR/230 +" candy bars per day\n\tto maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
          default:
          // displays if wrong entryt for activity
          System.out.println("\nInvalid entry for activity");
          System.out.println("Program ended.");
        }
        break;
        case 'M':
        case 'm':
        BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        // checks activity for males
        switch(activity){
          case 'A':
          BMR += BMR*.2;
          System.out.println("\n\tWith those measurements, you should eat " + BMR/230 +" candy bars per day\n\tto maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
          case 'B':
          BMR += BMR*.3;
          System.out.println("\n\tWith those measurements, you should eat " + BMR/230 +" candy bars per day\n\tto maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
          case 'C':
          BMR += BMR*.4;
          System.out.println("\n\tWith those measurements, you should eat " + BMR/230 +" candy bars per day\n\tto maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
          case 'D':
          BMR += BMR*.5;
          System.out.println("\n\tWith those measurements, you should eat " + BMR/230 +" candy bars per day\n\tto maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
          default:
          // displays if wrong entryt for activity
          System.out.println("\nInvalid entry for activity");
          System.out.println("Program ended.");
        }
        break;
        default:
        // displays if wrong entry for gender
        System.out.println("\nInvalid entry for gender.");
        System.out.println("Program ended.");
      }
  }
}
