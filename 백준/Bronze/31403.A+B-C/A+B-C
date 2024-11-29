import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
        
        String num1 = br.readLine();
        String num2 = br.readLine();
        String num3 = br.readLine();

        int ans1 = Integer.parseInt(num1) + Integer.parseInt(num2) - Integer.parseInt(num3);
        int ans2 = Integer.parseInt(num1+num2) - Integer.parseInt(num3);

        bw.write(String.valueOf(ans1));
        bw.newLine();
        bw.write(String.valueOf(ans2));

        br.close();
        bw.close();
        
    }
}
