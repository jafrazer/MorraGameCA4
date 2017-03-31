package sdev.ca.pbl.morra;

import java.util.Scanner;

/**
 * 
 * 
 * 
 */
public class Morra {

  /**
   * @param args
   * 
   * @author johnfrazer - x16138015
   */
  public static void main(String[] args) {

    Scanner keyboardIn = new Scanner(System.in);

    boolean odds = playerTypeSelectionMenu(keyboardIn);

    keyboardIn.close();
  }

  /**
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  private static boolean playerTypeSelectionMenu(Scanner keyboardIn) {
    boolean odds = true;
    boolean loopCondition = true;

    do {
      System.out.println("Please select if you are: \n\t1. Odds (default) \n\t2. Evens");
      int playerSelection = keyboardIn.nextInt();

      // TODO: investigate if we can add a quit option to the menu

      switch (playerSelection) {
      case 1:
        // Player has selected Odds
        odds = true;
        // exit the loop
        loopCondition = false;
        break;
      case 2:
        // Player has selected Evens
        odds = false;
        // exit the loop
        loopCondition = false;
        break;
      default:
        // Error: user input something other than 1 or 2.
        System.out.println("Invalid selection. Try again.\n");
        break;
      }
    } while (loopCondition);

    return odds;
  }

}
