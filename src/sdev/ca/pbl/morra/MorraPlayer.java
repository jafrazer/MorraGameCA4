package sdev.ca.pbl.morra;

/**
 * @author johnfrazer - x16138015
 */
public class MorraPlayer {
  int fingers = 0;
  int playerScore = 0;

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

  public int checkScore() {
    return this.fingers;
  }
}
