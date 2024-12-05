import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        String[] qty = br.readLine().split(" ");
        String[] num = br.readLine().split(" ");
        int n = Integer.parseInt(qty[0]);
        int max = Integer.parseInt(qty[1]);
        int[] i_num = new int[num.length]; 

        //Integer로 변경
        for(int i = 0; i < num.length; i++)
        {
            i_num[i] = Integer.parseInt(num[i]);
        }

        //3가지 카드의 수를 더하는 함수를 돌림
        System.out.println(sum_card(n, max, i_num));
    }

    public static int sum_card(int n, int max, int[] num)
    {
        int ans = 0;
        
        for(int i = 0; i < n; i++)
        {
            for(int j = i+1; j < n; j++)
            {
                 for(int k = j+1; k < n; k++)
                 {
                    //현재 카드의 합산
                    int current = num[i] + num[j] + num[k];
                    //현재 합산이 최대치보다 작거나 같고,
                    //최대치에 가장 가까운 경우 
                    if(current <= max && current >= ans)
                    {
                        ans = current;
                    }
                 }
            }
        }
        
        return ans;    
    }
}