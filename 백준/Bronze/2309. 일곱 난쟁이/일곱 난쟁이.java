import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int sum = 0;
        int[] members = new int[9];
        
        for(int i = 0; i < 9; i++)
        {
            int temp = Integer.parseInt(br.readLine());
            sum += temp; //sum - 가짜난쟁이1 - 가짜난쟁이2 = 100
            members[i] = temp;
        }

        Arrays.sort(members);
        
        for(int i = 0; i < 8; i++)
        {
             for(int j = i + 1; j < 9; j++)
             {
                if(sum - members[i] - members[j] == 100)
                {
                    for(int k = 0; k < 9; k++)
                    {
                        if(k != i && k != j)
                        {
                            System.out.println(members[k]);
                        }
                    }
                    return;
                }
             }   
        }
    }
}