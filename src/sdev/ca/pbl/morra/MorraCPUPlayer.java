package sdev.ca.pbl.morra;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 */
public class MorraCPUPlayer extends MorraPlayer {

  public MorraCPUPlayer() {
    // TODO Auto-generated constructor stub
  }

  @Override
  public int getFingers() {
    return ThreadLocalRandom.current().nextInt(1, 10 + 1);
  }
}
