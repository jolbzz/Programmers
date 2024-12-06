import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {  
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num = Integer.parseInt(br.readLine()); //개수
        PriorityQueue<Integer> save = new PriorityQueue<>();
        
        for(int i = 0; i < num; i++)
        {
            int temp = Integer.parseInt(br.readLine());
            
            //자연수일 경우 저장
            if(temp > 0)
            {
                save.add(temp);
            }
            else if(temp == 0)
            {
                if(save.size() > 0)
                {
                    System.out.println(save.poll());
                }
                //값이 하나도 안 들어있을 경우
                else
                {
                    System.out.println(0);
                }
            }
        }
    }

}
