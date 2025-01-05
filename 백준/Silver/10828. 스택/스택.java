import java.io.*;
import java.util.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Stack<Integer> st = new Stack<>();
        int cnt = Integer.parseInt(br.readLine());

        for(int i = 0; i < cnt; i++)
        {
            String[] temp = br.readLine().split(" ");
            switch (temp[0])
            {
                case "push":
                    st.push(Integer.parseInt(temp[1])); 
                    break;
    
                case "pop":
                    if(!st.isEmpty())
                    {
                        int pop = st.pop();
                        bw.write(pop + "\n");
                    }
                    else
                    {
                        bw.write("-1" + "\n");
                    }
                    break;

                case "size":
                    bw.write(st.size() + "\n");
                    break;

                case "empty":
                    if(st.isEmpty())
                    {
                        bw.write("1" + "\n");
                    }
                    else
                    {
                        bw.write("0" + "\n");
                    }
                    break;

                case "top":
                    if(st.isEmpty())
                    {
                        bw.write("-1" + "\n"); 
                    }
                    else
                    {
                        bw.write(st.peek() + "\n");
                    }
                    break;
                    
                default:
                    break;
            }
        }
        bw.flush();
        bw.close();
    }
}