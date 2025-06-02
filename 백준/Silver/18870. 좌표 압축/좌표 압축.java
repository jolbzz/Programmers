import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String[] temp = br.readLine().split(" ");
        int[] list = new int[cnt];
        HashMap<Integer, Integer> map = new HashMap<>();
        TreeSet<Integer> tree = new TreeSet<>();

        StringBuilder sb = new StringBuilder();

        //값을 넣어줌
        for(int i = 0; i < cnt; i++)
        {
            list[i] = Integer.parseInt(temp[i]);
            tree.add(list[i]);
        }

        //999, 0 1000, 1 저장
        int index = 0;
        for(int a : tree)
        {
            map.put(a, index++);
        }

        for(int ans : list)
        {
            sb.append(map.get(ans) + " "); 
        }

        System.out.print(sb);
    }
}
