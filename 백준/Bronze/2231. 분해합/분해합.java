import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int ans = Integer.parseInt(br.readLine());
        int sum = 0;
        for(int i = 1; i < ans; i++)
        {
            int temp = i;
            int min = 0;
            //198
            while(temp > 0)
            {
                min += temp%10;
                temp /= 10;
            }

            if(min+i == ans)
            {
                sum = i;
                break;
            }
        }
        System.out.println(sum);
    }
}