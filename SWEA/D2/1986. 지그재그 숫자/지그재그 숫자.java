import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int test_case = 1; test_case <= T; test_case++)
        {
            int num = sc.nextInt();
            int ans =0;
            System.out.printf("#%d ", test_case);
            for (int i = 1; i <= num; i++) {
                if(i%2==1){
                    ans+=i;
                }else{
                    ans-=i;
                }
            }
            System.out.printf("%d\n", ans);
        }
    }

}
