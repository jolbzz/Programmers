import java.util.*;

public class Solution {
    public int[] solution(int []arr) 
    {
        Stack<Integer> num = new Stack<>();
        
        num.push(arr[0]); //초기값 설정
        for(int i = 1; i < arr.length; i++)
        {
            if(!num.isEmpty())
            {
                if(arr[i - 1] != arr[i])
                {
                    num.push(arr[i]);   
                }
            }
        }
        
        int[] answer = new int[num.size()];
        for (int i = answer.length - 1; i >= 0; i--) { // Stack은 후입선출(LIFO)이므로 역순으로 저장
            answer[i] = num.pop();
        }
        return answer;
    }
}