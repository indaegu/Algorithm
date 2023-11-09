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
            int K = sc.nextInt();
            int[][] arr = new int[N][N];

            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j] = sc.nextInt();
                }
            }
            int result = 0;
            for (int i = 0; i < N; i++) {
                int isFit = 0;
                for (int j = 0; j < N; j++) {
                    if(arr[i][j] == 1){
                        isFit++;
                    }else{
                        isFit = 0;
                    }
                    if(isFit==K){
                        result++;
                    }
                    if(isFit>K){
                        result--;
                        isFit = 0;
                    }
                }
            }
            for (int i = 0; i < N; i++) {
                int isFit = 0;
                for (int j = 0; j < N; j++) {
                    if(arr[j][i] == 1){
                        isFit++;
                    }else{
                        isFit = 0;
                    }
                    if(isFit==K){
                        result++;
                    }
                    if(isFit>K){
                        result--;
                        isFit = 0;
                    }
                }
            }
            System.out.println(result);
            
        }
    }
}
