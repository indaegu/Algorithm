import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      int N = sc.nextInt();
      System.out.println("#" + test_case);
      int[][] arr = new int[N][N];
      int i = 0;
      int j = -1;
      int direction = 1;
      int cnt = 1;
      while (N>0){
        for (int k = 0; k < N; k++) {
          j+=direction;
          arr[i][j] = cnt++;
        }
        N--;
        for (int k = 0; k < N; k++) {
          i += direction;
          arr[i][j] = cnt++;
        }
        direction = -1 * direction;
      }
      for (int k = 0; k < arr.length; k++) {
        for (int l = 0; l < arr[k].length; l++) {
          System.out.printf("%d ", arr[k][l]);
        }
        System.out.println();
      }
    }
  }
}
