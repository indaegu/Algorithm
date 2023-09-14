// 전략 : intStrs의 배열의 각 원소의 문자열에서 s번째 인덱스부터 l길이까지 정수형으로 바꾸고 k보다 크다면 answer 배열에 담는다.
import java.util.*;
class Solution {
    public ArrayList solution(String[] intStrs, int k, int s, int l) {
        int before = 0;
        ArrayList<Integer> ans = new ArrayList<>();
        for(int i = 0; i < intStrs.length; i++){
            before = Integer.parseInt(intStrs[i].substring(s,s+l));
            if(before > k){
                ans.add(before);
            }
        }
        return ans;
    }
}