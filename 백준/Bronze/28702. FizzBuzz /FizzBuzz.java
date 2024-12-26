import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int next = 0;
        for(int i = 0; i < 3; i++)
        {
            String fb = br.readLine();
            if(!fb.equals("Fizz") && !fb.equals("Buzz") && !fb.equals("FizzBuzz"))
            {
                next = Integer.parseInt(fb) + (3 - i);
            }
        }

        if (next % 3 == 0 && next % 5 == 0)
        { 
            System.out.println("FizzBuzz"); 
        } 
        else if (next % 3 == 0)
        {
            System.out.println("Fizz"); 
        } 
        else if (next % 5 == 0) 
        { 
            System.out.println("Buzz"); 
        } 
        else 
        {
            System.out.println(next);
        }
    }
}
