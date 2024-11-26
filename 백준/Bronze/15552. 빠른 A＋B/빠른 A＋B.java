import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter (System.out));
        Integer length = Integer.parseInt(br.readLine());
        for(int i = 0; i < length; i++)
        {
            String[] a = br.readLine().split(" ");
            Integer num1 = Integer.parseInt(a[0]);
            Integer num2 = Integer.parseInt(a[1]);
            bw.write(String.valueOf(num1 + num2));
            bw.newLine();
        }

        bw.close();
        br.close();
    }
}