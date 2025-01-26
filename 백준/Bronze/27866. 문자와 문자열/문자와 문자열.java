import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String temp = br.readLine();
        int seq = Integer.parseInt(br.readLine());
        System.out.println(temp.charAt(seq - 1));
    }
}