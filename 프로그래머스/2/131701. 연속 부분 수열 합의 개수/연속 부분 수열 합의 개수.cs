using System;
using System.Collections.Generic;

public class Solution {
    public int solution(int[] elements) {
        int answer = 0;
        int cnt = elements.Length;
        HashSet<int> hash = new HashSet<int>();
        int total = 0;
        //길이 별 합계
        for(int len = 1; len <= cnt; len++)
        {         
            //좌표 이동 0, 1 / 0, 2 ...
            for(int i = 0; i < cnt; i++)
            {
                total = 0;
                //길이만큼만 더하기 원형 수열이라 나머지로 계산해서 인덱스 에러 방지
                for(int j = 0; j < len; j++)
                {
                    total += elements[(i + j) % cnt];
                }
                hash.Add(total);
            }    
        }
        
        return hash.Count;
    }
}