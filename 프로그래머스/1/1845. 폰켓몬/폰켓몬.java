import java.util.*;

class Solution 
{
    public int solution(int[] nums) 
    {
        int answer = 0;
        HashSet<Integer> ponketmon = new HashSet<Integer>();
        
        for(int i = 0; i < nums.length; i++)
        {
            ponketmon.add(nums[i]);
        }

        answer = ponketmon.size() > nums.length/2 ? nums.length/2 : ponketmon.size();
        return answer;
    }
}