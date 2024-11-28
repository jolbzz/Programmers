import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int length = Integer.parseInt(br.readLine()); //별의 개수

        for(int i = 1; i <= length; i++)
        {
            bw.write(String.format("%" + length + "s",  "*".repeat(i)));
            bw.newLine();
        }
        br.close();
        bw.close();
    }
}