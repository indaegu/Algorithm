import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        //System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            System.out.print("#" + test_case + " ");
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int max = 0;
            for (int h = 0; h < N; h++) {
                for (int i = 0; i < N; i++) {
                    int sum = 0;
                    for (int j = 0; j < M; j++) {
                        if(j+h>=N) continue;
                        for (int k = 0; k < M; k++) {
                            if(k+i>=N) continue;
                            sum += arr[j+h][k+i];
                        }
                    }
                    if(max <= sum){
                        max = sum;
                    }
                }
            }
            System.out.println(max);
        }
    }
}
