import java.io.*;
import java.util.*;

class Solution {
    public int solution(int[] numbers, int target) 
    {
        int answer = 0;
        
        answer = DFS(numbers, target, 0, 0);
        return answer;
    }
    
    public int DFS(int[] numbers, int target, int index, int total)
    {
        //배열의 마지막에 도달
        if(index == numbers.length)
        {
            //최종값이 target일 경우
            if(total == target)
            {
                return 1;  
            } 
            else
            {
                return 0;    
            }
        }
        
        int total_add = DFS(numbers, target, index+1, total + numbers[index]); //더하는 경우
        int total_abs = DFS(numbers, target, index+1, total - numbers[index]); //빼는 경우
        
        return total_add + total_abs;
    }
}