import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int cnt = Integer.parseInt(br.readLine());
        String[] ans = new String[cnt];
        
        for(int i = 0; i < cnt; i++)
        {
            Stack<Character> st = new Stack<>();
            String temp = br.readLine(); //총 6개의 케이스 별 YES OR NO
            for(int j = 0; j < temp.length(); j++)
            {
                char ch = temp.charAt(j);
                if(ch == '(')
                {
                   st.push(ch);   
                }
                else
                {
                    if(st.isEmpty()) //비어있으면 안됨
                    {
                        st.push(ch); //더미 값 추가
                        break;
                    }
                    else
                    {
                        st.pop();
                    }
                }
            }
            
            if(st.isEmpty())
            {
                ans[i] = "YES";
            }
            else
            {
                ans[i] = "NO";
            }
        }

        for(String result : ans)
        {
            System.out.println(result);
        }
    }
}