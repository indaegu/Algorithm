import java.io.FileInputStream;
import java.util.*;

public class Solution {
  public static void main(String args[]) throws Exception {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int T = sc.nextInt();
    for (int test_case = 1; test_case <= T; test_case++) {
      int N = sc.nextInt();
      ArrayList<Integer> arrayList = new ArrayList<>();
      for (int i = 0; i < 1000; i++) {
        arrayList.add(sc.nextInt());
      }
      System.out.println("#" + N + " " + method(arrayList));
    }
  }

  public static int method(ArrayList<Integer> arrayList) {
    Map<Integer,Integer> map = new HashMap<>();
    int max = 0;
    int maxx =0;
    for (int i = 0; i < 1000; i++) {
      if(map.containsKey(arrayList.get(i))){
        map.put(arrayList.get(i), map.get(arrayList.get(i))+1);
      }else{
        map.put(arrayList.get(i), 1);
      }
    }
    //참조 부분
    int maxCount = 0;
    int maxNumber = 0;
    // entryset은 map의 모든 키-값 집합을 반환
    // 하나씩 entry를 비교하며 반복문 수행
    for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
      if (entry.getValue() > maxCount) { // 각 entry의 value를 뽑아 내면서 가장 큰 수이면 max count와 number를 초기화
        maxCount = entry.getValue();
        maxNumber = entry.getKey();
      } else if (entry.getValue() == maxCount && entry.getKey() > maxNumber) { // max count가 동일하면 key 값이 더큰 수를 출력
        maxNumber = entry.getKey();
      }
    }

    return maxNumber;
  }
}
