import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Queue<Integer> queue = new LinkedList<>();
        int cnt = Integer.parseInt(br.readLine());

        for(int i = 1; i <= cnt; i++)
        {
            queue.add(i);
        }
        
        //큐가 하나 남을때까지 재생
        while(queue.size() > 1)
        {
            queue.poll();
            queue.add(queue.poll());
        }

        System.out.println(queue.poll());
    }
}
