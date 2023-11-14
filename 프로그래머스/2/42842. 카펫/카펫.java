import java.util.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int carpetSize = brown + yellow;
        int x = 0;
        int y = 0;
        for(int i = 0; i <= carpetSize; i++){
            System.out.printf("x: %d y: %d\n", x, y);
            if(x * y == carpetSize && x >= y && brown == (x * 2) + (y * 2) - 4){
                answer[0] = x;
                answer[1] = y;
                break;
            }else{
                 x++;
                 y = carpetSize / x;
            }
        }
        return answer;
    }
}