import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] snail = br.readLine().split(" ");
        int A = Integer.parseInt(snail[0]);
        int B = Integer.parseInt(snail[1]);
        int V = Integer.parseInt(snail[2]);

        int cnt = (V - B - 1) / (A - B) + 1;

        System.out.println(cnt);
        
    }
}