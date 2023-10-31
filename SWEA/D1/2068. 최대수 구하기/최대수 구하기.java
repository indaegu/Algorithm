import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      ArrayList<Integer> arrayList = new ArrayList<>();
      for (int i = 0; i < 10; i++) {
        arrayList.add(sc.nextInt());
      }
      int max = Collections.max(arrayList);
      System.out.println("#" + test_case + " " + max);
    }
  }
}
