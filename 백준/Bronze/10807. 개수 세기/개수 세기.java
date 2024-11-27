import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        Integer length = Integer.parseInt(br.readLine()); //배열의 길이
        String[] a = br.readLine().split(" "); //공백 기준으로 값을 받아옴
        Integer num = Integer.parseInt(br.readLine()); //찾아야 하는 수
        
        Integer answer = 0;
        for(int i = 0; i < length; i++)
        {
            if(Integer.parseInt(a[i]) == num)
            {
                answer++;
            }
        }
        
        System.out.println(answer.toString());
        br.close();
        
    }
}