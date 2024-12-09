import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        String[] ori = br.readLine().split(" ");
        int max = 0;
        double sum = 0;
        for(int i = 0; i < length; i++)
        {
            max = Math.max(max, Integer.parseInt(ori[i]));
        }

        for(int i = 0; i < length; i++)
        {
            sum += ((Double.parseDouble(ori[i]) / max) * 100);
        }
        
        System.out.println((double) sum / length);
    }
}