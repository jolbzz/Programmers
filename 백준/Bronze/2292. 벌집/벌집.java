import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = 1;
        int sum = 1;
        int arrive = Integer.parseInt(br.readLine());

        //1 + 6 + 12 + 18 + ...
        while(sum < arrive)
        {
            sum += 6 * cnt;
            cnt++;
        }

        System.out.println(cnt);
    }
}