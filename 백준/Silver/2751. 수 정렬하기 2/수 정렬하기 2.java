import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        TreeSet<Integer> set = new TreeSet<>();
        int length = Integer.parseInt(br.readLine());

        for(int i = 0; i < length; i++)
        {
            set.add(Integer.parseInt(br.readLine()));
        }
        
        for(int ans : set)
        {
            bw.write(ans + "\n");
        }
        
        bw.flush();
        bw.close();
    }
}