import java.util.Scanner;

public class CaloriesAdvanced{
  public static void main(String[] args){

    Scanner user_input = new Scanner(System.in);
    // this part of the code prompts the user to input their arguments for height weight, gender nad activity level
    System.out.println("This program will calculate the number of 230 calorie\ncandy bars to eat to maintain your weight.\n");

    System.out.print("\t[Q1] What is your first name? ");
    String first = user_input.next();
    System.out.print("\t[Q2] What is your last name? ");
    String last = user_input.next();
    System.out.print("\t[Q3] What is your age in years? ");
    int age = user_input.nextInt();
    //converts name to uppercase
    first = first.toUpperCase();
    last = last.toUpperCase();
    //catch age error
    if(age < 1 || age > 125){
      System.out.println("\n\t" + first + " " + last + ", you have entered Invalid entry for age.\n\nProgram ended.");
      System.exit(0);
    }
    System.out.print("\t[Q4] What is your total height in inches? ");
    double height = user_input.nextDouble();
    //catch height error
    if(height < 1 || height > 108){
      System.out.println("\n\t" + first + " " + last + ", you have entered Invalid entry for height.\n\nProgram ended.");
      System.exit(0);
    }
    System.out.print("\t[Q5] What is your weight in pounds? ");
    double weight = user_input.nextDouble();
    //catch weight error
    if(weight < 1 || weight > 1400){
      System.out.println("\n\t" + first + " " + last + ", you have entered Invalid entry for weight.\n\nProgram ended.");
      System.exit(0);
    }
    System.out.print("\t[Q6] Enter \"Male\" or \"Female\": ");
    String gender = user_input.next();
    gender = gender.toUpperCase();
    //catch gender error
    if(!(gender.equals("MALE") || gender.equals("FEMALE"))){
      System.out.println("\n\t" + first + " " + last + ", you have entered Invalid entry for gender.\n\nProgram ended.");
      System.exit(0);
    }
    System.out.println("\t[Q7] What is your Activity Level?");
    System.out.println("\t\tA. Sedentary\t(Little or no exercise)\n\t\tB. Moderate\t(exercise occasionally)\n\t\tC. Vigorous\t(exercise 3-4 days per week)\n\t\tD. Extreme\t(exercise every day)\n");

    System.out.print("\t\tEnter Sedentary, Moderate, Vigorous, or Extreme: ");
    String activity = user_input.next();
    activity = activity.toLowerCase();
    //catch activity error
    if(!(activity.equals("sedentary") || activity.equals("moderate") || activity.equals("vigorous") || activity.equals("extreme"))){
      System.out.println("\n\t" + first + " " + last + ", you have entered Invalid entry for activity.\n\nProgram ended.");
      System.exit(0);
    }

    double BMR=0;
      // picks calculation based on gender
      switch(gender){
        case "FEMALE":
        BMR = 655 + (4.3 * weight) + (4.7 * height) - (4.7 * age);
        // checks activity for female
        switch(activity){
          case "sedentary":
          BMR += BMR*.2;
          System.out.println("\n\t" + first + " " + last + ", With those measurements, you should eat " + BMR/230 +" candy bars\n\tper day to maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
          case "moderate":
          BMR += BMR*.3;
          System.out.println("\n\t" + first + " " + last + ", With those measurements, you should eat " + BMR/230 +" candy bars\n\tper day to maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
          case "vigorous":
          BMR += BMR*.4;
          System.out.println("\n\t" + first + " " + last + ", With those measurements, you should eat " + BMR/230 +" candy bars\n\tper day to maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
          case "extreme":
          BMR += BMR*.5;
          System.out.println("\n\t" + first + " " + last + ", With those measurements, you should eat " + BMR/230 +" candy bars\n\tper day to maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
        }
        break;
        case "MALE":
        BMR = 66 + (6.3 * weight) + (12.9 * height) - (6.8 * age);
        // checks activity for males
        switch(activity){
          case "sedentary":
          BMR += BMR*.2;
          System.out.println("\n\t" + first + " " + last + ", With those measurements, you should eat " + BMR/230 +" candy bars\n\tper day to maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
          case "moderate":
          BMR += BMR*.3;
          System.out.println("\n\t" + first + " " + last + ", With those measurements, you should eat " + BMR/230 +" candy bars\n\tper day to maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
          case "vigorous":
          BMR += BMR*.4;
          System.out.println("\n\t" + first + " " + last + ", With those measurements, you should eat " + BMR/230 +" candy bars\n\tper day to maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
          case "extreme":
          BMR += BMR*.5;
          System.out.println("\n\t" + first + " " + last + ", With those measurements, you should eat " + BMR/230 +" candy bars\n\tper day to maintain the same weight.\n");
          System.out.println("Program ended.");
          break;
          default:
        }
      }
  }
}
