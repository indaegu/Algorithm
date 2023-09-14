class Solution {
    public String solution(String my_string, int[][] queries) {
        // my_string 문자열을 StringBuilder로 변환한뒤 str에 저장한다.
      StringBuilder str = new StringBuilder(my_string);

        //foreach문으로 queries의 각 원소값을 반복한다.
        for (int[] query : queries) { 
            // 바꾸고자 하는 범위의 문자열을 추출한다.
            String sub = str.substring(query[0], query[1] + 1);
            // replace를 이용해 해당 범위의 문자열을 뒤집고 대체한다.
            str.replace(query[0], query[1] + 1, new StringBuilder(sub).reverse().toString());
        }

        return str.toString();
    }
}