import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < total; i++)
        {
            StringBuilder sb = new StringBuilder();
            String[] temp = br.readLine().split(" ");
            int repeat = Integer.parseInt(temp[0]);
            String p = temp[1];
            
            for(int j = 0; j < p.length(); j++)
            {
                for(int k = 0; k < repeat; k++)
                {
                    sb.append(p.charAt(j));
                }
            }

            System.out.println(sb.toString());
        }
    }
}