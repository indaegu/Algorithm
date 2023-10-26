import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      int N = sc.nextInt();
      int M = sc.nextInt();
      int[][] arr = new int[N][N];
      for (int i = 0; i < N; i++) {
        for (int j = 0; j < N; j++) {
          arr[i][j] = sc.nextInt();
        }
      }
      System.out.println("#" + test_case + " " + method(arr,M));
    }
  }

  public static int method(int[][] arr, int M) {
    int result = 0;
    int sum = 0;
    for (int i = 0; i < arr.length; i++) {
      sum = 0;
      for (int j = 0; j < arr.length; j++) {
        if(arr[i][j] == 1){
          sum +=1;
        }else{
          if(sum == M) result++;
          sum = 0;
        }
      }
      if(sum==M) result++;
    }

    for (int i = 0; i < arr.length; i++) {
      sum = 0;
      for (int j = 0; j < arr.length; j++) {
        if(arr[j][i] == 1){
          sum +=1;
        }else{
          if(sum == M) result++;
          sum=0;
        }
      }
      if(sum==M) result++;

    }
    return result;
  }
}
