import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = -1;
        Stack<Character> a = new Stack<>();
        
        for(char c : s.toCharArray())
        {
            if(!a.isEmpty() && a.peek() == c)
            {
                a.pop();
            }
            else
            {
                a.push(c);
            }
        }

        return a.isEmpty() == true? 1 : 0;
    }
}