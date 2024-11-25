import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        Long answer = 0L;
        
        for(int i= 0; i < a.length; i++)
        {
            answer += Long.parseLong(a[i]);
        }
        
        System.out.println(answer);
    }
}