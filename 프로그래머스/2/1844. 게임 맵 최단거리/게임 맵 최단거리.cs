using System;
using System.Collections.Generic;

class Solution {
    int length;
    int height;
    int[,] node = new int[100, 100]; //최대 100까지
    public int solution(int[,] maps) {
        length = maps.GetLength(0); //map의 x값
        height = maps.GetLength(1); //map의 y값
        //4방향 설정
        int[,] direction = {{1, 0},{0, -1}, {-1, 0}, {0, 1}};
        //현위치 설정
        int[] current_pos = {0, 0};
        int cnt = 0;
        maps[0, 0] = 0; //현 위치 0으로 초기화
        node[0 ,0] = 1; //node의 현재 값 1
        Queue<int[]> que = new Queue<int[]>(); // queue 생성
        while(true)
        {
            for(int i = 0; i < 4; i++) //4방향대로 순환
            {
                int[] next = new int[2]; //다음 x,y 좌표값
                next[0] = current_pos[0] + direction[i,0];
                next[1] = current_pos[1] + direction[i,1];
                
                if(next[0] >= 0 && //x좌표의 최솟값
                   next[0] < length && //x좌표의 최댓값
                   next[1] >= 0 && //y좌표의 최솟값
                   next[1] < height && //y좌표의 최댓값
                   maps[next[0], next[1]] == 1
                  ) 
                {
                    que.Enqueue(next); //다음 좌표를 que에 넣음
                    maps[next[0], next[1]] = 0;
                    node[next[0], next[1]] = node[current_pos[0], current_pos[1]] + 1; //다음 노드는 현재좌표 + 1씩
                    if(next[0] == length - 1 &&
                       next[1] == height - 1)
                    {
                        return node[next[0], next[1]];
                    }

                }
            }
            if(que.Count != 0)
            {
                current_pos = que.Dequeue();    
            }
            else
            {
               break;
            }
        }
        return -1;
    }
}