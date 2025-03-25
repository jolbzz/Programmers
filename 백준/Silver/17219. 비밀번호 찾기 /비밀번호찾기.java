import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] length = br.readLine().split(" ");
        int address = Integer.parseInt(length[0]); //16개의 사이트 주소
        int find = Integer.parseInt(length[1]); //4개의 찾을 사이트
        HashMap<String, String> id = new HashMap<>();
        
        for(int i = 0; i < address; i++)
        {
            String[] temp = br.readLine().split(" ");
            id.put(temp[0], temp[1]);
        }

        for(int i = 0; i < find; i++)
        {
            String temp = br.readLine();
            System.out.println(id.get(temp));
        }
    }
}
