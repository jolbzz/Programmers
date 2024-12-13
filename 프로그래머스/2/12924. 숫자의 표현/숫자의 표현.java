
class Solution {
    public int solution(int n) 
    {
        int cnt = 0;
        
        //연속 합 + 1이 15를 넘는지 체크
        for(int i = 1; i * (i+1)/2 <= n; i++)
        {
            //(15 - 연속합) % 현재 수 가 나누어 떨어지면 카운팅
           if((n - (i * (i-1)) / 2) % i == 0)
           {
              cnt++;
           }
        }
        
        return cnt;
    }
}
