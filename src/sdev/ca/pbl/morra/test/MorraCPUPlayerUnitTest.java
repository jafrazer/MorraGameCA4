package sdev.ca.pbl.morra.test;

import sdev.ca.pbl.morra.MorraCPUPlayer;

public class MorraCPUPlayerUnitTest {

  public static void main(String[] args) {
    test_getFingersIsZeroToTenRandom();
  }

  private static void test_getFingersIsZeroToTenRandom() {
    MorraCPUPlayer cpu = new MorraCPUPlayer();

    for (int i = 0; i <= 100; i++) {
      System.out.println(cpu.getFingers());
    }
  }
}
