// 전략 Integer.toString(a)과 Integer.parseInt(num1)를 이용해 문자열을 이어붙이고 다시 정수형으로 반환하여 비교한다.
class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String num1 = Integer.toString(a) + Integer.toString(b);
        String num2 = Integer.toString(b) + Integer.toString(a);
        if(Integer.parseInt(num1)>=Integer.parseInt(num2)){
            return Integer.parseInt(num1);
        }else{
            return Integer.parseInt(num2);
        }
    }
}
// Java는 문자열 + 숫자에서 숫자를 문자열로 처리하고, Math.max(정수,정수)를 이용해 한줄로 해결이 가능했다.
//return Math.max(Integer.parseInt(a + "" + b), Integer.parseInt(b + "" + a)); 