class Solution {
    public String solution(String s) {
        String[] arr = s.split(" ", -1);
            for (int j = 0; j < arr.length; j++) {
                if(arr[j].length() >= 1){
                arr[j] = arr[j].toLowerCase();
                arr[j] = Character.toUpperCase(arr[j].charAt(0)) + arr[j].substring(1,arr[j].length());
                }
            }
        String result = String.join(" ",arr);
        return result;   
    }
}