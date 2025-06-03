import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] wood = br.readLine().split(" ");
        int cnt = Integer.parseInt(wood[0]); //4
        int len = Integer.parseInt(wood[1]); //7

        String[] wood_height = br.readLine().split(" ");
        int[] i_height = new int[cnt];
        //나무 수만큼 반복
        for(int i = 0; i < cnt; i++)
        {
           i_height[i] = Integer.parseInt(wood_height[i]);
        }
        
        Arrays.sort(i_height);
        //Arrays.sort(i_height, Collections.reverseOrder()); 이건 내림차순

        int left = 0; //최소
        int right = i_height[cnt - 1]; //최대

        while(left <= right) //똑같아질때까지
        {
            int mid = (left + right) / 2; //중간값으로 검사
            long sum = 0; //가져갈 나무길이의 총 합. 최소 7 이상이어야 한다.
            for(int i = 0; i < cnt; i++)
            {
                if(i_height[i] - mid > 0) //양수값이어야 남는 길이 존재함.
                {
                    sum += i_height[i] - mid;
                }
            }

            if(sum >= len) //합계가 최소보다 클 때
            {
                left = mid + 1;
            }
            else
            {
                right = mid - 1;  
            }
        }

        System.out.println(right);

        
    }
}