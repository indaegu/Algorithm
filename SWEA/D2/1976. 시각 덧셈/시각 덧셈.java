import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      int hour1 = sc.nextInt();
      int min1 = sc.nextInt();
      int hour2 = sc.nextInt();
      int min2 = sc.nextInt();
      System.out.print("#" + test_case + " ");
      method(hour1, min1, hour2, min2);
    }
  }

  public static void method(int hour1, int min1,int hour2, int min2) {
    int sumH = 0;
    int sumM = 0;
    int upper = 0;

    sumM = min1 + min2;
    if(sumM>60){
      upper = sumM/60;
      sumM = sumM - upper*60;
    }

    sumH = hour1 + hour2 + upper;
    if(sumH>12){
      sumH = sumH - 12;
    }
    System.out.printf("%d %d\n",sumH, sumM);
  }
}
