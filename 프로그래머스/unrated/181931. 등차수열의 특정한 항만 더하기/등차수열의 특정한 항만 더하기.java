// for문과 else if문으로 케이스별로 접근해본다.
class Solution {
    public int solution(int a, int d, boolean[] included) {
        int answer = a;
        int length = included.length; // 배열의 길이를 구하려면 .length로 
        int[] total = new int[length+1];
        if(included[0]){
            total[0] = a;
        }else{
            total[0] = a;
            answer -= a;
        }
        System.out.println(total[0]);
        for(int i = 1; i<length;i++){
            total[i] = total[i-1] + d;
            System.out.println(total[i]);
            if(included[i]){
                answer += total[i];
            }
        }
        return answer;
    }
}