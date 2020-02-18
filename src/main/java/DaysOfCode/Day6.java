package DaysOfCode;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * @author ROSH - 2/16/2020
 */
public class Day6 {

  public static void main(String[] args) {

    List<String> strings = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    int testCount = scan.nextInt();
    scan.nextLine();
    for (int i = 0; i < testCount; i++) {
      String s = scan.nextLine();
      strings.add(s);
    }
    for (String soz : strings) {
      StringBuilder stringBuilder = new StringBuilder();
      StringBuilder stringBuilder2 = new StringBuilder();
      for (int i = 0; i < soz.length(); i++) {
        if (i % 2 != 0) {
          stringBuilder.append(soz.charAt(i));
        } else {
          stringBuilder2.append(soz.charAt(i));
        }
      }
      System.out.println(stringBuilder + " " + stringBuilder2);
    }

  }
}
