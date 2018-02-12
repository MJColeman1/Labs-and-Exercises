import java.util.Scanner;

public class Sequencing {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    double price, salesTax, total;
    price = 0;

    System.out.println ("How much is the purchase price? ");
    price = keyboard.nextDouble();

    salesTax = price * .0825;
    total = price + salesTax;

    System.out.println("The purchase price is $" + price);
    System.out.println("The sales tax is $" + salesTax);
    System.out.println("The total cost is $" + total);
  }
}
