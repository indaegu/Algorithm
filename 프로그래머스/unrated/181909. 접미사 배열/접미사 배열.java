import java.util.*;


class Solution {
    public ArrayList solution(String my_string) {
        String[] answer = {};
        ArrayList<String> list = new ArrayList<>();
        
        for(int i = 0; i < my_string.length();i++){
            list.add(my_string.substring(i));
        }
        Collections.sort(list); // 정렬은 수행하고 반환값은 void임
        return list;
    }
}