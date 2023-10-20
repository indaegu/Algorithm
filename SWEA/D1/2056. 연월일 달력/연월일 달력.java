import java.io.FileInputStream;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 1; i <= T; i++) {
            String input = sc.next();
            int year = Integer.parseInt(input.substring(0, 4));
            int month = Integer.parseInt(input.substring(4, 6));
            int day = Integer.parseInt(input.substring(6, 8));

            boolean valid = isValidDate(month, day);
            System.out.printf("#%d ", i);
            if (valid) {
                System.out.printf("%04d/%02d/%02d\n", year, month, day);
            } else {
                System.out.println("-1");
            }
        }
    }

    public static boolean isValidDate(int month, int day) {
        int[] daysInMonth = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month < 1 || month > 12) {
            return false;
        }
        if (day < 1 || day > daysInMonth[month]) {
            return false;
        }
        return true;
    }
}
