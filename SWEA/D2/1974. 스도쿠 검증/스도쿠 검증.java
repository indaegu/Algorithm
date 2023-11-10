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
      int[][] arr = new int[9][9];
      for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9; j++) {
          arr[i][j] = sc.nextInt();
        }
      }

      ArrayList<Integer> row = new ArrayList<>();
      ArrayList<Integer> col = new ArrayList<>();
      ArrayList<Integer> rec = new ArrayList<>();


      int result = 0;
      for (int i = 0; i < 9; i++) {
        for (int j = 0; j < 9 ; j++) {
          if(!row.contains(arr[i][j]) && !col.contains(arr[j][i])){
            row.add(arr[i][j]);
            col.add(arr[j][i]);
            result++;
          }
        }
        row.clear();
        col.clear();
      }
      for (int k = 0; k <= 6; k+=3) {
        for (int q = 0; q <= 6; q+=3) {
          for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
              if(!rec.contains(arr[i+k][j+q])){
                rec.add(arr[i+k][j+q]);
                result++;
              }
            }
          }
          rec.clear();
        }
      }
      if(result==162){
        System.out.println(1);
      }else{
        System.out.println(0);
      }
    }
  }
}
