package arrays.leftRotation;

import java.util.Arrays;

/**
 * @author ROSH - 1/23/2020
 */
public class Solution {
  // Complete the rotLeft function below.
  static int[] rotLeft(int[] a, int d) {

    int[] b = new int[a.length];

    for(int i = 0; i<a.length; i++) {

      b[i] = a[(i+d) % a.length];

    }

    return b;
  }

  public static void main(String[] args) {

    int[] c = {5,3,2,1,8,7};

    System.out.println(Arrays.toString(rotLeft(c, 4)));
  }

}
