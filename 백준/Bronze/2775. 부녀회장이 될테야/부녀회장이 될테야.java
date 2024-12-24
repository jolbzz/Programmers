import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < T; i++)
        {
            int floor = Integer.parseInt(br.readLine()); //층
            int house = Integer.parseInt(br.readLine()); //호
            
            int[][] dp = new int[floor+1][house+1];

            for(int j = 1; j <= house; j++)
            {
                dp[0][j] = j;
            }
            
            for(int j = 1; j <= floor; j++)
            {
                for(int k = 1; k <= house; k++)
                {
                    dp[j][k] = dp[j-1][k] + dp[j][k-1];
                }
            }

            System.out.println(dp[floor][house]);
        }
    }
}