import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
        int length = Integer.parseInt(br.readLine());
        //양방향 큐 사용
        Deque<Integer> deq = new ArrayDeque<>();
        for(int i = 0; i < length; i++)
        {
            String[] input = br.readLine().split(" ");

            //Java는 문자열 비교 시 == 대신 equals 사용
            if(input[0].equals("push"))
            {
              deq.offerLast(Integer.parseInt(input[1]));
            }
            else if(input[0].equals("pop"))
            {
                if(deq.isEmpty())
                {
                    bw.write("-1" + "\n");
                }
                else
                {
                    bw.write(deq.pollFirst() + "\n"); 
                }
            }
            else if(input[0].equals("size"))
            {
                bw.write(deq.size() + "\n");
            }
            else if(input[0].equals("empty"))
            {
                if(deq.isEmpty())
                {
                    bw.write("1" + "\n");
                }
                else
                {
                    bw.write("0" + "\n"); 
                }
            }
            else if(input[0].equals("front"))
            {
                if(deq.isEmpty())
                {
                    bw.write("-1" + "\n");
                }
                else
                {
                    bw.write(deq.peekFirst() + "\n"); 
                }
            }
            else if(input[0].equals("back"))
            {
                if(deq.isEmpty())
                {
                    bw.write("-1" + "\n");
                }
                else
                {
                    bw.write(deq.peekLast() + "\n"); 
                }
            }
        }
        bw.close();
    }
}