package sdev.ca.pbl.morra;

import java.util.Scanner;

/**
 * “Morra” is a hand game that has many variations and can be played by two or
 * more players.
 * 
 * In this variation of the game, one player is going to be the “Odds” player
 * and the other player “Evens”. In each round of the game, the players will
 * simultaneously "hold out" between 1 and 10 fingers. The winner of the round
 * is decided based on the sum of ﬁngers shown by both players. If the sum is an
 * even number, then the “Evens” player wins; otherwise, if the sum is an odd
 * number, then the “Odds” player wins. The winner of the round receives two
 * points.
 * 
 * In addition, the player whose number of fingers is closer to the sum,
 * receives one extra point.
 */
public class MorraGameLogic {

  /**
   * Default constructor for MorraGameLogic.
   * 
   * @author johnfrazer - x16138015
   */
  public MorraGameLogic() {
    // This constructor is intentionally empty.
  }

  /**
   * This method is for the player to select their player type, Odds or Evens.
   * 
   * @param keyboardIn
   *          The scanner object for accepting user input.
   * 
   * @return Player has selected odds indicator.
   * 
   * @author johnfrazer - x16138015
   */
  public boolean humanPlayerTypeSelectionMenu(Scanner keyboardIn) {
    boolean selectedOdds = true;
    boolean loopCondition = true;

    do {
      System.out.println("Select if you are: \n\t1. Odds \n\t2. Evens");
      int playerSelection = keyboardIn.nextInt();

      switch (playerSelection) {
      case 1:
        // Player has selected Odds
        selectedOdds = true;
        // exit the loop
        loopCondition = false;
        break;
      case 2:
        // Player has selected Evens
        selectedOdds = false;
        // exit the loop
        loopCondition = false;
        break;
      default:
        // Error: user input something other than 1 or 2.
        System.out.println("Invalid selection. Try again.\n");
        break;
      }

    } while (loopCondition);

    return selectedOdds;
  }

  /**
   * In this method, the player and cpu users are set as Odds or Evens, based on
   * the player's selection.
   * 
   * @param player
   *          The human player object.
   * @param cpu
   *          The CPU player object.
   * @param playerSelectedOdds
   *          A boolean value noting if the human player has selected to be Odds
   *          or not.
   * 
   * @author johnfrazer - x16138015
   */
  public void setPlayerTypes(MorraPlayer player, MorraCPUPlayer cpu, boolean playerSelectedOdds) {
    if (playerSelectedOdds) {
      // if the player has selected odds, set the player as odds, and the cpu as
      // evens.
      player.setAsOdds();
      cpu.setAsEvens();
    } else {
      // if the player has NOT selected odds, set the player as evens, and the
      // cpu as odds.
      player.setAsEvens();
      cpu.setAsOdds();
    }
  }

  /**
   * This method gets the number of fingers the player wants to "hold out".
   * 
   * @param keyboardIn
   *          The scanner object for accepting user input.
   * 
   * @return The number of fingers "held out".
   * 
   * @author johnfrazer - x16138015
   */
  public int getPlayerFingerCount(Scanner keyboardIn) {
    int playerFingers = 0;

    do {
      System.out.println("Enter your Morra Fingers Guess: ");
      playerFingers = keyboardIn.nextInt();
    } while (playerFingers < 0 || playerFingers > 10);

    return playerFingers;
  }

  /**
   * This method calculates updates to the players scores in a game round.
   * 
   * The winner of the round is decided based on the sum of ﬁngers shown by both
   * players, namely if the sum is an even number then the “Evens” player wins,
   * otherwise if the sum is an odd number then the “Odds” player wins. The
   * winner of the round receives two points.
   * 
   * In addition, the player whose number of fingers is closer to the sum,
   * receives one extra point.
   * 
   * @param player
   *          The human player object.
   * @param cpu
   *          The CPU player object.
   * 
   * @author johnfrazer - x16138015
   */
  public void calculateScoreChanges(MorraPlayer player, MorraCPUPlayer cpu) {
    int fingersShownTotal = player.getFingers() + cpu.getFingers();

    if (fingersShownTotal % 2 == 0) {
      // result is EVEN; evens player wins
      if (!player.isPlayerOdds()) {
        player.roundWinnerPointsUpdate();
        System.out.println("You win this round!");
      } else if (!cpu.isPlayerOdds()) {
        cpu.roundWinnerPointsUpdate();
        System.out.println("CPU win this round!");
      }
    } else if (fingersShownTotal % 2 == 1) {
      // result is ODD; odds player wins
      if (player.isPlayerOdds()) {
        player.roundWinnerPointsUpdate();
        System.out.println("You win this round!");
      } else if (cpu.isPlayerOdds()) {
        cpu.roundWinnerPointsUpdate();
        System.out.println("CPU win this round!");
      }
    }

    int playerFingersTotalDiff = player.getFingers() - fingersShownTotal;
    int cpuFingersTotalDiff = cpu.getFingers() - fingersShownTotal;

    if (playerFingersTotalDiff < cpuFingersTotalDiff) {
      player.closerToTheSumBonusPointUpdate();
      System.out.println("Your guess was closer to the total, so you win the bonus point!");
    } else {
      cpu.closerToTheSumBonusPointUpdate();
      System.out.println("CPU guess was closer to the total, so CPU wins the bonus point!");
    }
  }

  /**
   * This method compares the player's score to the cpu player's score, and
   * displays the game winner.
   * 
   * @param playerScore
   * @param cpuScore
   * 
   * @author johnfrazer - x16138015
   */
  public void displayGameWinner(int playerScore, int cpuScore) {
    // The winner of the game is the ﬁrst player who accumulates six points.
    if (playerScore > cpuScore) {
      // player wins
      System.out.println("Player wins");
    } else if (playerScore < cpuScore) {
      // cpu wins
      System.out.println("CPU wins!");
    } else {
      // tie game
      System.out.println("Game tied!");
    }
  }

  /**
   * TODO: JavaDoc
   * 
   * @author johnfrazer - x16138015
   */
  public void displayRoundHistory() {
    // A game ﬁnishes when one of the players accumulates 6 points.
    // At the end of a game, the game displays who the winner is, and a
    // history of the numbers of ﬁngers shown by both the user and the
    // computer per round.

    // TODO
  }

  /**
   * This method asks the user if they would like to play another game.
   * 
   * @param keyboardIn
   *          The scanner object for accepting user input.
   * 
   * @return Player decision to play another game.
   * 
   * @author johnfrazer - x16138015
   */
  public boolean playAnotherGame(Scanner keyboardIn) {
    boolean playAgain = false;
    boolean playAgainLoopCondition = false;

    do {
      System.out.println("Would you like to play again? Y/N");
      String playAgainStr = keyboardIn.next();

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
   * @author johnfrazer - x16138015
   */
  public void displayFullGameHistory() {

    // The history shows for each game the number of rounds won and lost by the
    // human player, and how many even and odd numbers have been chosen by each
    // player, and the extra points received by the player per game.

    // All the history elements of the game should be coded using Arrays.

    // TODO
  }

}
