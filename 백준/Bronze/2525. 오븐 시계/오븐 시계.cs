using System;

namespace MyCompiler {
    class BOJ2525{
        public static void Main(string[] args) 
        {
            int[] start = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int time = int.Parse(Console.ReadLine());
            int min = time + start[1];
            
            while(min >= 60)
            {
                min -= 60;
                start[0]++;

                if(start[0] > 23)
                {
                    start[0] = 0;    
                }
            }

            Console.WriteLine(start[0] + " " + min);
        }
    }
}