package sdev.ca.pbl.morra;

/**
 * @author johnfrazer - x16138015
 */
public class MorraPlayer {
  private boolean isOdds = true;
  private int fingers = 0;
  private int score = 0;

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
  public void roundWinnerPointsUpdate() {
    score += 2;
  }

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  public void closerToTheSumBonusPointUpdate() {
    score += 1;
  }

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  public int checkScore() {
    return this.score;
  }

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  public void resetScore() {
    this.score = 0;
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

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  public boolean isPlayerOdds() {
    return this.isOdds;
  }
}
