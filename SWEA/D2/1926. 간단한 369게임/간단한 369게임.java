import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
   // System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt();
    ArrayList<String> arr = new ArrayList<>();
    String[] strings = new String[N + 1];
    for (int i = 0; i < N; i++) {
      //strings[i] = String.valueOf(i);
      arr.add(String.valueOf(i + 1));
    }
    int is369 = 0;
    for (int i = 0; i < N; i++) {
      for (int j = 0; j < arr.get(i).length(); j++) {
        if (arr.get(i).charAt(j) == '3' || arr.get(i).charAt(j) == '6' || arr.get(i).charAt(j) == '9') {
          System.out.print("-");
          is369 = 1;
        }
      }
      if(is369 != 1){
        System.out.print(arr.get(i));
      }
      is369 = 0;
      System.out.print(" ");
    }
  }
}
