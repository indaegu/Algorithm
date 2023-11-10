import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      System.out.print("#" + test_case + " ");
      int N = sc.nextInt();
      ArrayList<Character> arrayList = new ArrayList<>();
      int count = 0;
      while (true){
        count++;
        String num = String.valueOf(N*count);
        for (int i = 0; i < num.length(); i++) {
          if(!arrayList.contains(num.charAt(i))){
            arrayList.add(num.charAt(i));
          }
        }
        if(arrayList.size() == 10){
          System.out.println(count*N);
          break;
        }
      }
    }
  }
}
