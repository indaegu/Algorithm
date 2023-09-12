// 전략 : 동적배열에 대해 알고 있는지 묻는 문제
import java.util.*;
class Solution {
    public int[] solution(int start_num, int end_num) {
        List<Integer> resultList = new ArrayList<>();
        for(int i = start_num; i<=end_num;i++){
            resultList.add(i);
        }
        
        int[] answer = new int[resultList.size()]; // 동적 배열에 삽입된 크기만큼의 배열 생성
        for (int i = 0; i < resultList.size(); i++) { // 동적 배열에 삽입된 원소들 복사
            answer[i] = resultList.get(i);
        }
        return answer;
    }
}