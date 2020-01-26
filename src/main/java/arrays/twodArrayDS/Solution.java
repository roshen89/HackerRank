package arrays.twodArrayDS;

import java.util.HashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * @author ROSH - 1/23/2020
 */
public class Solution {

  // Complete the hourglassSum function below.
  static int hourglassSum(int[][] arr) {

    Set<Integer> sum = new HashSet<>();
    AtomicInteger max = new AtomicInteger(Integer.MIN_VALUE);

    for (int i = 0; i < arr.length - 2; i++) {
      for (int j =0; j < arr.length - 2; j++) {
        sum.add(arr[i][j]+arr[i][j+1]+arr[i][j+2]+arr[i+1][j+1]+arr[i+2][j]+arr[i+2][j+1]+arr[i+2][j+2]);
      }
    }

    sum.forEach(integer -> max.set(Math.max(integer, max.get())));
    return max.get();

  }

}

