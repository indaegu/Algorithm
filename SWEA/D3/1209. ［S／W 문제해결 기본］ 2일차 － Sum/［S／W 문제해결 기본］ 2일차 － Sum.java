import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
       // System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        for (int test_case = 1; test_case <= 10; test_case++) {
            System.out.print("#" + test_case + " ");
            int N = sc.nextInt();
            int[][] arr = new int[100][100];
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    arr[i][j] = sc.nextInt();
                 }
            }
            int[] sum = new int[202];
            int cnt = 0;
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    sum[i] += arr[i][j];
                }
                cnt++;
            }
            for (int i = 0; i < 100; i++) {
                for (int j = 0; j < 100; j++) {
                    sum[cnt]+=arr[j][i];
                }
                cnt++;
            }
            for (int j = 0; j < 100; j++) {
                sum[cnt]+=arr[j][j];
            }
            cnt++;
            for (int j = 99; j > 0; j--) {
                sum[cnt]+=arr[j][j];
            }
            System.out.println(Arrays.stream(sum).max().getAsInt());
        }
    }
}
