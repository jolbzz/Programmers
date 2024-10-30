using System;

namespace MyCompiler {
    class BOJ1463 {
        public static void Main(string[] args) 
        {
            int input = Convert.ToInt32(Console.ReadLine());
            int[] dp = new int[input + 1]; //점화식
            dp[1] = 0; //연산 한 번 한거로 계산

            //i 는 2부터 시작
            for(int i = 2; i <= input; i++)
            {
                dp[i] = dp[i - 1] + 1; //+1은 연산횟수
                
                if(i%2 == 0)
                {
                    dp[i] = Math.Min(dp[i], dp[i/2] + 1);    
                }
                
                if(i%3 == 0)
                {
                    dp[i] = Math.Min(dp[i], dp[i/3] + 1);    
                }
            }

            Console.WriteLine(dp[input]);
        }
    }
}