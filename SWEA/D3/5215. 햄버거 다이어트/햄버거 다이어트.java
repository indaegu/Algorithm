import java.io.FileInputStream;
import java.util.*;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      int N = sc.nextInt(); // 재료의 수
      int L = sc.nextInt(); // 제한 칼로리
      int[] flavor = new int[N]; // 맛 점수 배열
      int[] calories = new int[N]; // 칼로리 배열
      for (int i = 0; i < N; i++) {
        flavor[i] = sc.nextInt(); // 맛 점수
        calories[i] = sc.nextInt(); // 칼로리
      }

      int[] dp = new int[L + 1]; // 다이나믹 프로그래밍 배열 정의, 초기에는 모든 값이 0으로 저장되어 있다.
      for (int i = 0; i < N; i++) { // 재료를 하나씩 넣어보며 순회
        // i번째에서 가져온 재료의 칼로리가 최대 칼로리 보다 같거나 적다면
        // 최대 칼로리를 뒤에서 부터 1씩 낮춰가며 해당 값을 업데이트할 거임
        // 만약 j가 i번째의 재료 칼로리보다 작다면 i번째의 재료를 넣을수 없기 때문에 반복 종료
        for (int j = L; j >= calories[i]; j--) { // ex. 1000 -> 999 -> ...
          // dp[j] : 새로운 재료를 선택하지 않은경우
          // dp[j - calories[i]] + flavor[i] : 새로운 재료를 선택한 경우
          dp[j] = Math.max(dp[j], dp[j - calories[i]] + flavor[i]);//j 칼로리에서 얻을 수 있는 최대 맛점수
        }
      }

      System.out.println("#" + test_case + " " + dp[L]); // 최대 칼로리일때 가장 높았던 맛점수를 출력
    }

    sc.close();
    }
  }

