package sdev.ca.pbl.morra;

/**
 * @author johnfrazer - x16138015
 */
public class MorraPlayer {
  private boolean isOdds = true;
  private int fingers = 0;
  private int playerScore = 0;

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  public MorraPlayer() {
    // TODO Auto-generated constructor stub
  }

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  public int getFingers() {
    return this.fingers;
  }

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  public void setFingers(int fingers) {
    this.fingers = fingers;
  }

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  public void updateScore(int newPointsScored) {
    playerScore += newPointsScored;
  }

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  public int checkScore() {
    return this.fingers;
  }

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  public void setAsOdds() {
    this.isOdds = true;
  }

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  public void setAsEvens() {
    this.isOdds = false;
  }
}
