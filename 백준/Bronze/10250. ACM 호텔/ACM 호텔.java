import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < cnt; i++)
        {
            String[] temp = br.readLine().split(" ");
            int h = Integer.parseInt(temp[0]);
            int w = Integer.parseInt(temp[1]);
            int n = Integer.parseInt(temp[2]);

            int floor = n % h == 0 ? h : n % h; // 층 번호
            int room = (n - 1) / h + 1;         // 방 번호

            System.out.println(floor * 100 + room); // 방 번호 출력
        }
    }
}