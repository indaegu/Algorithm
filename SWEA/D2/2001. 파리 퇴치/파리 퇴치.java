import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[][] Marr = new int[N][N];
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          Marr[i][j] = sc.nextInt();
        }
      }
      System.out.println("#" + test_case + " " + getMaxFlies(Marr, N, M));
    }
  }

  public static int getMaxFlies(int[][] Marr, int N, int M) {
    int maxFlies = 0;
    for (int i = 0; i <= N - M; i++) { // M*M 배열의 시작점을 지정하기 위한 2중 반복분
      for (int j = 0; j <= N - M; j++) {
        int flies = 0;
        for (int k = i; k < i + M; k++) { // M*M 배열의 크기 만큼 수색을 진행할 반복문
          for (int l = j; l < j + M; l++) {
            flies += Marr[k][l];
          }
        }
        maxFlies = Math.max(maxFlies, flies);
      }
    }
    return maxFlies;
  }
}
