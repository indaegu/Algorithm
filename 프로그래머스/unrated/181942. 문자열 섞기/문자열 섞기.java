// 전략 : answer 문자열에 str1의 첫번째 인덱스를 더하고 str2의 첫번째 인덱스의 문자를 더한다.
class Solution {
    public String solution(String str1, String str2) {
        String answer = "";
        for(int i = 0; i<str1.length();i++){
            answer = answer + str1.charAt(i) + str2.charAt(i);
        }
        return answer;
    }
}