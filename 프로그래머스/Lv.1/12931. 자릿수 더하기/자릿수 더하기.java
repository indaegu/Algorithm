import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        String str = Integer.toString(n);
        for(int i = 0; i < str.length(); i++){
            answer +=  str.charAt(i) - '0'; // 아스키 코드를 이용해 char형을 int로 변환
            //Character.getNumericValue(char형 데이터) 이런 방식도 있다. 
        }
        return answer;
    }
}