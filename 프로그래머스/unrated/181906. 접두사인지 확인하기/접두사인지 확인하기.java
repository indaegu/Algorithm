import java.util.*;
class Solution {
    public int solution(String my_string, String is_prefix) {
        ArrayList<String> str = new ArrayList<>();
        for(int i = 0; i<my_string.length();i++){
            str.add(my_string.substring(0, i+1));
            if(str.get(i).equals(is_prefix))return 1;
        }
        return 0;
    }
}