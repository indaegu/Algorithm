import java.io.FileInputStream;
import java.util.Scanner;
public class Solution {
  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    int num = sc.nextInt();
    int current = 1;
    System.out.printf("%d ",current);
    for (int i = 0; i < num; i++) {
      System.out.printf("%d ",current *= 2);
    }
  }
}