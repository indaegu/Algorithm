import java.util.*;
//int 형의 곱은 long형의 크기가 될 수 있다...
class Solution {
    public ArrayList<Long> solution(int x, int n) {
        ArrayList<Long> answer = new ArrayList();
        for(int i = 1; i <= n; i++){
            answer.add((long)i * x);
        }
        return answer;
    }
}