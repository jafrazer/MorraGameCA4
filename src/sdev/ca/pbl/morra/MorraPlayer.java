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
  private int[] fingerHistory = new int[10];
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
   * TODO: javadoc
   * 
   * @return
   * 
   * @author johnfrazer - x16138015
   */
  public void updateFingerHistory(int roundNumber) {
    fingerHistory[roundNumber] = getFingers();
  }

  /**
   * TODO: javadoc
   * 
   * @return
   * 
   * @author johnfrazer - x16138015
   */
  public void printFingerHistory() {
    for (int fingers : this.fingerHistory) {
      if (fingers != 0) {
        System.out.print(fingers + ", ");
      }
    }
  }

  /**
   * TODO: javadoc
   * 
   * @return
   * 
   * @author johnfrazer - x16138015
   */
  public void wonRound() {
    this.roundsWon++;
  }

  /**
   * TODO: javadoc
   * 
   * @return
   * 
   * @author johnfrazer - x16138015
   */
  public int getRoundsWonCount() {
    return this.roundsWon;
  }
}
