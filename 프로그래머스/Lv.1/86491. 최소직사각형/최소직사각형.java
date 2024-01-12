import java.util.*;
class Solution {
    public int solution(int[][] sizes) {
        int answer = 0;
        int x = 0;
        int y = 0;
        int temp = 0;
        for(int i = 0; i < sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                temp = sizes[i][1];
                sizes[i][1] = sizes[i][0];
                sizes[i][0] = temp;
            }
            if(sizes[i][0] > x){
                x = sizes[i][0];
            }
            if(sizes[i][1] > y){
                y = sizes[i][1];
            }
        }
        return x*y;
    }
}