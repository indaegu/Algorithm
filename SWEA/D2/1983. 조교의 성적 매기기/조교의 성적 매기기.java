import java.io.FileInputStream;
import java.lang.reflect.Array;
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
      int numberOfStudnets = sc.nextInt();
      int k = sc.nextInt();
      String[] grade = {"D0","C-","C0","C+","B-","B0","B+","A-","A0","A+"};
      ArrayList<Integer> arr1 = new ArrayList<>();
      ArrayList<Integer> arr2 = new ArrayList<>();
      for (int i = 0; i < numberOfStudnets; i++) {
        int r = sc.nextInt() * 35 + sc.nextInt() * 45 + sc.nextInt() * 20;
        arr1.add(r);
        arr2.add(r);
      }
      Collections.sort(arr1);
      int unit = numberOfStudnets/10;
      int arr2_k = arr2.get(k-1);
      int arr1_k_index = arr1.indexOf(arr2_k);
      int gn = (arr1_k_index)/unit;
      System.out.println(grade[gn]); //영남대학교 컴퓨터공학과 18학번 김힘찬 작품
    }
  }
}
