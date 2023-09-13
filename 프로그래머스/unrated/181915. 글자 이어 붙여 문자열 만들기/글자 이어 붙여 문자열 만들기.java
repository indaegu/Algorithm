import java.util.*;
class Solution {
    public String solution(String my_string, int[] index_list) {
        String answer = "";
        ArrayList <String> arr = new ArrayList<>();
        
        StringBuilder str = new StringBuilder();
        
        for(int i = 0; i< index_list.length; i++){
            answer = answer + my_string.charAt(index_list[i]);
        }
        return answer;
    }
}