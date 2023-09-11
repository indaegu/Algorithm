import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String a = sc.next();
        for(int i=0; i<a.length(); i++){
            // index 위치에 존재하는 문자를 'char' 타입으로 리턴하는 함수
            System.out.printf("%s\n", a.charAt(i));
        }

    }
}