import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < cnt; i++)
        {
            String temp = br.readLine();
            int score = 0;
            int sum = 0;
            for(int j = 0; j < temp.length(); j++)
            {
                char ox = temp.charAt(j);
                if(ox == 'O')
                {
                    score++;
                    sum += score;
                }
                else
                {
                    score = 0;    
                }
            }

            System.out.println(sum);
        }
        
    }
}