import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        //첫째 줄에 연산의 개수 N(1 ≤ N ≤ 100,000)이 주어진다. 
        //다음 N개의 줄에는 연산에 대한 정보를 나타내는 정수 x가 주어진다. 
        //만약 x가 자연수라면 배열에 x라는 값을 넣는(추가하는) 연산이고, 
        //x가 0이라면 배열에서 가장 큰 값을 출력하고 그 값을 배열에서 제거하는 경우이다.
        //입력되는 자연수는 231보다 작다.
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        //최대 힙 문제에서는 우선순위 큐 사용함
        //함수는 offer, poll, peek
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i = 0; i < cnt; i++)
        {
            int temp = Integer.parseInt(br.readLine());

            if(temp > 0) pq.offer(temp);
            else 
            {
                if(!pq.isEmpty()) 
                {
                    System.out.println(pq.poll());
                }
                else
                {
                    System.out.println(0);
                }
            }
        }
    }
}