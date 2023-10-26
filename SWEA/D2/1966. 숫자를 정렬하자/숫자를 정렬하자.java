import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      int N = sc.nextInt();
      List<Integer> list = new ArrayList<>();
      System.out.print("#" + test_case + " ");
      for (int i = 0; i < N; i++) {
        list.add(i, sc.nextInt());
      }
      Collections.sort(list);
      for (int i = 0; i < N; i++) {
        System.out.print(list.get(i) + " ");
      }
      System.out.println();
    }
  }
}
