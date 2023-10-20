import java.io.FileInputStream;
import java.util.Arrays;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        int num = 0;
        for (int i = 1; i <= T; i++) {
            int sum =0;
            System.out.printf("#%d ",i);
            for (int j = 0; j < 10; j++) {
                num = sc.nextInt();
                if((num%2)!=0){
                    sum += num;
                }
            }
            System.out.printf("%d\n",sum);
        }
    }
}


