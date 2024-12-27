import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        List<int[]> list = new ArrayList<>();
        
        for(int i = 0; i < length; i++)
        {
            String[] xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            list.add(new int[] {x, y});
        }

        list.sort((a, b) ->
                    {
                        if(a[1] == b[1]) return Integer.compare(a[0], b[0]); //x좌표
                        else return Integer.compare(a[1], b[1]); //y좌표
                    }
                 );

        for(int[] ans : list)
        {
            System.out.println(ans[0] + " " + ans[1]);
        }
    }
}