import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < cnt; i++) //2번 반복
        {
            int num = Integer.parseInt(br.readLine()); //6
            long[] dp = new long[num + 1];

            dp[0] = 0;
            dp[1] = 1;
            if(num > 1) dp[2] = 1;
            
            for(int j = 3; j <= num; j++)   
            {
                dp[j] = dp[j - 3] + dp[j - 2];
            }

            System.out.println(dp[num]);
        }
    }
}
