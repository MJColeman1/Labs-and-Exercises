import java.util.Scanner;

public class RudeQuestions {
  public static void main(String[] args){
    String name, day;
    int age;
    double weight, income;

    Scanner keyboard = new Scanner(System.in);

    System.out.print("Hello. What is your name? ");
    name = keyboard.next();

    System.out.print("Hi, " + name + "! How old are you? ");
    age = keyboard.nextInt();

    System.out.println ("So you're " + age + ", eh? That's not very old.");
    System.out.print("How much do you weigh, " + name + "? ");
    weight = keyboard.nextDouble();

    System.out.println (weight + "! Better keep that quiet!!");
    System.out.print("Finally, what's your income " + name + "? ");
    income = keyboard.nextDouble();

    System.out.print("Hopefully that is " + income + " per hour");
    System.out.println(" and not per year!");

    System.out.print("By the way, what day of the week is it? ");
    day = keyboard.next();
    System.out.println("Thanks! I forgot it's " + day + ".");

    System.out.print("Well thanks for answering my rude questions, ");
    System.out.println(name + ".");
  }
}

/* For Study Drill 1, the program does not blow up if you enter an integer value when it is expecting a double.
A double, or floating point value, can store either a whole number or decimal/fractional value, whereas an int
variable can only store whole numbers. */

/* For Study Drill 2, the program does not blow up if you enter a numeric value when it is expecting a String
because a string can hold almost any value you store in it as long as that value is surrounded by quotation marks. */

/* For Study Drill 3, hitting the escape key as input for the string value causes the program to blow up.
Entering a word or letter when the program is expecting an integer or floating point value also causes it to blow up. */
