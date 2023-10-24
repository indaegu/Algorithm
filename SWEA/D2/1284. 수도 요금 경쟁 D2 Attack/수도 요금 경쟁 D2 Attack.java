import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int P = sc.nextInt(); // A사 : 1리터당 P원의 돈을 내야 한다.
            int Q = sc.nextInt(); // B사 : 기본 요금이 Q원이고,
            int R = sc.nextInt(); // 월간 사용량이 R리터 이하인 경우 요금은 기본 요금만 청구된다.
            int S = sc.nextInt(); // 하지만 R 리터보다 많은 양을 사용한 경우 초과량에 대해 1리터당 S원의 요금을 더 내야 한다.
            int W = sc.nextInt(); //  한 달간 사용하는 수도의 양이 W리터
            System.out.println("#" + test_case + " " + sudo(P,Q,R,S,W));
        }
    }
    public static int sudo(int P, int Q, int R, int S, int W){
        int sumOfA = 0;
        int sumOfB = 0;
        sumOfA = W * P; //2000

        if(W<=R){ // 250<=100
            sumOfB = Q;
        }else{
            sumOfB = Q + (S * (W-R));
        }

        if(sumOfA>sumOfB){
            return sumOfB;
        }else{
            return sumOfA;
        }
    }
}
