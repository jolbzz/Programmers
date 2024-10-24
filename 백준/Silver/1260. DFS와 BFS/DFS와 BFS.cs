using System;
using System.Collections.Generic;

namespace BOJ1260 {
    class Program {
            static int[] input;
            static int N; //접점의 개수
            static int M; //간선의 개수
            static int V; //탐색을 시작할 정점

            public static bool[] visited = new bool[1001]; //정점의 수 + 1개
            public static int[,] map = new int[1001,1001];

            public static Queue<int> bfs = new Queue<int>();
        
        public static void Main(string[] args) 
        {
            input = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            N = input[0];
            M = input[1];
            V = input[2];

            for(int i = 0; i < M; i++)
            {
                //입력이 여러 번 반복되어서 Array 새로 만들기
                int[] Maps = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
                map[Maps[0], Maps[1]] = 1;
                map[Maps[1], Maps[0]] = 1;
            }

            Reset();
            DFS(V);
            Console.WriteLine();
            Reset();
            BFS(V);
        }

        public static void DFS(int V)
        {
            //처음은 방문처리
            visited[V] = true;    

            Console.Write(V + " ");
            //Node의 수만큼 반복
            for(int i = 1; i <= N; i++)
            {
                if(map[V, i] == 1 && visited[i] == false)
                {
                    DFS(i);    
                }    
            }
        }

        public static void BFS(int V)
        {
            //처음을 방문처리, 초기값을 Queue에 담음
            visited[V] = true;
            bfs.Enqueue(V);

            //초기값 변수 선언
            int a = V;
            while(bfs.Count != 0)
            {
                //큐에서 나온 값을 변수에 담음
                a = bfs.Dequeue();
                Console.Write(a + " ");
                for(int i = 1; i <= N; i++)
                {
                    if(map[a, i] == 1 && visited[i] == false)
                    {
                      bfs.Enqueue(i);
                      visited[i] = true;
                    }
                }
            }
        }

        public static void Reset()
        {
            for(int i = 1; i <= N; i++)
            {
                visited[i] = false; 
            }    
        }
    }
}