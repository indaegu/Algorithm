import java.io.FileInputStream;
import java.util.*;

public class Solution {
    public static void main(String args[]) throws Exception {
        //System.setIn(new FileInputStream("src/input.txt"));
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int test_case = 1; test_case <= T; test_case++) {
            int testCaseNum = sc.nextInt();
            System.out.print("#" + testCaseNum + " ");
            ArrayList<Integer> arrayList = new ArrayList<>();
            for (int i = 0; i < 1000; i++) {
                arrayList.add(sc.nextInt());
            }
            int[] arr = new int[101];
            for (int i = 0; i < 1000; i++) {
                if(arrayList.contains(arrayList.get(i))){
                    arr[arrayList.get(i)] += 1;
                }
            }
            int max = 0;
            int answer =0;
            for (int i = 0; i < 100; i++) {
                if(max <= arr[i]){
                    max = arr[i];
                    answer = i;
                }
            }
            System.out.println(answer);
        }
    }
}
