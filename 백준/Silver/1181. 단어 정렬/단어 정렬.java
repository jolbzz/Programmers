import java.util.*;
import java.util.stream.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        List<String> list = new LinkedList<>();
        int length = Integer.parseInt(br.readLine());

        for(int i = 0; i < length; i++)
        {
            list.add(br.readLine());
        }

        list = list.stream()
                   .sorted()
                   .sorted((a, b) -> Integer.compare(a.length(), b.length()))
                   .distinct()
                   .collect(Collectors.toList());
        
        for(String item : list)
        {
            bw.write(item + "\n");
        }

        bw.flush();
        bw.close();
        //System.out.println("Hello world!");
    }
}