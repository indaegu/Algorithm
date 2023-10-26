import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int N = sc.nextInt();
            int M = sc.nextInt();
            int[] Ai = new int[N];
            int[] Bi = new int[M];
            for(int i = 0; i < N; i++){
                Ai[i] = sc.nextInt();
            }
            for (int i = 0; i < M; i++) {
                Bi[i] = sc.nextInt();
            }
            System.out.println("#" + test_case + " " + method(N,M,Ai,Bi));
        }
    }
    public static int method(int N, int M, int[] Ai, int[] Bi){
        int result=0;
        if(N>=M){
            for (int i = 0; i <=(N-M); i++) {
                int sum = 0;
                for(int j = 0; j < M; j++) {
                    sum += (Ai[j+i] * Bi[j]);
                }
                if(sum>result){
                    result = sum;
                }
            }
        }else{
            for (int i = 0; i <=(M-N); i++) {
                int sum = 0;
                for(int j = 0; j < N; j++) {
                    sum += (Ai[j] * Bi[j+i]);
                }
                if(sum>result){
                    result = sum;
                }
            }
        }
        return result;
    }
}
