// 전략 : index 값을 적절히 활용하여 2차원 배열의 위치를 바꾼다. queries에 있는 원소의 값을 잘가져오는것이 관건 2차원 배열에 대한 이해도를 요구하는 문제
import java.util.Arrays;
class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int temp = 0;
        for(int i = 0; i < queries.length; i++){
            temp = arr[queries[i][0]];
            arr[queries[i][0]] = arr[queries[i][1]];
            arr[queries[i][1]] = temp;         }
        return arr;
    }
}