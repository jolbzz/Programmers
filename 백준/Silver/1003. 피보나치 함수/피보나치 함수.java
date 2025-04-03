import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < length; i++)
        {
            int temp = Integer.parseInt(br.readLine());
            int[] fibozero = new int[temp + 1];
            int[] fiboone = new int[temp + 1];

            if(temp == 0)
            {
                System.out.println("1 0");
                continue;
            }
            else if(temp == 1)
            {
                System.out.println("0 1");
                continue;
            }
            
            fibozero[0] = 1;
            fiboone[0] = 0;
            fibozero[1] = 0;
            fiboone[1] = 1;

            for(int j = 2; j < temp + 1; j++)
            {
                fibozero[j] = fibozero[j - 1] + fibozero[j - 2]; //0의 호출횟수 저장
                fiboone[j] = fiboone[j - 1] + fiboone[j - 2]; //1의 호출횟수 저장
            }
            
            System.out.println(fibozero[temp] + " " + fiboone[temp]);
        }      
    }
}
