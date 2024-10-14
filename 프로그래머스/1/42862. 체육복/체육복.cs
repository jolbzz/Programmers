using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int solution(int n, int[] lost, int[] reserve) 
    {
        int answer = 0;
        Dictionary<int, int> person = new Dictionary<int, int>();
        
        //정렬에서 테스트케이스 오류
        Array.Sort(lost);
        Array.Sort(reserve);
        
        for(int i = 0; i < lost.Length; i++)
        {
            for(int j = 0; j < reserve.Length; j++)
            {
                //잃어버린 애랑 여분 가진 애가 동일한 경우
                if(reserve[j] == lost[i])
                {
                  lost[i] = -1;   
                  reserve[j] = -1;
                }             
            }
        }
        
        foreach(var l in lost)
        {
            if(l != -1)
            {
                person.Add(l, 1);
            }
        }
        Console.WriteLine(person.Count);
        foreach(var a in reserve)
        {            
            //잃어버린 애가 앞 뒤 순번인 경우
            if(person.ContainsKey(a - 1))
            {
                person.Remove(a - 1);
            } 
            else if(person.ContainsKey(a + 1))
            {
                person.Remove(a + 1);
            } 
        }
        
        answer = n - person.Count;
        return answer;
    }
}