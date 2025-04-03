import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] cnt = br.readLine().split(" "); //5 3
        int length = Integer.parseInt(cnt[0]); // 5
        int sumcnt = Integer.parseInt(cnt[1]); // 3
        int[] num = new int[length + 1]; //5개 숫자 보관
        int[] prevsum = new int[length + 1]; //누적 합 계산
        
        StringBuilder sb = new StringBuilder();
        String[] temp = br.readLine().split(" "); // 5 4 3 2 1
        for(int i = 1; i <= length; i++)
        {
            num[i] = Integer.parseInt(temp[i - 1]);
            prevsum[i] = prevsum[i - 1] + num[i];
        }

        for(int i = 0; i < sumcnt; i++)
        {
            String[] temp2 = br.readLine().split(" ");
            int start = Integer.parseInt(temp2[0]); //start index
            int end = Integer.parseInt(temp2[1]); //end index
            int result = 0;
            
            sb.append(prevsum[end] - prevsum[start - 1] + "\n");
        }

        System.out.println(sb);
    }
}
