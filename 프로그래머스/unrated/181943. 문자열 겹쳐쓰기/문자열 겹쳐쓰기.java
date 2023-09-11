//요약 : substring으로 바꾸고 싶은 부분의 문자열을 구하고 해당 문자열을 overwrite_string로 대체시킴
//그러나 이렇게 하면 동일한형태로 반복된 문자열에서 원하지 않은 결과가 나올수 있음
//따라서 문자열의 인덱스부터 overwrite_string의 길이만큼을 대체하는것이 올바른 방향
class Solution {
    public String solution(String my_string, String overwrite_string, int s) {
        // //String.substring(start,end) //문자열  start위치 부터 end전까지 문자열 발췌
        // String Find_my_string = my_string.substring(s,overwrite_string.length()+s);
        // // my_string.replace("바꾸고 싶은 문자열","대체할문자열")
        // my_string = my_string.replace(Find_my_string,overwrite_string);
        // // 마지막 3글자 발췌
        //String result = str.substring(str.length()-3, str.length());
        
        String FirstString = 
            my_string.substring(0,s);
        System.out.println(FirstString);
        
        String LastString = 
            my_string.substring(overwrite_string.length()+s, my_string.length());
        System.out.println(LastString);
        
        String answer1 = FirstString.concat(overwrite_string);
        String answer = answer1.concat(LastString);
        

    return answer;
    }
}
                             
