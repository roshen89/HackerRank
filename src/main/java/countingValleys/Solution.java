package countingValleys;

/**
 * @author ROSH - 1/23/2020
 */
public class Solution {

  // Complete the countingValleys function below.
  static int countingValleys(int n, String s) {

    int v = 0;     // # of valleys
    int lvl = 0;   // current level
    for (char c : s.toCharArray()) {
      if (c == 'U') {
        ++lvl;
      }
      if (c == 'D') {
        --lvl;
      }

      // if we just came UP to sea level
      if (lvl == 0 && c == 'U') {
        ++v;
      }
    }
    return v;
  }

}
