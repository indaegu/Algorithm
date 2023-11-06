import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        //System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            System.out.print("#" + test_case + " ");
            String str = sc.next();
            StringBuilder stringBuffer = new StringBuilder(str);
            String front = stringBuffer.substring(0,stringBuffer.length()/2);
            String back;
            if(stringBuffer.length() % 2 == 0){
                back = stringBuffer.substring(stringBuffer.length() / 2, stringBuffer.length());
                StringBuilder stringBuffer1 = new StringBuilder(back);
                back = stringBuffer1.reverse().toString();
                if(front.equals(back)) System.out.println(1);
                else System.out.println(0);
            }else{
                back = stringBuffer.substring(stringBuffer.length() / 2 + 1, stringBuffer.length());
                StringBuilder stringBuffer1 = new StringBuilder(back);
                back = stringBuffer1.reverse().toString();
                if(front.equals(back)) System.out.println(1);
                else System.out.println(0);
            }
        }
    }
}
