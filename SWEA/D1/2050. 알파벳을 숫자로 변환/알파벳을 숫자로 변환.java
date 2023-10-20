import java.io.FileInputStream;
import java.util.Scanner;
public class Solution {
  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    String str;
    str = sc.next();
    for (int i = 0; i < str.length(); i++) {
      System.out.print(Integer.valueOf(str.charAt(i))-64 + " ");
    }
  }
}

