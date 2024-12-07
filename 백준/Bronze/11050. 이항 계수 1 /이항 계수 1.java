import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        String[] input = br.readLine().split(" ");
        int m = Integer.parseInt(input[0]);
        int n = Integer.parseInt(input[1]);

        System.out.println(binomial(m, n));
    }

    public static int binomial (int m, int n)
    {
        int a = 1;
        int b = 1;
        int c = 1;
        
        for(int i = 1; i <= m; i++)
        {
            a *= i;
        }

        for(int i = 1; i <= n; i++)
        {
            b *= i;
        }

        for(int i = 1; i <= m-n; i++)
        {
            c *= i;
        }

        return a/(b*c);  
    }
}  
