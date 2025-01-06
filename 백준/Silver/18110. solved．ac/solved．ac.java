import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        if(cnt > 0)
        {
            int[] num = new int[cnt];
            int del = (int)Math.round(cnt*0.15);
            int sum = 0;
            double avg = 0;
            for(int i = 0; i < cnt; i++)
            {
                int temp = Integer.parseInt(br.readLine());
                num[i] = temp;
            }
    
            Arrays.sort(num);
    
            for(int i = del; i < cnt - del; i++)
            {
                sum += num[i];
            }
    
            sum = (int)Math.round((double) sum / (cnt - 2*del)); //반올림 시, double로 변경 후 round 사용
            System.out.println(sum);     
        }
        else
        {
            System.out.println(cnt);
        }
        
    }
}
