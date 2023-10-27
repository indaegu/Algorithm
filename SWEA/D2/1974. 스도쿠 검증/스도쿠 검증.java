import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      int[][] arr = new int[9][9];
      for (int i = 0; i < 9; i++) {
        for (int j = 0; j <9; j++) {
          arr[i][j] = sc.nextInt();
        }
      }
      System.out.println("#" + test_case + " " + method(arr));
    }
  }

  public static int method(int[][] arr) {
    int ans = 1;
    List<Integer> checkList = new ArrayList<>();
    for (int i = 0; i < 9; i++) {
      checkList.clear();
      for (int j = 0; j < 9; j++) {
        if (checkList.contains(arr[i][j])) {
          ans = 0;
        } else {
          checkList.add(arr[i][j]);
        }
      }
    }
    checkList.clear();
    for (int i = 0; i < 9; i++) {
      checkList.clear();
      for (int j = 0; j < 9; j++) {
        if (checkList.contains(arr[j][i])) {
          ans = 0;
        } else {
          checkList.add(arr[j][i]);
        }
      }
    }
    checkList.clear();

    for (int i = 0; i < 6; i+=3) { //3*3 사각형 판단
      for (int j = 0; j < 6; j+=3) {
        checkList.clear();
        for (int k = i; k < i+3; k++) {
          for (int l = j; l < j+3; l++) {
            if(checkList.contains(arr[k][l])){
              ans = 0;
            } else{
              checkList.add(arr[k][l]);
            }
          }
        }
      }
    }
    checkList.clear();

    return ans;
  }
}
