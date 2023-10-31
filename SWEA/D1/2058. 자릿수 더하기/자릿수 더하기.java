import java.io.FileInputStream;
import java.net.Proxy;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    String N = sc.next();
    int sum = 0;
    for (int i = 0; i < N.length(); i++) {
      sum += Integer.parseInt(String.valueOf(N.charAt(i)));
    }
    System.out.println(sum);
  }
}
