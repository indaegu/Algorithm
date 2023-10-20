import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    int T;
    T = sc.nextInt();
    int a, b, mok, add = 0;
    for (int i = 1; i <= T; i++) {
      System.out.print("#" + i);
      a = sc.nextInt();
      b = sc.nextInt();
      if(a>b){
        System.out.print(" >\n");
      } else if (a==b) {
        System.out.print(" =\n");
      } else{
        System.out.print(" <\n");
      }
    }
  }
}

