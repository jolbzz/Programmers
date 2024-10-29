using System;
using System.Collections.Generic;

 public class BOJ2178 {
        public static void Main(string[] args) 
        {
            int[] input = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);

            int N = input[0]; 
            int M = input[1];
            int[,] map = new int[N+1, M+1];
            int[,] node = new int[N+1, M+1];
            int[,] direction = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};
            Queue<(int, int)> dfs = new Queue<(int, int)>();

            //맵 만들기
            for(int i = 1; i <= N; i++)
            {
                string maps = Console.ReadLine();
                for(int j = 1; j <= M; j++)
                {
                    map[i, j] = int.Parse(maps[j - 1].ToString());
                }      
            }

            dfs.Enqueue((1, 1));
            node[1, 1] = 1;
            while(dfs.Count > 0)
            {
                var current = dfs.Dequeue();
                int cx = current.Item1;
                int cy = current.Item2;
                
                //끝에 도달
                if(cx == N && cy == M)
                {
                    Console.WriteLine(node[cx, cy]);
                }

                //4방향 고려
                for(int i = 0; i < 4; i++)
                {
                    int nx = cx + direction[i, 0];
                    int ny = cy + direction[i, 1];

                    //인덱스 안 벗어나고 이동 가능한 칸에서만
                    if(nx < N+1 && ny < M+1 && nx > 0 && ny > 0 && map[nx, ny] == 1 && node[nx, ny] == 0)
                    {
                        dfs.Enqueue((nx, ny));
                        node[nx, ny] = node[cx, cy] + 1; //거리 증가
                    }
                }
            }
        }

    }