// 전략 : 매번 새로운 배열을 만들어 크기를 바꾸며 진행한다.
import java.util.HashMap;
import java.util.Map;

class Solution {
    public String solution(int[] numLog) {
        StringBuilder answer = new StringBuilder();
        Map<Integer, Character> diffToChar = new HashMap<>();
        diffToChar.put(1, 'w');
        diffToChar.put(-1, 's');
        diffToChar.put(10, 'd');
        diffToChar.put(-10, 'a');
        
        for(int i = 0; i < numLog.length - 1; i++){
            int diff = numLog[i+1] - numLog[i];
            answer.append(diffToChar.get(diff));
        }

        return answer.toString();
    }
}
// 회고 : i를 1부터 비교해서 이전값과 현재값을 비교 했으면 마지막 값을 효율적으로 비교가 가능했을텐데. 계속 i를 0으로 설정하고 현재값과 다음 값을 비교해서 난항을 겪었다.
