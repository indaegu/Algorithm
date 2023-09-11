// 전략 : 이전 문제와 동일하게 접근하되, && 연산자를 활용한다.
class Solution {
    public int solution(int number, int n, int m) {
        int answer = 0;
        return answer = (number%n==0)&&(number%m==0)?1:0;
    }
}
//회고 : 이전문제 부터 계속 answer을 선언해줬었는데 반환할때는 굳이 해주지 않아도 된다.