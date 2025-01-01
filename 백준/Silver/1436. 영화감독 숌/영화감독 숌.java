 import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int count = Integer.parseInt(br.readLine());
        System.out.println(answer(count, 0));
    }

    public static int answer(int count, int temp)
    {
        int start = 666;
        while(count > 0)
        {
            if(String.valueOf(start).contains("666"))
            {
                temp++;
            }    
            
            if(count == temp)
            {
                break;
            }
            start++;    
        }

        return start;
    }
}