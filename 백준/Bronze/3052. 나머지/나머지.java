import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> ans = new HashSet<>();
        
        for(int i = 0; i < 10; i++)
        {
            int temp;
            temp = Integer.parseInt(br.readLine())%42;    
            ans.add(temp);
        }

        System.out.println(ans.size());
    }
}