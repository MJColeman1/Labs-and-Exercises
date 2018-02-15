import java.util.Scanner;
import static java.lang.System.*;

public class CoinFlip {
  public static void main(String[] args) {
    Scanner keyboard = new Scanner(System.in);
    String coin, again;
    int streak = 0;
    boolean gotHeads;

    do {
        gotHeads = Math.random() < 0.5;
        out.println("You flip a coin and it is.... ");

        if (gotHeads)
          coin = "HEADS";
        else
          coin = "TAILS";

          if (gotHeads) {
              streak++;
              out.println("\tHeads! That's " + streak + " in a row....");
              out.print("\tWould you like to flip again (y/n)? ");
              again = keyboard.next();
          }
          else {
            out.println("\tTails! You lose everything!");
            out.println("\tShould've quit while you were aHEAD....");
            streak = 0;
            again = "n";
          }
    }

    while ( again.equals("y") );
        out.println("Final score: " + streak);
  }
}
