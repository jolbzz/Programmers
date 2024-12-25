import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int length = Integer.parseInt(br.readLine());
        int[] num = new int[length];

        for (int i = 0; i < length; i++) {
            num[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(num);

        for (int n : num) {
            bw.write(n + "\n");
        }

        bw.flush(); // 버퍼에 남은 데이터를 출력
        bw.close(); // 스트림 닫기
        br.close(); // 입력 스트림 닫기
    }
}
