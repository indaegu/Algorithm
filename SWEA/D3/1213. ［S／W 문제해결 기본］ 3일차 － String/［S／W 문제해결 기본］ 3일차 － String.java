import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {
    public static void main(String args[]) throws Exception {
        //System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        for (int test_case = 1; test_case <= 10; test_case++) {
            int testCaseNum = sc.nextInt();
            System.out.print("#" + testCaseNum + " ");
            String findString = sc.next();
            String allString = sc.next();
            ArrayList<String> arrayList = new ArrayList<>();
            for (int i = 0; i < allString.length(); i++) { // 찾고자하는 문자열의 길이 만큼 모두 나눠서 리스트에 추가
                String tempString = "";
                StringBuilder tempStringBuilder = new StringBuilder(tempString);
                for (int j = 0; j < findString.length(); j++) {
                    if(i+j<allString.length()) tempStringBuilder.append(allString.charAt(i+j));
                }
                arrayList.add(String.valueOf(tempStringBuilder));
            }
            // 모든 리스트와 찾고자하는 문자열을 비교하고 맞을때마다 count++ 해줌
            int count = 0;
            for (int i = 0; i < arrayList.size(); i++) {
                if(arrayList.get(i).equals(findString)) count++;
            }
            System.out.println(count);
        }
    }
}
