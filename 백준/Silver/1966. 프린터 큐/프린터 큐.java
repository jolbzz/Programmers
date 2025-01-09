import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine()); // 테스트 케이스 수 입력

        for (int i = 0; i < cnt; i++) {
            String[] temp = br.readLine().split(" ");
            int doc_cnt = Integer.parseInt(temp[0]); // 문서 개수
            int location = Integer.parseInt(temp[1]); // 목표 문서 위치

            Queue<int[]> doc = new LinkedList<>(); // 문서 저장 큐
            PriorityQueue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder()); // 우선순위 큐

            // 문서 중요도 입력 처리
            String[] prior = br.readLine().split(" ");
            for (int j = 0; j < doc_cnt; j++) {
                int priority = Integer.parseInt(prior[j]);
                doc.add(new int[]{j, priority}); // (문서 인덱스, 중요도)
                priorityQueue.add(priority); // 우선순위 큐에 중요도 저장
            }

            int printOrder = 0; // 출력 순서

            // 출력 시뮬레이션 시작
            while (!doc.isEmpty()) {
                int[] current = doc.poll(); // 큐에서 문서 꺼냄
                if (current[1] == priorityQueue.peek()) { // 중요도가 가장 높으면
                    printOrder++; // 출력 순서 증가
                    priorityQueue.poll(); // 우선순위 큐에서도 제거
                    if (current[0] == location) { // 목표 문서라면
                        System.out.println(printOrder); // 출력 순서 출력
                        break;
                    }
                } else {
                    doc.add(current); // 중요도가 낮으면 다시 큐의 뒤로 이동
                }
            }
        }
    }
}
