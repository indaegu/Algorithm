import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        //System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        for (int test_case = 1; test_case <= 10; test_case++) {
            System.out.print("#" + test_case + " ");
            int N = sc.nextInt();
            // 1은  N극 성질 . 2는 S극 성질을 가짐
            // 테이블 위는 N극 아래는 S극
            int[][] arr = new int[N][N];
            for (int i = 0; i < N; i++) {
                for (int j = 0; j < N; j++) {
                    arr[i][j]= sc.nextInt();
                }
            }
            // arr[i] 열을 아래로 순회하며 N극 성질을 가진 자성체를 찾고 해당 위치부터 다시 순회 하다가 다른 극의 자성체가 있다면 교착
            // 단, 다른 성질을 만나기 전의 같은 자성체를 만나면 교착상태로 추가 하지않고 해당 위치부터 다시 순회
            // 단, 한번에 교착이 이루어 지고 남은 arr[i] 부분을 추가로 조회하며 다른 자성체를 만날때마다 교착 +1
            // 따라서 한 열 마다 여러 교착상태를 찾을 수 있음
            int deadLockCount = 0;
            for (int i = 0; i < N; i++) {
                int isFindN = 0;
                for (int j = 0; j < N; j++) {
                    if(arr[j][i] == 1) isFindN = 1;

                    if(isFindN == 1 && arr[j][i] == 2){
                        isFindN = 0;
                        deadLockCount++;
                    }
                }
            }
            System.out.println(deadLockCount);
        }
    }
}
