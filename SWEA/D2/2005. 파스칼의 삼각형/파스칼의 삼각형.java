import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      int N = sc.nextInt();
      System.out.println("#" + test_case + " ");
      method(N);
    }
  }

  public static void method(int N) {
    // 첫 번째 줄은 항상 1
    System.out.println(1);

    if (N == 1) return; // N이 1이면 여기서 종료

    // 2D 배열을 사용하여 파스칼의 삼각형을 저장
    int[][] triangle = new int[N][N];
    triangle[0][0] = 1;

    for (int i = 1; i < N; i++) {
      for (int j = 0; j <= i; j++) {
        // 왼쪽 위의 숫자
        if (j > 0) {
          triangle[i][j] += triangle[i-1][j-1];
        }
        // 오른쪽 위의 숫자
        if (j < i) {
          triangle[i][j] += triangle[i-1][j];
        }
      }

      // 한 줄 출력
      for (int j = 0; j <= i; j++) {
        System.out.print(triangle[i][j] + " ");
      }
      System.out.println(); // 줄 바꿈
    }
  }
}
