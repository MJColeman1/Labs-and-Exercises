import java.util.Scanner;

public class BMICategories {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double bmi;

    System.out.print ("Enter your BMI: ");
    bmi = keyboard.nextDouble();

    System.out.print ("BMI category: ");
    if (bmi < 15.0) {
        System.out.println ("Very severely underweight");
    }
    else if (bmi < 16.0) {
        System.out.println ("Severely underweight");
    }
    else if (bmi < 18.5) {
        System.out.println ("Underweight");
    }
    else if (bmi < 25.0) {
        System.out.println ("Normal weight");
    }
    else if (bmi < 30.0) {
        System.out.println ("Overweight");
    }
    else if (bmi < 35.0) {
        System.out.println ("Moderately obese");
    }
    else if (bmi < 40.0) {
        System.out.println ("Severely obese");
    }
    else {
        System.out.println ("Very severely/\"morbidly\" obese");
    }
  }
}
