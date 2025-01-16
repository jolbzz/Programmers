import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();
        while(true)
        {
            String input = br.readLine();
            int length = input.length();
            boolean flag = true;
            if(input.equals("0"))
            {
                break;    
            }

            for(int i = 0; i < length / 2; i++)
            {
                if(input.charAt(i) != input.charAt(length - 1 - i))
                {
                    flag = false;    
                }
            }

            sb.append(flag ? "yes" : "no").append("\n");
        }

        System.out.print(sb);
    }
}