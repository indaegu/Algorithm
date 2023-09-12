import java.util.*;
class Solution {
    public ArrayList solution(int n) {
        ArrayList<Integer> arr = new ArrayList<>();
        int i = 1;
        arr.add(n);
        while(n!=1){
            if(n%2==0){
                n = n/2;
                arr.add(n);
                i++;
            }else{
                n = 3 * n + 1;
                arr.add(n);
                i++;
            }
        }
        
        return arr;
    }
}