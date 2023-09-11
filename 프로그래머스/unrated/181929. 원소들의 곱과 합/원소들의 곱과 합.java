class Solution {
    public int solution(int[] num_list) {
        int pow1 = 1;
        int plus1 = 0;
        for(int i =0; i<num_list.length;i++){
            pow1 = pow1 * num_list[i];
            plus1 += num_list[i];
        }
        System.out.println(pow1);
        int plus2 = plus1 * plus1;
        System.out.println(plus2);
        
        if(pow1 < plus2){
            return 1;
        }else{
            return 0;
        }
        
    }
}