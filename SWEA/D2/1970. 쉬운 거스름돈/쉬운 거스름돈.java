import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      int N = sc.nextInt();
      String str = Integer.toString(N);
      int fiveman = 0;
      int oneman = 0;
      int fivechun = 0;
      int onechun = 0;
      int fiveback = 0;
      int oneback = 0;
      int fiveship = 0;
      int ship = 0;
      System.out.println("#" + test_case);
        fiveman = N / 50000;
        N = N - (fiveman * 50000);
        oneman = N / 10000;
        N = N - (oneman * 10000);
        fivechun = N / 5000;
        N = N - (fivechun * 5000);
        onechun = N / 1000;
        N = N - (onechun * 1000);
        fiveback = N / 500;
        N = N - (fiveback * 500);
        oneback = N / 100;
        N = N - (oneback * 100);
        fiveship = N / 50;
        N = N - (fiveship * 50);
        ship = N / 10;
        N = N - (ship * 10);
      System.out.printf("%d %d %d %d %d %d %d %d\n",fiveman,oneman,fivechun,onechun,fiveback,oneback,fiveship,ship);

    }
  }
}
