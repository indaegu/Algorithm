import java.util.ArrayList;
import java.util.List;

public class Solution {
    public int[] solution(int l, int r) {
        //동적 배열 생성
        List<Integer> resultList = new ArrayList<>();
        
        //반복문을 통해 l이상 r이하의 숫자를 검사
        for (int i = l; i <= r; i++) {
            if (isMadeOfZeroAndFive(i)) { // 메서드를 통해 조건에 맞으면
                resultList.add(i); // 동적 배열에 삽입
            }
        }
        
        if (resultList.isEmpty()) {// 아무것도 동적배열에 삽입되지 않았다면
            return new int[]{-1}; // -1만 들어간 배열을 반환
        }
        
        int[] resultArray = new int[resultList.size()]; // 동적 배열에 삽입된 크기만큼의 배열 생성
        for (int i = 0; i < resultList.size(); i++) { // 동적 배열에 삽입된 원소들 복사
            resultArray[i] = resultList.get(i);
        }
        
        return resultArray;
    }
    
    public boolean isMadeOfZeroAndFive(int number) {
    // 주어진 숫자를 문자열로 변환한 다음, 그 문자열을 문자 배열로 변환합니다.
    // 이렇게 하면 각 숫자의 각 자릿수를 개별적으로 검사할 수 있습니다.
    char[] digits = Integer.toString(number).toCharArray();

    // 문자 배열의 각 요소(숫자의 각 자릿수)에 대해 반복합니다.
    for (char digit : digits) {
        // 현재 자릿수가 '0' 또는 '5'가 아닌 경우, 
        // 이 숫자는 "0"과 "5"만으로 이루어진 숫자가 아님을 나타내므로 false를 반환합니다.
        if (digit != '0' && digit != '5') {
            return false;
        }
    }
    
    // 모든 자릿수가 '0' 또는 '5'였다면, 이 숫자는 "0"과 "5"만으로 이루어진 숫자이므로 true를 반환합니다.
    return true;
}

}
// 회고 : 어렵다...