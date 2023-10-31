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
      System.out.print("#" + test_case + " ");
      ArrayList<Integer> arrayList = new ArrayList<>();
      for (int i = 0; i < 10; i++) {
        arrayList.add(sc.nextInt());
      }
      arrayList.remove(Collections.max(arrayList));
      arrayList.remove(Collections.min(arrayList));
      double sum = 0;
      for (int i = 0; i < 8; i++) {
        sum += arrayList.get(i);
      }
      System.out.printf("%d\n", Math.round(sum/8));
    }
  }
}
