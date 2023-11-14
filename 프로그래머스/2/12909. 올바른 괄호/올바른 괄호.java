import java.util.*;
class Solution {
    boolean solution(String s) {
        boolean answer = true;
        Stack<Character> stack = new Stack<>();
        if(s.length()%2!=0) return false;
        for(int i =0; i<s.length(); i++){
          if(s.charAt(i) == '('){
              stack.push(s.charAt(i));
          }else{
             if (stack.isEmpty()) return false;
             stack.pop();
          }
        }
        return stack.isEmpty();
    }
}