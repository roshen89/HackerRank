package arrays.newYearChaos;

import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ROSH - 1/23/2020
 */
public class Solution {

  // Complete the minimumBribes function below.
  static void minimumBribes(int[] q) {

    AtomicInteger total = new AtomicInteger();
    for (int i = q.length - 1; i >= 0; i--) {
      if (q[i] - (i + 1) > 2) {
        System.out.println("Too chaotic");
        return;
      }
      for (int j = Math.max(0, q[i] - 2); j < i; j++) {
        if (q[j] > q[i]) {
          total.getAndIncrement();
        }
      }
    }
    System.out.println(total.get());
  }

}
