import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<Integer> sq = new ArrayList<>();
        int N = Integer.parseInt(br.readLine());

        int[] dp = new int[N+1];
        for(int i = 0; i * i <= N; i++)
        {
            sq.add(i * i); //제곱수 목록 저
        }

        Arrays.fill(dp, 4); //최대가 4이다.
        dp[0] = 0; //예외처리
        
        //25 = 16 + 9, 25
        for(int i = 1; i <= N; i++)
        {
            //제곱근을 넣어줌
            for(int A : sq)
            {
                if(A > i) break; //현재 돌고있는 값을 넘어서면 꺼내쓸 수 없음.

                //왜 이렇게 되냐면 dp[5] = dp[4] + 1 인것처럼 이전값 + 1(제곱수) 이런식으로 제곱수를 하나씩 꺼내서 쓰는 개념
                //이렇게 계산하면 dp[i - 꺼내쓴 제곱수] + 1(꺼내쓴 제곱수 개수) 이렇게 됨.
                dp[i] = Math.min(dp[i], dp[i - A] + 1); 
            }
        }

        System.out.println(dp[N]);
    }
}