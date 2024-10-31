using System;
using System.Collections.Generic;

namespace MyCompiler {
    class Program {
        static int[,] map;
        static bool[] visited;
        static int virus;
        public static void Main(string[] args) 
        {           
            int total = int.Parse(Console.ReadLine()); //노드
            int count = int.Parse(Console.ReadLine()); //간선
            map = new int[total + 1, total + 1];
            visited = new bool[total + 1];
            
            
            for(int i = 0; i < count; i++)
            {
                int[] input = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
                int a = input[0];
                int b = input[1];
                map[a, b] = 1;
                map[b, a] = 1; //간선 연결
            }

            virus = 0;
            DFS(1, total); //1로부터 감염된 컴퓨터 수 체크

            Console.WriteLine(virus - 1);
        }

        public static void DFS(int a, int total)
        {
            visited[a] = true;
            virus++;
            
            for(int i = 1; i <= total; i++)
            {
                if(visited[i] != true && map[a, i] == 1)
                {
                    DFS(i, total);
                }
            }
        }
    }
}