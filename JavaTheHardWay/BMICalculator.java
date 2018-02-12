import java.util.Scanner;

public class BMICalculator {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double i, lb, m, bmi;

    System.out.print("Your height in inches: ");
    i = keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    lb = keyboard.nextDouble();

    m = i*.0254; //This is a conversion formula from inches to meters.

    bmi = (lb*.453592) / (m*m);
    //A lb is equivalent to .453592 kg.
    //An inch is equivalent to .0254 meters.

    System.out.println("Your BMI is " + bmi);
  }
}
