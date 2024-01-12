class Solution {
    public int solution(int n) {
        int answer = 0;
        for(int x = n; x >= 1; x--){
            if(n % x == 1){
                answer = x;
            }          
        }
        return answer;
    }
}