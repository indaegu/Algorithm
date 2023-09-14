class Solution {
    public String solution(String my_string, int s, int e) {
       StringBuilder str = new StringBuilder(my_string);
        String sub = str.substring(s, e + 1);
        str.replace(s, e + 1, new StringBuilder(sub).reverse().toString());
        return str.toString();
    }
}