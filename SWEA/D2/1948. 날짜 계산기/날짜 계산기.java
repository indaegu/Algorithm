import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      int M1 = sc.nextInt();
      int D1 = sc.nextInt();
      int M2 = sc.nextInt();
      int D2 = sc.nextInt();
      System.out.println("#" + test_case + " " + method(M1,D1,M2,D2));
    }
  }
  public static int method(int M1,int D1, int M2, int D2) {
    return dayCal(M2,D2) + 1 - dayCal(M1,D1);
  }

  public static int dayCal(int M, int D){
    int calDay = 0;
    switch (M){
      case 1: calDay = D; break;
      case 2: calDay = 31 + D; break;
      case 3: calDay = 31 + 28 + D; break;
      case 4: calDay = 31 + 28 + 31 + D; break;
      case 5: calDay = 31 + 28 + 31+ 30+ D; break;
      case 6: calDay = 31 + 28 + 31 + 30 + 31 + D; break;
      case 7: calDay = 31 + 28 + 31 + 30 + 31 + 30 + D; break;
      case 8: calDay = 31 + 28 + 31 + 30 + 31 + 30 + 31 + D; break;
      case 9: calDay = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + D; break;
      case 10: calDay = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + D; break;
      case 11: calDay = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + D; break;
      case 12: calDay = 31 + 28 + 31 + 30 + 31 + 30 + 31 + 31 + 30 + 31 + 30 + D; break;
      default: break;
    }
    return calDay;
  }
}
