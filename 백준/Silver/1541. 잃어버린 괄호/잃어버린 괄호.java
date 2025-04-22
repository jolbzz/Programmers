import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split("-"); // 55 50+40
        int len = temp.length;
        
        int ans = 0;
        for(int i = 0; i < len; i++)
        {
            String[] cal = temp[i].split("\\+");
            int num = cal.length;
            
            int sum = 0;
            
            for(int j = 0; j < num; j++)
            {
               sum += Integer.parseInt(cal[j]); 
            }

            if(i == 0) ans += sum;
            else ans -=sum;
        }
        
        System.out.println(ans);
    }
}
