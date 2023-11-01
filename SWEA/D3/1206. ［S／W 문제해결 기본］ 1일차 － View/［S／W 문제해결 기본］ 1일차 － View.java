import java.io.FileInputStream;
import java.util.*;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    Map<Integer, Integer> map = new HashMap<>();
    int sun = 0;
    int max = 0;
    for (int i = 1; i <= 10; i++) {
      int numberBuilding = sc.nextInt();
      System.out.printf("#%d ",i);
      for (int j = 0; j < numberBuilding; j++) {
        map.put(j,sc.nextInt());
      }
      for (int j = 2; j < numberBuilding-2; j++) {
        if(map.get(j)>map.get(j-1) && map.get(j)>map.get(j-2) && map.get(j)>map.get(j+1) && map.get(j)>map.get(j+2)){// 좌우 두칸 높이 비교
          //좌우 두칸 중에서 가장 높은 층수를 구한다음
          max =Collections.max(Arrays.asList(map.get(j - 1), map.get(j - 2), map.get(j + 1), map.get(j + 2)));
          // 현재 빌딩의 층수에서 가장 높은 층수의 차이를 구하면 조망권이 확보된 층의 갯수가 나온다
          sun += map.get(j) - max;
        }
      }
      System.out.println(sun);
      sun = 0;// 다음 테스트 케이스전에 조망권을 초기화 해준다
    }
  }
}
