import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      int N = sc.nextInt();
      System.out.println("#" + test_case + " ");
      int[][] triangle = new int[N][N];

      triangle[0][0] = 1; //최상위 층은 1로 고정
      for (int i = 0; i < N; i++) {
        triangle[i][0] = 1; // 각 층의 첫번째는 모두 1로 고정
        triangle[i][i] = 1; // 각 층의 마지막은 모두 1로 고정
      }


      for (int i = 2; i < N; i++) {
        for (int j = 1; j < i; j++) {
          triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j]; // 나머지는 본인의 위층의 이전값고 위층의 같은 열의 값을 더한값
        }
      }

      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          if (triangle[i][j] != 0) {
            System.out.print(triangle[i][j] + " "); // 0이 아닐때마다 출력
          }
        }
        System.out.println();
      }
    }
  }
}

