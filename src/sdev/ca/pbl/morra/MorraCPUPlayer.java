package sdev.ca.pbl.morra;

import java.util.concurrent.ThreadLocalRandom;

/**
 * TODO: JavaDoc
 */
public class MorraCPUPlayer extends MorraPlayer {

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  public MorraCPUPlayer() {
    // TODO Auto-generated constructor stub
  }

  /**
   * TODO: JavaDoc
   * 
   * @param
   * 
   * @author johnfrazer - x16138015
   */
  @Override
  public int getFingers() {
    return ThreadLocalRandom.current().nextInt(1, 10 + 1);
  }
}
