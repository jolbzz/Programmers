import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    { 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int r = 31;
        int M = 1234567891;
        int rr = 1;
        String temp = br.readLine();
        int answer = 0;
        
        for(int i = 0; i < length; i++)
        {
            int value = temp.charAt(i) - 96;
            answer = (answer + value * rr) % M;
            rr = (r * rr) % M;
        }
        System.out.println(answer);
    }
}