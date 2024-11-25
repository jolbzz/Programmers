import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] a = br.readLine().split(" ");
        int a1 = Integer.parseInt(a[0]);
        int a2 = Integer.parseInt(a[1]);
        System.out.println(a1 + a2);
        System.out.println(a1 - a2);
        System.out.println(a1 * a2);
        System.out.println(a1 / a2);
        System.out.println(a1 % a2);
    }
}