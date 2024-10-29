using System;

namespace MyCompiler {
    class Program {
        public static void Main(string[] args) 
        {
            int[] input = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
            int N = input[0];
            int M = input[1];
            int[,] maps = new int [N, M];
            int MAX = 0;
            for(int i = 0; i < N; i++)
            {
                int[] num = Array.ConvertAll(Console.ReadLine().Split(), int.Parse);
                for(int j = 0; j < M; j++)
                {
                    maps[i, j] = num[j];
                }
            }

            //테트로미노 최대합 구하기
            for(int i = 0; i < N; i++)
            {
                for(int j = 0; j < M; j++)
                {
                    MAX = Math.Max(MAX, CheckTet(maps, i, j));
                }
            }

            Console.WriteLine(MAX);
        }

        public static int CheckTet(int[,] maps, int i, int j)
        {
            int[][][] teterom = 
            {
                new int [][] //1자 모양
                {
                   new int[] {1, 0, 0, 0},
                   new int[] {1, 0, 0, 0},
                   new int[] {1, 0, 0, 0},
                   new int[] {1, 0, 0, 0}
                },
                new int [][] //1자 모양
                {
                   new int[] {1, 1, 1, 1},
                   new int[] {0, 0, 0, 0},
                   new int[] {0, 0, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㅁ 모양
                {
                   new int[] {1, 1, 0, 0},
                   new int[] {1, 1, 0, 0},
                   new int[] {0, 0, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㄱ 모양
                {
                   new int[] {1, 1, 1, 0},
                   new int[] {1, 0, 0, 0},
                   new int[] {0, 0, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㄱ 모양
                {
                   new int[] {1, 1, 1, 0},
                   new int[] {0, 0, 1, 0},
                   new int[] {0, 0, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㄱ 모양
                {
                   new int[] {1, 0, 0, 0},
                   new int[] {1, 0, 0, 0},
                   new int[] {1, 1, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㄱ 모양
                {
                   new int[] {0, 1, 0, 0},
                   new int[] {0, 1, 0, 0},
                   new int[] {1, 1, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㄱ 모양
                {
                   new int[] {1, 1, 0, 0},
                   new int[] {0, 1, 0, 0},
                   new int[] {0, 1, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㄱ 모양
                {
                   new int[] {0, 0, 1, 0},
                   new int[] {1, 1, 1, 0},
                   new int[] {0, 0, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㄱ 모양
                {
                   new int[] {1, 0, 0, 0},
                   new int[] {1, 1, 1, 0},
                   new int[] {0, 0, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㄱ 모양
                {
                   new int[] {1, 1, 0, 0},
                   new int[] {1, 0, 0, 0},
                   new int[] {1, 0, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㄹ 모양
                {
                   new int[] {1, 0, 0, 0},
                   new int[] {1, 1, 0, 0},
                   new int[] {0, 1, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㄹ 모양
                {
                   new int[] {0, 1, 0, 0},
                   new int[] {1, 1, 0, 0},
                   new int[] {1, 0, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㄹ 모양
                {
                   new int[] {1, 1, 0, 0},
                   new int[] {0, 1, 1, 0},
                   new int[] {0, 0, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㄹ 모양
                {
                   new int[] {0, 1, 1, 0},
                   new int[] {1, 1, 0, 0},
                   new int[] {0, 0, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㅅ 모양
                {
                   new int[] {0, 1, 0, 0},
                   new int[] {1, 1, 1, 0},
                   new int[] {0, 0, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㅅ 모양
                {
                   new int[] {1, 1, 1, 0},
                   new int[] {0, 1, 0, 0},
                   new int[] {0, 0, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㅅ 모양
                {
                   new int[] {0, 1, 0, 0},
                   new int[] {1, 1, 0, 0},
                   new int[] {0, 1, 0, 0},
                   new int[] {0, 0, 0, 0}
                },
                new int [][] //ㅅ 모양
                {
                   new int[] {1, 0, 0, 0},
                   new int[] {1, 1, 0, 0},
                   new int[] {1, 0, 0, 0},
                   new int[] {0, 0, 0, 0}
                }
            };

            int maxSum = 0;
            foreach(var blocks in teterom)
            {
                int currentSum = 0;
                for(int cx = 0; cx < blocks.Length; cx++)
                {
                    for(int cy = 0; cy < blocks.Length; cy++)
                    {
                        //블록이 있는 위치
                        if(blocks[cx][cy] == 1)
                        {
                            int nx = i + cx;
                            int ny = j + cy;
                            
                            if(nx >= 0 && ny >= 0 && nx < maps.GetLength(0) && ny < maps.GetLength(1))
                            {
                                currentSum += maps[nx, ny];
                            }
                            else
                            {
                                break;
                            }
                        }
                    }
                }                 
                maxSum = Math.Max(currentSum, maxSum);
            }
            return maxSum;
        }
    }
}