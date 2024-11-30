import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
        String[] time = br.readLine().split(" ");
        int hr = Integer.parseInt(time[0]);
        int min = Integer.parseInt(time[1]);

        if(min >= 45)
        {
            bw.write(String.valueOf(hr) + " " + String.valueOf(min-45));
        }
        else
        {
            if(hr == 0)
            {
                hr = 24;
            }
            bw.write(String.valueOf(hr-1) + " " + String.valueOf(60-45+min));
        }
        
        br.close();
        bw.close();
    }
}