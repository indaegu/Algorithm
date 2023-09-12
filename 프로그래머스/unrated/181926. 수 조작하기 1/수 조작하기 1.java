// 전략 : else if문이나 switch문을 활용하고 반복문을 통해 해결한다.
class Solution {
    public int solution(int n, String control) {
        for(int i = 0; i<control.length(); i++){
            switch(control.charAt(i)){
                case 'w' -> n += 1;
                case 's' -> n -= 1;
                case 'd' -> n += 10;
                case 'a' -> n -= 10;
                default -> System.out.println("Unknown.");
            }
        }
        return n;
    }
}
