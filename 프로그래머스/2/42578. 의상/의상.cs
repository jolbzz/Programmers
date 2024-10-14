using System;
using System.Collections.Generic;

public class Solution {
    public int solution(string[,] clothes) 
    {
        int answer = 1;
        Dictionary<string, int> fashion = new Dictionary<string, int>();

        //옷 종류 저장
        for(int i = 0; i < clothes.GetLength(0); i++)
        {
            if(!fashion.ContainsKey(clothes[i, 1]))
            {
                fashion.Add(clothes[i, 1], 1);
            }
            else
            {
                fashion[clothes[i, 1]]++;   
            }
        }
        
        foreach(var a in fashion)
        {
            answer *= a.Value + 1;
        }
        
        answer -= 1;
        return answer;
    }
}