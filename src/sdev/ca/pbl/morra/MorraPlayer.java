package sdev.ca.pbl.morra;

/**
 * This is the default Morra Player class.
 * 
 * @author johnfrazer - x16138015
 */
public class MorraPlayer {
  private boolean isOdds = true;
  private int fingers = 0;
  private int score = 0;
  private int[] fingerHistory = new int[1];
  private int roundsWon = 0;

  /**
   * Default constructor for MorraPlayer.
   * 
   * @author johnfrazer - x16138015
   */
  public MorraPlayer() {
    // This constructor is intentionally empty.
  }

  /**
   * Read the player's number of "held out" fingers.
   * 
   * @return
   * 
   * @author johnfrazer - x16138015
   */
  public int getFingers() {
    return this.fingers;
  }

  /**
   * Sets the player's number of "held out" fingers.
   * 
   * @param fingers
   *          The number of fingers the player has chosen to "hold out".
   * 
   * @author johnfrazer - x16138015
   */
  public void setFingers(int fingers) {
    this.fingers = fingers;
  }

  /**
   * Increment the player's score by two points.
   * 
   * @author johnfrazer - x16138015
   */
  public void roundWinnerPointsUpdate() {
    this.score += 2;
  }

  /**
   * Increments the player's score by one point.
   * 
   * @author johnfrazer - x16138015
   */
  public void closerToTheSumBonusPointUpdate() {
    this.score++;
  }

  /**
   * Read the player's current score.
   * 
   * @return The player's current score.
   * 
   * @author johnfrazer - x16138015
   */
  public int checkScore() {
    return this.score;
  }

  /**
   * Reset the player's score to zero.
   * 
   * @author johnfrazer - x16138015
   */
  public void resetScore() {
    this.score = 0;
  }

  /**
   * Set the player as the "Odds" player.
   * 
   * @author johnfrazer - x16138015
   */
  public void setAsOdds() {
    this.isOdds = true;
  }

  /**
   * Set the player as the "Evens" player (or more specifically, set them as not
   * "Odds").
   * 
   * @author johnfrazer - x16138015
   */
  public void setAsEvens() {
    this.isOdds = false;
  }

  /**
   * Reads in the player is "Odds" or "Evens" ("Evens" is noted as not "Odds").
   * 
   * @return If the player is odds or not.
   * 
   * @author johnfrazer - x16138015
   */
  public boolean isPlayerOdds() {
    return this.isOdds;
  }

  /**
   * Add the current player fingers value to the round fingers history array.
   * 
   * @param roundNumber
   *          The current game round (as this is used for an array, counting
   *          should start at 0)
   * 
   * @author johnfrazer - x16138015
   */
  public void updateFingerHistory(int roundNumber) {
    // Create a new array to hold the fingers held out data.
    int[] newFingerHistory = new int[roundNumber + 1];

    // copy the existing data into the new (bigger) array.
    for (int i = 0; i < this.fingerHistory.length; i++) {
      newFingerHistory[i] = this.fingerHistory[i];
    }

    // add the current fingers held out record to the new history.
    newFingerHistory[roundNumber] = getFingers();

    // copy the new history to the class variable.
    this.fingerHistory = newFingerHistory;
  }

  /**
   * Print the players finger history out in the format: X, Y, Z, etc,
   * 
   * @author johnfrazer - x16138015
   */
  public void printFingerHistory() {
    for (int fingers : this.fingerHistory) {
      System.out.print(fingers + ", ");
    }
  }

  /**
   * Print the players finger history out in the format: X, Y, Z, etc,
   * 
   * @author johnfrazer - x16138015
   */
  public void resetFingerHistory() {
    this.fingerHistory = new int[1];
  }

  /**
   * Increase the player's number of rounds won counter.
   * 
   * @author johnfrazer - x16138015
   */
  public void wonRound() {
    this.roundsWon++;
  }

  /**
   * Read the number of rounds the player has won.
   * 
   * @return The current number of rounds the player has won in this game.
   * 
   * @author johnfrazer - x16138015
   */
  public int getRoundsWonCount() {
    return this.roundsWon;
  }
}
