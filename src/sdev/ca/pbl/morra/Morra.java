package sdev.ca.pbl.morra;

import java.util.Scanner;

/**
 * TODO: JavaDoc
 */
public class Morra {

  /**
   * TODO: JavaDoc
   * 
   * @param args
   * 
   * @author johnfrazer - x16138015
   */
  public static void main(String[] args) {

    Scanner keyboardIn = new Scanner(System.in);

    MorraPlayer player = new MorraPlayer();
    MorraCPUPlayer cpu = new MorraCPUPlayer();

    boolean playAgain = true;

    do {
      // Prompt user if they wish to be Odds or Evens
      boolean playerSelectedOdds = humanPlayerTypeSelectionMenu(keyboardIn);

      // Set the player and cpu types based on the user selection
      setPlayerTypes(player, cpu, playerSelectedOdds);

      /* START ROUND */

      // User selection of number of fingers (1 and 10)
      player.setFingers(getPlayerFingerCount(keyboardIn));

      // Computer selection of number of fingers (1 and 10)
      cpu.setFingers();

      // Displays the computer’s choice
      System.out.println("CPU Fingers: " + cpu.getFingers());

      // Score calculation
      /*
       * The winner of the round is decided based on the sum of ﬁngers shown by
       * both players, namely if the sum is an even number then the “Evens”
       * player wins, otherwise if the sum is an odd number then the “Odds”
       * player wins. The winner of the round receives two points.
       * 
       * In addition, the player whose number of fingers is closer to the sum,
       * receives one extra point.
       */

      // Display round winner

      // Display the current score

      /* END ROUND */

      // The winner of the game is the ﬁrst player who accumulates six points.

      // A game ﬁnishes when one of the players accumulates 6 points.
      // At the end of a game, the game displays who the winner is, and a
      // history of the numbers of ﬁngers shown by both the user and the
      // computer per round.

      // ask the player if they would like to play another game.
      playAgain = playAnotherGame(keyboardIn);

    } while (playAgain);

    // At the end of all games, display a history of games played.

    // The history shows for each game the number of rounds won and lost by the
    // human player, and how many even and odd numbers have been chosen by each
    // player, and the extra points received by the player per game.

    // All the history elements of the game should be coded using Arrays.

    keyboardIn.close();
  }

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  private static boolean playAnotherGame(Scanner keyboardIn) {
    boolean playAgain = false;
    boolean playAgainLoopCondition = false;
    do {
      System.out.println("Would you like to play again? Y/N");
      String playAgainStr = keyboardIn.nextLine();

      if (playAgainStr.equalsIgnoreCase("Y")) {
        playAgain = true;
        playAgainLoopCondition = true;

      } else if (playAgainStr.equalsIgnoreCase("N")) {
        playAgain = false;
        playAgainLoopCondition = true;

      }
    } while (!playAgainLoopCondition);

    return playAgain;
  }

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  private static boolean humanPlayerTypeSelectionMenu(Scanner keyboardIn) {
    boolean odds = true;
    boolean loopCondition = true;

    do {
      System.out.println("Select if you are: \n\t1. Odds \n\t2. Evens");
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

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  private static void setPlayerTypes(MorraPlayer player, MorraCPUPlayer cpu, boolean playerIsOdds) {
    if (playerIsOdds) {
      player.setAsOdds();
      cpu.setAsEvens();
    } else {
      player.setAsEvens();
      cpu.setAsOdds();
    }
  }

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  private static int getPlayerFingerCount(Scanner keyboardIn) {
    int playerFingers = 0;

    do {
      System.out.println("Enter your Morra Fingers Guess: ");
      playerFingers = keyboardIn.nextInt();
    } while (playerFingers < 0 || playerFingers > 10);

    return playerFingers;
  }

}
