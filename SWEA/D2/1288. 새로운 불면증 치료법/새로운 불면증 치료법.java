import java.io.FileInputStream;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      int N = sc.nextInt();
      System.out.print("#" + test_case + " ");
      Map<Character, Boolean> map = new HashMap<>();
      String str = "";
      int count = 0;
      while (true){
        count++;
        str = Integer.toString(N*count);
        for (int i = 0; i < str.length(); i++) {
          if(!map.containsKey(str.charAt(i))){
            map.put(str.charAt(i),true);
          }
        }
        if(map.size()==10){
          System.out.println(N*count);
          break;
        }
      }
    }
  }

}
