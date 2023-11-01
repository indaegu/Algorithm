import java.io.FileInputStream;
import java.util.*;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    for (int test_case = 1; test_case <= 10; test_case++) {
      System.out.print("#" + test_case + " ");
      int dump = sc.nextInt();
      Map<Integer,Integer> map = new HashMap<>();

      for (int i = 0; i < 100; i++) {
        map.put(i,sc.nextInt());
      }
      int ans = 0;
      for (int i = 0; i < dump+1; i++) { //dump + 1을 해야 #6 케이스가 정상적으로 답이된다. 덤프가 종료된 즉시의 ans를 출력해야함
        // 그러나 현재 코드는 ans의 값을 구하고 replace를 진행하기 때문에 마지막 dump에서 ans가 변하는 경우를 고려하지 않음
        // 따라서 dump보다 1만큼 더 진행하고 그 값을 ans로 출력
        int max = -1;
        int min = 1000;
        int maxKey = -1;
        int minKey = -1;
        for (int j = 0; j < 100; j++) {
          if(max<map.get(j)){
            max = map.get(j);
            maxKey = j;
          }
          if(min>map.get(j)){
            min = map.get(j);
            minKey = j;
          }
        }
        if(map.get(maxKey) - map.get(minKey)==0 || map.get(maxKey) - map.get(minKey) == 1) break;
        if(map.get(minKey)<1 ||map.get(maxKey)>100) break;
        ans = map.get(maxKey) - map.get(minKey);
        map.replace(maxKey, map.get(maxKey)-1);
        map.replace(minKey, map.get(minKey)+1);
      }
      System.out.println(ans);
    }
  }
}
