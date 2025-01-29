import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int count = Integer.parseInt(br.readLine());
        HashSet<Integer> hash = new HashSet<>();

        while(count != 0)
        {
            String[] temp = br.readLine().split(" ");
            int num = 0;
            if(!temp[0].equals("all") && !temp[0].equals("empty"))
            {
                num = Integer.parseInt(temp[1]);
            }
            switch(temp[0])
            {
                case "add":
                    hash.add(num);
                    break;
                case "remove":
                    hash.remove(num);
                    break;
                case "check":
                    bw.write(hash.contains(num) ? "1\n" : "0\n");
                    break;
                case "toggle":
                    if(hash.contains(num))
                    {
                        hash.remove(num);
                    } 
                    else 
                    {
                        hash.add(num);
                    }
                    break;
                case "all":
                    hash.clear();
                    for (int i = 1; i <= 20; i++) 
                    {
                        hash.add(i);
                    }
                    break;
                case "empty":
                    hash.clear();
                    break;
                default:
                    break;     
            }
            count--;   
        }

        bw.flush();
        bw.close();
    }
}