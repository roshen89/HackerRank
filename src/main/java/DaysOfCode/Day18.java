package DaysOfCode;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

/**
 * @author ROSH - 2/19/2020
 */
public class Day18 {

  // Write your code here.
  Deque<Character> stack = new ArrayDeque<>();
  Queue<Character> queue = new LinkedList<>();

  void pushCharacter(Character ch) {
    stack.push(ch);
  }

  void enqueueCharacter(char ch) {
    queue.add(ch);
  }

  char popCharacter() {
    return stack.pop();
  }

  char dequeueCharacter() {
    return queue.remove();
  }


  public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    String input = scan.nextLine();
    scan.close();

    // Convert input String to an array of characters:
    char[] s = input.toCharArray();

    // Create a Solution object:
    Day18 p = new Day18();

    // Enqueue/Push all chars to their respective data structures:
    for (char c : s) {
      p.pushCharacter(c);
      p.enqueueCharacter(c);
    }

    // Pop/Dequeue the chars at the head of both data structures and compare them:
    boolean isPalindrome = true;
    for (int i = 0; i < s.length / 2; i++) {
      if (p.popCharacter() != p.dequeueCharacter()) {
        isPalindrome = false;
        break;
      }
    }

    //Finally, print whether string s is palindrome or not.
    System.out.println("The word, " + input + ", is "
        + ((!isPalindrome) ? "not a palindrome." : "a palindrome."));
  }

}
