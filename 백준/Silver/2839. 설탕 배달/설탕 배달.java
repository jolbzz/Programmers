import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int total = Integer.parseInt(br.readLine());
        
        int min = -1;
        for(int i = total/5; i >= 0; i--)
        {
            int temp = total - (i*5);
            if(temp%3 == 0)
            {
                min = i + (temp/3);
                break; //최소일때 탈출
            }
        }
        
        System.out.println(min);  
    }

}