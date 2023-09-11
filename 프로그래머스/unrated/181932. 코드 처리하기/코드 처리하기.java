class Solution {
    public String solution(String code) {
        if(code == null || code.trim().isEmpty()){
            return "EMPTY";
        }

        StringBuilder answer = new StringBuilder();
        int mode = 0;

        for(int i = 0; i < code.length(); i++){
            if(mode == 0){
                if(code.charAt(i) == '1'){ 
                    mode = 1;
                }else{
                    if(i % 2 == 0)
                        answer.append(code.charAt(i));
                }
            }else{
                if(code.charAt(i) == '1'){
                    mode = 0;
                }else{
                    if(i % 2 != 0)
                        answer.append(code.charAt(i));
                }
            }
        }

        // 결과 문자열이 비어 있는 경우 체크
        if(answer.length() == 0) {
            return "EMPTY";
        }

        return answer.toString();
    }
}
