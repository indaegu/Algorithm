// 전략 : 이전 문제와 동일하게 ""+를 통해 문자열과 정수를 합해서 정수로 저장하는 방식을 활용하고
// 삼항연산자를 활용해 코드를 간단하게 한다.
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        //이전 문제에서 학습한 방식, ""+를 통해 문자열과 정수를 합해서 정수로 저장
        int num1 = Integer.parseInt(""+a+b);
        int num2 = 2*a*b;
        return answer = num1>=num2 ? num1:num2;
    }
}