package sdev.ca.pbl.morra;

import java.util.concurrent.ThreadLocalRandom;

/**
 * MorraCPUPlayer is an extension of the MorraPlayer.
 * 
 * This class will be used for any work that the computer needs to do in order
 * to replace human interaction.
 */
public class MorraCPUPlayer extends MorraPlayer {

  /**
   * Default constructor for MorraCPUPlayer.
   * 
   * @author johnfrazer - x16138015
   */
  public MorraCPUPlayer() {
    // This constructor is intentionally empty.
  }

  /**
   * This method uses Java ThreadLocalRandom to select a pseudo-random number
   * between 1 and 10 (inclusively) for the CPU controlled player.
   * 
   * @author johnfrazer - x16138015
   */
  public void setFingers() {
    super.setFingers(ThreadLocalRandom.current().nextInt(1, 10 + 1));
  }
}
