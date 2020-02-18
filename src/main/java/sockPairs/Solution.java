package sockPairs;

import java.util.HashSet;
import java.util.Set;

/**
 * @author ROSH - 1/23/2020
 */


public class Solution {

  // Complete the sockMerchant function below.
  static int sockMerchant(int n, int[] ar) {

    Set<Integer> colors = new HashSet<>();
    int pairs = 0;

    for (int i = 0; i < n; i++) {
      if (!colors.contains(ar[i])) {
        colors.add(ar[i]);
      } else {
        pairs++;
        colors.remove(ar[i]);
      }
    }
    System.out.println(pairs);
    return pairs;
  }

}
