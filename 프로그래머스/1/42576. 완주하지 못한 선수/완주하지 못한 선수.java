import java.util.*;
class Solution {
    public String solution(String[] participant, String[] completion) 
    {
        HashMap<String, Integer> part_hash = new HashMap<>();
        
        for(int i = 0; i < participant.length; i++)
        {
            part_hash.put(participant[i], part_hash.getOrDefault(participant[i], 0) + 1);
        }
        
        for(String name : completion)
        {
            if(part_hash.containsKey(name) == true)
            {
                part_hash.put(name, part_hash.getOrDefault(name, 0) - 1);
            }
        }

        for(Map.Entry<String, Integer> entry : part_hash.entrySet())
        {
            if(entry.getValue() > 0)
            {
                return entry.getKey();    
            }
        }
            
        return "";
    }
}