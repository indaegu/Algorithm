// if문과 elseif문을 활용하면 간단하게 해결할수 있을것이다.
class Solution {
    public int solution(String ineq, String eq, int n, int m) {
        int answer = 0;
        //문자열은 s1.equals(s2)처럼 문자열을 비교해야한다. ==으로 비교하면 해당 값의 주소값을 비교하는 반면 equlas는 해당값 자체를 비교하기 때문이다.
        if((ineq.equals(">") && eq.equals("="))&&(n>=m)){
            System.out.print(ineq + eq + n + m);
            answer = 1;
        }else if((ineq.equals("<") && eq.equals("="))&&(n<=m)){
            System.out.print(ineq + eq + n + m);
            answer = 1;
        }else if((ineq.equals(">") && eq.equals("!"))&&(n>m)){
            System.out.print(ineq + eq + n + m);
            answer = 1;
        }else if((ineq.equals("<") && eq.equals("!"))&&(n<m)){
            System.out.print(ineq + eq + n + m);
            answer = 1;
        }else{
            System.out.print(ineq + eq + n + m);
            answer = 0;
        }
        return answer;
    }
}