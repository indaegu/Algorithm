// 전략 : for문을 이용해 k번만큼 my_string을 반복한다.

class Solution {
    public String solution(String my_string, int k) {
        String answer = "";
        for(int i = 0; i<k; i++){
            answer+=my_string;
        }
        return answer;
        //return my_string.repeat(k);
    }
}

// 회고 : 자바 11부터 추가된 my_string.repeat(k) 라는 메서드가 있었다. 해당 메서드는 my_string을 k번 만큼 반복해주는 메서드 이다.