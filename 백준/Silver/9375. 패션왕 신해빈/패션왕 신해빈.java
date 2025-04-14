import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int type = Integer.parseInt(br.readLine());
        
        for(int i = 0; i < type; i++) //2종류
        {
            int cnt = Integer.parseInt(br.readLine()); //3종류
            HashMap<String, Integer> clothes = new HashMap<>();   
            int sum = 1;
            for(int j = 0; j < cnt; j++)
            {
                String[] type2 = br.readLine().split(" ");
                clothes.put(type2[1], clothes.getOrDefault(type2[1], 0) + 1);
            }

            for(int value : clothes.values())
            {
                sum *= value + 1;
            }
            
            System.out.println(sum - 1);
        }
    }
}
