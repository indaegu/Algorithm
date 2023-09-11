// 전략 : else if문으로 해결한다.
class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag){answer = a + b;}
        else{answer = a - b;}
        return answer;
    }
}