import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      int N = sc.nextInt();
      int command = 0;
      int distance = 0;
      int speed = 0;
      int acc = 0;
      for (int i = 0; i < N; i++) {
        command = sc.nextInt();
        switch (command) {
          case 0:
            break;
          case 1:
            acc=sc.nextInt();
            speed += acc;
            break;
          case 2:
            if (speed == 0) {
              acc=sc.nextInt();
              break;
            } else {
              acc=sc.nextInt();
              speed -= acc;
            } break;
          default:
            break;
        }
        distance += speed;
      }
      System.out.println("#" + test_case + " " + distance);
    }
  }
}

