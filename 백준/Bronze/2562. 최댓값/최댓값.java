import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        List<int[]> numlist = new ArrayList<>();

        for(int i = 1; i <= 9; i++)
        {
            int number = Integer.parseInt(br.readLine());
            numlist.add(new int[] {number, i});
        }

        numlist.sort((a, b) -> Integer.compare(b[0], a[0]));

        System.out.println(numlist.get(0)[0]);
        System.out.println(numlist.get(0)[1]);
    }
}