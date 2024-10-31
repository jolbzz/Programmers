using System;

namespace MyCompiler {
    class BOJ2579 {
        public static void Main(string[] args) 
        {
            //계단은 한 번에 1, 2
            // 연속 3개 불가
            // 마지막 필수
            int total_stairs = int.Parse(Console.ReadLine());
            int[] stairs = new int[total_stairs + 1];
            int[] dp = new int[total_stairs + 1];
            
            for(int i = 1; i <= total_stairs; i++)
            {
                stairs[i] = int.Parse(Console.ReadLine());
            }

            if(total_stairs == 1)
            {
                Console.WriteLine(stairs[1]);
                return;
            }
            dp[1] = stairs[1];
            dp[2] = stairs[1] + stairs[2]; //최댓값을 구하는 문제여서 1과 2 둘다 밟은거로 설정
            for(int i = 3; i < total_stairs + 1; i++)
            {
                //두 칸 전에서 한 번에 도착 또는 3칸 전에서 두 칸 한 칸 오면 3칸 연속 안 밟힘 
                dp[i] = Math.Max(dp[i-2] + stairs[i], dp[i-3] + stairs[i - 1] + stairs[i]);    
            }

            Console.WriteLine(dp[total_stairs]);
        }
    }
}