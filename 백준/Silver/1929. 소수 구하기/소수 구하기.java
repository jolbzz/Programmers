import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main { 
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);   
        StringBuilder sb = new StringBuilder();

        for(long i = m; i <= n; i++)
        {
            int sqrt = (int)Math.sqrt(i);
            Boolean flag = true;

            if(i < 2) continue;
            
            for(long j = 2; j <= sqrt; j++)
            {
                if(i%j == 0)
                {
                   flag = false;
                   break;  
                } 
            }

            if(flag == true) sb.append(i + "\n");
        }
        
        bw.write(sb.toString());
        bw.flush();
        bw.close();
    }

}