import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;
public class Main {
  public static void main(String[] args) throws FileNotFoundException {
    //System.setIn(new FileInputStream("src/input.txt"));
    Scanner sc = new Scanner(System.in);
    int testCases = sc.nextInt();

    for (int t = 0; t < testCases; t++) {
      int n = sc.nextInt(); // 문서의 개수
      int m = sc.nextInt(); // 확인하고자 하는 문서의 위치
      Queue<Document> queue = new LinkedList<>();

      for (int i = 0; i < n; i++) { // 문서의 개수만큼 반복
        queue.offer(new Document(i, sc.nextInt())); // 각 문서의 인덱스와 중요도를 가진 Document 객체를 큐에 추가
      } // offer는 값을 입력 받을때 값 추가가 실패해도 에러가 발생하지 않고 false만 반환

      int printOrder = 0; // 인쇄 순서를 추적하는 변수
      while (!queue.isEmpty()) { // 큐가 빌 때까지 반복
        Document current = queue.poll(); // 큐에서 문서 하나를 꺼냄
        // poll() : 큐 맨 앞에 있는 값 반환 후 삭제, 큐가 비어있을 경우 null 반환
        // peak() : 큐 맨 앞에 있는 값 반환 함
        boolean hasHigherPriority = false; // 현재 문서보다 중요도가 높은 문서가 있는지 확인하는 플래그
        for (Document doc : queue) { // 큐에 남아 있는 문서들을 반복하며 확인
          if (doc.priority > current.priority) { // 현재 문서보다 중요도가 높은 문서가 있는 경우
            hasHigherPriority = true; // 플래그를 true로 설정
            break; // 더 이상 확인할 필요 없으므로 반복 중단
          }
        }

        if (hasHigherPriority) { // 중요도가 더 높은 문서가 있는 경우
          queue.offer(current); // 현재 문서를 큐의 끝에 다시 추가
        } else { // 그렇지 않은 경우
          printOrder++; // 인쇄 순서를 증가
          if (current.index == m) { // 현재 문서가 확인하고자 하는 문서인 경우
            System.out.println(printOrder); // 인쇄 순서 출력
            break; // 반복 중단
          }
        }
      }
    }

    sc.close(); // Scanner 객체를 닫음
  }

  static class Document { // 문서를 나타내는 내부 클래스
    int index; // 문서의 위치(인덱스)
    int priority; // 문서의 중요도

    Document(int index, int priority) { // 생성자
      this.index = index; // 인덱스 초기화
      this.priority = priority; // 중요도 초기화
    }
  }
}
