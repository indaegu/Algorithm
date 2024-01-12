import java.util.*;
class Solution {
    public ArrayList<Integer> solution(long n) {
        ArrayList<Integer> arr = new ArrayList<>();
        String str = String.valueOf(n);
        for(int i = str.length(); i > 0; i--){
             arr.add(str.charAt(i-1)-'0');
        }
        return arr;
    }
}