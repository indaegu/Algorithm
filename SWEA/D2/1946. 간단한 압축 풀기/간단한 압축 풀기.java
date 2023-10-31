import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      System.out.println("#" + test_case);
      int NumOfAlpha = sc.nextInt();
      List<String> list = new ArrayList<>();
      for (int i = 0; i < NumOfAlpha; i++) {
        String alpha = sc.next();
        int count = sc.nextInt();
        for (int j = 0; j < count; j++) {
            list.add(alpha);
        }
      }
      for (int i = 0; i < list.size(); i++) {
        if(i%10 == 0 && i != 0){
          System.out.println();
          System.out.print(list.get(i));
        }else{
          System.out.print(list.get(i));
        }
      }
      System.out.println();
    }
  }
}
