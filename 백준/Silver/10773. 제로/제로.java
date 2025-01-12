import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        
        for(int i = 0; i < cnt; i++)
        {
            int temp = Integer.parseInt(br.readLine());
            if(temp > 0)
            {
                st.push(temp);
            }
            else
            {
                if(st.isEmpty() == false)
                {
                    st.pop();    
                }
            }
        }

        for(int num : st)
        {
            sum += num;
        }

        System.out.println(sum);
    }
}