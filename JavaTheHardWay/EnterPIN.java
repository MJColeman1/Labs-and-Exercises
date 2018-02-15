import java.util.Scanner;
import static java.lang.System.*;

public class EnterPIN {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner (System.in);
    int pin, entry;
    String password, verify;

    pin = 12345;
    password = "Ruby";

    out.println ("WELCOME TO THE BANK OF JAVA.");
    out.print ("ENTER YOUR PASSWORD: ");
    verify = keyboard.next();

    while (! verify.equals(password) ) {
        out.println("\nINCORRECT PASSWORD. TRY AGAIN.");
        out.print("ENTER YOUR PASSWORD: ");
        verify = keyboard.next();
    }

    out.print ("ENTER YOUR PIN: ");
    entry = keyboard.nextInt();

    while (entry != pin) {
        out.println("\nINCORRECT PIN. TRY AGAIN.");
        out.print("ENTER YOUR PIN: ");
        entry = keyboard.nextInt();
    }

    out.println("\nPIN ACCEPTED. YOUR ACCOUNT BALANCE IS $425.17");
  }
}
