import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Solution {
  public static void main(String[] args) throws FileNotFoundException {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();

    for (int i = 1; i <= N; i++) {
      String numStr = String.valueOf(i); // int형으로 받은 수를 문자열 타입으로 저장한다.
      int count = 0; // 369의 개수를 카운트할 변수 생성

      // 숫자를 문자열로 변환하여 3, 6, 9의 개수를 확인
      for (int j = 0; j < numStr.length(); j++) { // 문자열의 각 인덱스에 접근하기 위한 for문
        char ch = numStr.charAt(j); // charAt() : 문자열의 특정 인덱스에 있는 문자를 반환하는 함수
        if (ch == '3' || ch == '6' || ch == '9') {
          count++;
        }
      }


      if (count == 0) {
        // 3, 6, 9가 포함되어 있지 않은 경우 숫자 출력
        System.out.print(i + " ");
      } else {
        // 3, 6, 9가 포함된 경우, 해당 개수만큼 '-' 출력
        for (int j = 0; j < count; j++) {
          System.out.print("-");
        }
        System.out.print(" ");
      }
    }
  }
}
