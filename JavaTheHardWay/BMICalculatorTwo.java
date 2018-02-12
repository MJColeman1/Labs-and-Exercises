import java.util.Scanner;

public class BMICalculatorTwo {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double f, inches, i, lb, m, bmi;

    System.out.print("Your height (feet only): ");
    f = keyboard.nextDouble();

    System.out.print("Your height (inches): ");
    i = keyboard.nextDouble();

    System.out.print("Your weight in pounds: ");
    lb = keyboard.nextDouble();

    inches = f * 12 + i; //This converts the user's separate input from feet and inches into total inches.

    m = inches*.0254; //This is a conversion formula from inches to meters.

    bmi = (lb*.453592) / (m*m);
    //A lb is equivalent to .453592 kg.
    //An inch is equivalent to .0254 meters.

    System.out.println("Your BMI is " + bmi);
  }
}
