using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int[] solution(string[] genres, int[] plays) 
    {
        //11시 55분
        int[] answer = new int[] {};
        //속한 노래가 많이 재생 장르 - 먼저 수록
        //장르 내에서 많이 재생된 노래 먼저 수록
        //재생 횟수가 같으면 고유 번호 낮은 순
        Dictionary<string, int> song = new Dictionary<string, int>();
        Dictionary<string, List<int[]>> playsong = new Dictionary<string, List<int[]>>();
        
        for(int i = 0; i < genres.Length; i++)
        {
            //포함되어있지 않다면 추가
            if(!song.ContainsKey(genres[i]))
            {
                song.Add(genres[i], 0);
            }  
            song[genres[i]] += plays[i];
            
            if(!playsong.ContainsKey(genres[i]))
            {
                playsong[genres[i]] = new List<int[]>();
            }  
            playsong[genres[i]].Add(new int[] {plays[i], i});
        }
        
        //장르별로 담는다 큰수부터 
        var s1 = song.OrderByDescending(x => x.Value).Select(x => x.Key).ToList();
        //장르별 번호 담기
        List<int> answerList = new List<int>();
        foreach(var a in s1)
        {
            var ans = playsong[a]
                     .OrderByDescending(x => x[0])
                     .ThenBy(x => x[1])
                     .Select(x => x[1])
                     .Take(2);
            
            answerList.AddRange(ans);
        }
        return answerList.ToArray();
    }
}