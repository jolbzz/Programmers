import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        int[] num = new int[total];
        String[] temp = br.readLine().split(" ");
        int sum = 0;
        int current = 0;
        for(int i = 0; i < total; i++)
        {
            num[i] = Integer.parseInt(temp[i]);
        }

        Arrays.sort(num);

        for(int i = 0; i < total; i++)
        {
            current += num[i]; //누적 합
            sum += current;
        }

        System.out.println(sum);
    }
}