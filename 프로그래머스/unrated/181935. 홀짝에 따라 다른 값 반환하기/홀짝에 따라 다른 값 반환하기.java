// 전략 : for문과 %연산자를 활용해 n보다 작은 홀수를 합해서 반환한다.
class Solution {
    public int solution(int n) {
        int answer = 0;
        if(n%2==0){
        for(int i = 0; i<=n; i+=2){
            answer += (i*i);
            }
        }else{
            for(int i = 1; i<=n; i+=2){
            // double result = Math.pow(5, 2); //5의제곱 이라는 함수도 존재한다.
            answer += i;
            }
        }
        return answer;
    }
}

// 회고 삼항연산자를 활용했다면 좀더 간결하게 코드를 작성했을수 있었을것이다