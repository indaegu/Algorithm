import java.io.FileInputStream;
import java.util.*;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
      Scanner sc = new Scanner(System.in);
      int T = sc.nextInt();

      // 10개의 평점 정의
      String[] grades = {"A+", "A0", "A-", "B+", "B0", "B-", "C+", "C0", "C-", "D0"};

      for (int test_case = 1; test_case <= T; test_case++) {
        int N = sc.nextInt(); // 학생 수
        int K = sc.nextInt() - 1;  // 0-based index로 변환, 찾고 싶은 학생의 index

        // 각 학생의 총점을 저장할 배열
        Double[] totalScores = new Double[N];

        for (int i = 0; i < N; i++) {
          double mid = sc.nextDouble();
          double finalExam = sc.nextDouble();
          double assignment = sc.nextDouble();

          // 총점 계산
          totalScores[i] = mid * 0.35 + finalExam * 0.45 + assignment * 0.20;
        }

        // K 번째 학생의 총점 저장
        double kScore = totalScores[K];

        // 총점을 내림차순으로 정렬
        // 내림차순으로 정렬 방식을 바꾸려면  Comparator.reverseOrder()
        // 옵션을 사용해야함
        // String 배열의 경후 Collection.reverseOrder()로 가능
        Arrays.sort(totalScores, Comparator.reverseOrder());

        // K 번째 학생의 등수를 찾는다.
        int rank = Arrays.asList(totalScores).indexOf(kScore);

        // 학점 부여
        // K번째 학생의 등수 * 10개의 등급 / 총 학생수 = K번째 학생의 등급
        String grade = grades[rank * grades.length / N];

        System.out.println("#" + test_case + " " + grade);
      }
    }
}
