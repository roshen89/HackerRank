package repeatedString;

/**
 * @author ROSH - 1/23/2020
 */
public class Solution {

  // Complete the repeatedString function below.
  static long repeatedString(String s, long n) {

    long count = 0;
    for (int i = 0; i < s.length(); i++) {
      if (s.charAt(i) == 'a') {
        count++;
      }
    }

    long div = n / s.length();
    long rem = n % s.length();
    count = count * div;

    for (int i = 0; i < rem; i++) {
      if (s.charAt(i) == 'a') {
        count++;
      }
    }

    return count;

  }

}
