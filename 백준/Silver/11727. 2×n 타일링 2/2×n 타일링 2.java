import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        int[] dp = new int[len + 1];

        //1. 초기값 설정
        dp[1] = 1;

        //2. 예외처리
        if(len > 1) dp[2] = 3;

        //3. 값 대입 & 점화식 세우기
        for(int i = 3; i <= len; i++)
        {
            dp[i] = (dp[i-1] + 2*dp[i-2])%10007;
        }

        System.out.println(dp[len]);
    }
}