package jumpingOnTheClouds;

/**
 * @author ROSH - 1/23/2020
 */
public class Solution {

  // Complete the jumpingOnClouds function below.
  static int jumpingOnClouds(int[] c) {
    int steps = -1;
    for (int i = 0; i < c.length; i++, steps++) {
      if (i < c.length - 2 && c[i + 2] == 0) {
        i++;
      }
    }
    return steps;
  }
}
