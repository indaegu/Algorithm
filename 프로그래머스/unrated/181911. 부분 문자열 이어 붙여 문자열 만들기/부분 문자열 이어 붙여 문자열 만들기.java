class Solution {
    public String solution(String[] my_strings, int[][] parts) {
        StringBuilder str = new StringBuilder();
        for(int i = 0; i < my_strings.length; i++){
                int s = parts[i][0];
                int e = parts[i][1];
                str.append(my_strings[i].substring(s,e+1));
        }
        return str.toString();
    }
}