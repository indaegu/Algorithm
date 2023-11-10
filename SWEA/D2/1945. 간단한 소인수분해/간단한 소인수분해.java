import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      System.out.print("#" + test_case + " ");
      int N = sc.nextInt();
      int a = 0;
      int b = 0;
      int c = 0;
      int d = 0;
      int e = 0;
      while(N>1){
        if(N%2==0){
          N/=2;
          a++;
        }else if(N%3==0) {
          N/=3;
          b++;
        }else if(N%5==0) {
          N/=5;
          c++;
        }else if(N%7==0) {
          N/=7;
          d++;
        }else if(N%11==0) {
          N/=11;
          e++;
        }
      }
      System.out.printf("%d %d %d %d %d\n",a,b,c,d,e);
    }
  }
}
