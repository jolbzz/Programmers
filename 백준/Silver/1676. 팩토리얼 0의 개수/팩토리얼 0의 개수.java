import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int length = Integer.parseInt(br.readLine());
        int count = 0;
        
        for(int i = 5; i <= length; i *= 5)
        {
            count += length/i;    
        }

        System.out.println(count);
        
    }
}