import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();

        for(int test_case = 1; test_case <= T; test_case++)
        {
            int num = sc.nextInt();
            int a = 0;
            int b = 0;
            int c = 0;
            int d = 0;
            int e = 0;
            System.out.printf("#%d ", test_case);

            while (num > 0){
                if(num % 2 ==0){
                    num /= 2;
                    a++;
                }else if(num % 3 == 0){
                    num /= 3;
                    b++;
                }else if(num % 5 == 0){
                    num /= 5;
                    c++;
                }
                else if(num % 7 == 0){
                    num /= 7;
                    d++;
                }
                else if(num % 11 == 0){
                    num /= 11;
                    e++;
                }else{
                    break;
                }
            }
            System.out.printf("%d %d %d %d %d\n", a, b, c, d, e);
        }
    }

}
