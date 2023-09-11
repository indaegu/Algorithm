// 전략 : foreach문을 활용해 배열의 문자를 인덱스별로 하나씩 문자열에 저장해준다.

class Solution {
    public String solution(String[] arr) {
        String answer = "";
        for(String ar : arr){
            answer += ar;
        }
        return answer;
        
        // return String.join("", arr);
    }
}
// 회고 : String.Join 메소드를 사용하면 문자열 배열 내의 복수개의 요소들을 이어붙일 수 있었다.