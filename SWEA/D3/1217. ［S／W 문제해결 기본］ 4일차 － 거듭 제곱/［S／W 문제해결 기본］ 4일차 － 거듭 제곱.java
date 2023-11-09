import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
       // System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        for (int test_case = 1; test_case <= 10; test_case++) {
            int testCaseNum = sc.nextInt();
            System.out.print("#" + testCaseNum + " ");
            int N = sc.nextInt();
            int M = sc.nextInt();
            System.out.println(sqrt(N,M));
        }
    }
//    public static int sqrt(int N, int M){
//        int answer = 1;
//        for (int i = 0; i < M; i++) {
//            answer = answer * N;
//        }
//        return answer;
//    }
    public static int sqrt(int N, int M){
        // 종료 조건
        if (M == 0) return 1;
        // 재귀 조건
        return N * sqrt(N, M - 1);
    }
}
