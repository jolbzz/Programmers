import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        int[][] spec = new int[cnt][2];
        int[] rank = new int[cnt];

        for(int i = 0; i < cnt; i++)
        {
          String[] temp = br.readLine().split(" ");
          spec[i][0] = Integer.parseInt(temp[0]);
          spec[i][1] = Integer.parseInt(temp[1]);      
        }
        
        for(int i = 0; i < cnt; i++)
        {
            rank[i] = 1;
            for(int j = 0; j < cnt; j++)
            {
                if(spec[i][0] < spec[j][0] && spec[i][1] < spec[j][1])
                {
                    rank[i]++;
                }
            }    
        }

        for(int answer : rank)
        {
            System.out.print(answer + " ");
        }
    }
}