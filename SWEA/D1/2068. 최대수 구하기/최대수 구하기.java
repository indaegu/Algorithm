import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    int T;
    T = sc.nextInt();
    int[] num = new int[10];
    int max = 0;
    for (int j = 1; j <= T; j++) {
      System.out.print("#" + j + " ");
      for (int i = 0; i < 10; i++) {
        num[i] = sc.nextInt();
        if (num[i] > max) max = num[i];
      }
      System.out.print(max + " \n");
      max = 0;
    }
  }
}

