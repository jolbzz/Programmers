import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] num = br.readLine().split(" ");
        int a = Integer.parseInt(num[0]);
        int b = Integer.parseInt(num[1]);
        System.out.println(GCD(a, b));
        System.out.println(a*b/GCD(a, b));    
    }

    public static int GCD(int a, int b)
    {
        int temp = 0;
        while(b != 0)
        {
            temp = b;    
            b = a%b; //나머지를 넣음
            a = temp;
        }    
        return a;
    }
}
