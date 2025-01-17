import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 입력 받기: N명과 K번째 사람 제거
        String[] temp = br.readLine().split(" ");
        int n = Integer.parseInt(temp[0]);
        int k = Integer.parseInt(temp[1]);

        // 큐를 사용하여 요세푸스 문제 해결
        Queue<Integer> queue = new LinkedList<>();

        // 1부터 N까지 큐에 추가
        for (int i = 1; i <= n; i++) {
            queue.add(i);
        }

        // 요세푸스 순열 계산
        StringBuilder result = new StringBuilder();
        result.append("<");

        while (!queue.isEmpty()) {
            // K번째 사람을 제거하기 위해 (K-1)명 앞에서 빼서 뒤로 보냄
            for (int i = 1; i < k; i++) {
                queue.add(queue.poll()); // 맨 앞 요소를 빼서 뒤로 보냄
            }
            // K번째 사람 제거
            result.append(queue.poll());
            if (!queue.isEmpty()) {
                result.append(", ");
            }
        }

        result.append(">");
        System.out.println(result);
    }
}
