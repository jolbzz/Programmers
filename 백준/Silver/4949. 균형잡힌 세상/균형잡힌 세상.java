import java.util.*;
import java.io.*;

class Main {
    public static void main(String[] args) throws IOException 
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        while (true) 
        {
            String line = br.readLine();

            // 종료 조건
            if (line.equals(".")) break;

            Stack<Character> st = new Stack<>();
            boolean b_del = true;

            for (char c : line.toCharArray()) 
            {
                if (c == '(' || c == '[') 
                {
                    st.push(c);
                } 
                else if (c == ')' || c == ']') 
                {
                    //스택이 비거나 짝이 안 맞는 경우
                    if (st.isEmpty() || (c == ')' && st.peek() != '(') || (c == ']' && st.peek() != '[')) 
                    {
                        b_del = false;
                        break;
                    }
                    st.pop(); 
                }
            }

            if (!st.isEmpty()) 
            {
                b_del = false;
            }

            sb.append(b_del ? "yes\n" : "no\n");
        }
        System.out.print(sb.toString());
    }
}
