import java.io.FileInputStream;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    int result = minBags(N);
    System.out.println(result);
    }
  private static int minBags(int N) {
    int bagsOf5 = N / 5; // 들어갈 수 있는 최대의 5kg 봉지의 개수를 구함
    for (int i = bagsOf5; i >= 0; i--) { // 5kg 봉지를 최대로 넣는거 부터 시작해서 점점 낮춰가며 넣음
      int remaining = N - (i * 5); // 5kg 봉지를 최대로넣고 남은 값을 저장해둠
      if (remaining % 3 == 0) { // 만약 남은 값이 3으로 나누어 떨어진다면
        return i + (remaining / 3); // 5킬로그램 봉지의 개수와 남은무게를 3으로 나누어 나온 3kg봉지의 개수 합을 반환
      }
    }
    return -1; // 정확히 N킬로그램을 만들 수 없는 경우
  }
}
