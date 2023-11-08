import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        //System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            System.out.print("#" + test_case + " ");
            String answer = sc.next();
            StringBuilder stringAnswer = new StringBuilder(answer);
            String result = "";
            StringBuilder stringResult = new StringBuilder(result);
            int cnt =0;
            for (int i = 0; i < stringAnswer.length(); i++) {
                stringResult.append(0);
            }
            for (int i = 0; i <= stringAnswer.length()-1; i++) {
                if(stringResult.charAt(i)!=stringAnswer.charAt(i)){
                    for (int j = i; j <= stringAnswer.length()-1; j++) {
                        stringResult.replace(j,stringAnswer.length()-1, String.valueOf(stringAnswer.charAt(i)));
                    }
                    cnt++;
                }
            }
            System.out.println(cnt); //어쩌다 보니 풀어버린듯하다.
        }
    }
}
