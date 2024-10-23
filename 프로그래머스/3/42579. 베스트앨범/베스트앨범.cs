using System;
using System.Collections.Generic;
using System.Linq;

public class Solution {
    public int[] solution(string[] genres, int[] plays) 
    {
        int length = genres.Length;
        int[] answer = new int[] {};
        Dictionary<string, int> songs = new Dictionary<string, int>();
        Dictionary<string, List<int[]>> PlaySong = new Dictionary<string, List<int[]>>();
        //순서는 많이 재생된 장르 / 장르 내에서 많이 재생 / 장르 내에서 고유횟수가 같은건
        // 고유 번호가 낮은 노래 먼저
        
        for(int i = 0; i < length; i++)
        {
            //처음 들어가는 곡이라면 Dictionary에 추가
            if(!songs.ContainsKey(genres[i]))
            {
                songs.Add(genres[i], 0);
            }  
            songs[genres[i]] += plays[i];
            
            if(!PlaySong.ContainsKey(genres[i]))
            {
                PlaySong[genres[i]] = new List<int[]>();
            }  
            PlaySong[genres[i]].Add(new int[] {plays[i], i});
        }
        
        //장르별 재생 수 높은 순으로 정렬
        var a_genres = songs.OrderByDescending(x => x.Value).Select(x => x.Key).ToList();
        //List에서 옮기는거라 List선언 후 배열로 변경
        List<int> answerList = new List<int>();
        foreach(var genre in a_genres)
        {
            //재생횟수와 고유 번호를 2개씩 담는다.
            var play_list = PlaySong[genre] //장르별 리스트에 담긴 값 확인
                    .OrderByDescending(x => x[0]) //Play수로 내림차순
                    .ThenBy(x => x[1]) //재생수가 같으면 고유번호 순
                    .Take(2);
            
            //장르별 고유 번호 2개만 정답으로 옮긴다.(play_list[1]이 고유 번호)
            foreach(var num in play_list)
            {
                answerList.Add(num[1]);
            }
        }

        return answerList.ToArray();
    }
}