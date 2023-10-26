import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      int N = sc.nextInt();
      int[][] arr = new int[N][N];
      System.out.print("#" + test_case + "\n");
      for (int i = 0; i < N; i++) { // 2차원 배열 생성
        for (int j = 0; j < N; j++) {
            arr[i][j] = sc.nextInt();
        }
      }
      for (int j = 0; j < N; j++) {
        for (int i = 1; i <= N; i++) {
          System.out.print(arr[N-i][j]);
        }
        System.out.print(" ");
        for (int i = 1; i <= N; i++) {
          System.out.print(arr[N-1-j][N-i]);
        }
        System.out.print(" ");
        for (int i = N; i > 0; i--) {
          System.out.print(arr[N-i][N-1-j]);
        }
        System.out.println();
      }
    }
  }

}
