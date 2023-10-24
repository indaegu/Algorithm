    import java.io.FileInputStream;
    import java.util.Scanner;

    public class Solution {
        public static void main(String args[]) throws Exception {
            Scanner sc = new Scanner(System.in);
            int T = sc.nextInt();
            for (int test_case = 1; test_case <= T; test_case++) {
                String str = sc.next(); // level
                int len= str.length();
                System.out.println("#" + test_case + " " + method(str, len));
            }
        }
        public static int method(String str, int len){
            String front = str.substring(0,len/2);
            String back;
            if(len % 2 == 1){
                back = str.substring(len/2+1,len);

            }else{
                back = str.substring(len/2,len);
            }
            StringBuffer sb = new StringBuffer(back);
            String reverse = sb.reverse().toString();
            if(front.equals(reverse)){
                return 1;
            }else{
                return 0;
            }

     }
    }
