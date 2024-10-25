using System;
using System.Collections.Generic;

namespace MyCompiler {
    class BOJ1182 {
        public static void Main(string[] args) 
        {
            int[] input = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);
            int targetnum = input[1]; //만들어야 하는 수
            int[] partial = Array.ConvertAll(Console.ReadLine().Split(' '), int.Parse);

            //공집합인 경우 합이 0이면 따로빼줌
            int result = PartialNum(partial, targetnum, 0, 0) - (targetnum == 0 ? 1 : 0);
            Console.Write(result);
        }

        public static int PartialNum(int[] partial, int target, int sum, int index)
        {
            //마지막까지 계산을 진행했고 target이랑 같은 경우만
            if(partial.Length == index)
            {
                return (target == sum)? 1:0;
                
            }

            int partialFirst = PartialNum(partial, target, sum + partial[index], index+1);
            int partialSecond = PartialNum(partial, target, sum, index+1);

            return partialFirst + partialSecond;
        }
    }
}