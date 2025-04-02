import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int[] dp = new int[11]; //1,2,3 이 되는거 만들 예정 최대 11까지 만들 수 있다.
        dp[1] = 1; //1로 1을 만드는 방법 1가지
        dp[2] = 2; //1+1, 2 로 2를 만드는 방법 2가지
        dp[3] = 4; //1+1+1, 1+2, 2+1, 3 로 3을 만드는 방법 4가지

        //점화식을 미리 계산함.
        for(int i = 4; i < 11; i++)
        {
            dp[i] = dp[i - 1] + dp[i - 2] + dp[i - 3]; //1을 만드는 방법, 2를 만드는 방법, 3을 만드는 방법으로 구함.
        }
        
        for(int i = 0; i < length; i++)
        {
            int temp = Integer.parseInt(br.readLine());
            System.out.println(dp[temp]);
        }
    }
}
