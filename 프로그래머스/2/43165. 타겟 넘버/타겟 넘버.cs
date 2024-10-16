using System;
using System.Collections.Generic;

public class Solution {
    public int solution(int[] numbers, int target) 
    {
        int answer = 0;
        //합계와 인덱스를 담음
        Queue<(int sum, int index)> ans = new Queue<(int sum, int index)>();
        
        ans.Enqueue((0, 0));
        while(ans.Count > 0)
        {
            //현재 합과 위치 저장
            var current = ans.Dequeue();
            int currentSum = current.sum;
            int currentIndex = current.index;
            
            //인덱스의 마지막
            if(currentIndex == numbers.Length)
            {
                if(currentSum == target) answer++;    
            }
            else
            {
                //더한경우
                ans.Enqueue((currentSum + numbers[currentIndex], currentIndex+1));   
                //뺀 경우
                ans.Enqueue((currentSum - numbers[currentIndex], currentIndex+1)); 
            }  
        }
        return answer;
    }
}