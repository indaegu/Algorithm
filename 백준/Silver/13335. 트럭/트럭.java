import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class Main {
  public static void main(String args[]) throws FileNotFoundException {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int N = sc.nextInt(); // 다리를 건너는 트럭의 수
    int W = sc.nextInt(); // 다리의 길이
    int L = sc.nextInt(); // 다리의 최대 하중
    Queue<Integer> bridge = new LinkedList<>();
    int[] truckWeight = new int[N];
    for (int i = 0; i < N; i++) {
      truckWeight[i] = sc.nextInt(); // 트럭의 각 가중치를 넣어줌
    }
    int time = 0; // 시간이 지남을 담을 변수 선언
    int currentWeight = 0; // 현재 다리에 걸린 하중을 담을 변수 선언
    int i = 0; // 트럭 인덱스

    while (i < N) { // 모든 트럭이 다리를 건너게 될 때까지 반복
      if (bridge.size() == W) { // 다리가 꽉 찼다면
        currentWeight -= bridge.poll(); // 다리의 맨 앞 트럭의 무게를 빼줌
      } else {
        if (currentWeight + truckWeight[i] <= L) { // 다리에 트럭이 들어갈 수 있다면
          bridge.offer(truckWeight[i]); // 트럭을 다리에 올림
          currentWeight += truckWeight[i]; // 현재 무게에 트럭 무게 추가
          i++; // 다음 트럭으로 이동
        } else {
          bridge.offer(0); // 다리에 여유가 없으면 빈 공간을 큐에 추가
        }
        time++; // 시간 증가
      }
    }

    time += W; // 마지막 트럭이 다리를 건너는 시간 추가
    System.out.println(time); // 최종 시간 출력
  }
}
