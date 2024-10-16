using System;
using System.Linq;

public class Solution {
    public int[] solution(int[] array, int[,] commands) 
    {
        int cnt = commands.GetLength(0);
        int[] answer = new int[cnt];
        
        for(int i = 0; i < cnt; i++)
        {
            int[] sort = array.Skip(commands[i, 0] - 1).Take(commands[i, 1] - commands[i, 0] + 1).ToArray();
            Array.Sort(sort);
            answer[i] = sort[commands[i, 2] - 1];
        }
        return answer;
    }
}