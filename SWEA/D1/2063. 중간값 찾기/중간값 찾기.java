import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<Integer> arrayList = new ArrayList<>();
    for (int i = 0; i < N; i++) {
      arrayList.add(sc.nextInt());
    }
    Collections.sort(arrayList);
    System.out.print(arrayList.get(N/2));
  }
}
