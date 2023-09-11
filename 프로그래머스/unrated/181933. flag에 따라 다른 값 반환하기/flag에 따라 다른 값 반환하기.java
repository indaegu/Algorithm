// 전략 : else if문으로 해결한다.
class Solution {
    public int solution(int a, int b, boolean flag) {
        int answer = 0;
        if(flag){answer = a + b;}
        else{answer = a - b;}
        return answer;
    }
}

//회고 : 삼항연산자를 활용했다면 좀더 간결한 코드가 됐을것이다.