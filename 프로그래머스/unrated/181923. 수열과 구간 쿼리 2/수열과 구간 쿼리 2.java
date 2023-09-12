public class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        int[] answer = new int[queries.length];

        for (int i = 0; i < queries.length; i++) {
            int s = queries[i][0];
            int e = queries[i][1];
            int k = queries[i][2];

            int minVal = Integer.MAX_VALUE;
            boolean found = false;

            for (int j = s; j <= e; j++) {
                if (arr[j] > k && arr[j] < minVal) {
                    minVal = arr[j];
                    found = true;
                }
            }

            if (found) {
                answer[i] = minVal;
            } else {
                answer[i] = -1;
            }
        }

        return answer;
    }
}

// 회고 : 이중 for문으로 풀어보려고 시도 했지만 크면서 가장 작은 arr[i]에서 막히고 또 arr이 queries보다 짧은 경우를 생각하니 코드가 너무 복잡해졌다
