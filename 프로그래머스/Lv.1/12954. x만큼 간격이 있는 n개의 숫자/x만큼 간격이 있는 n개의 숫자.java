import java.util.*;
public class Solution {
    public long[] solution(int x, int n) {
        long[] answer = new long[n];
        
        for (int i = 0; i < n; i++) {
            answer[i] = (long)x * (i + 1);
        }
        
        return answer;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();

        // 테스트
        long[] result = sol.solution(2, 5);
        for (long num : result) {
            System.out.print(num + " ");
        }
        // 출력: 2 4 6 8 10
    }
}
