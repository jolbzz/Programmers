import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashMap<Integer, Integer> card1 = new HashMap<>(); //상근이가 가진 카드 종류
        int cnt1 = Integer.parseInt(br.readLine()); //상근이가 가진 숫자 카드의 수
        String[] temp = br.readLine().split(" "); //상근이가 가진 카드에 적힌 수
        StringBuilder sb = new StringBuilder();
        
        for(int i = 0; i < cnt1; i++)
        {   
            int num = Integer.parseInt(temp[i]);
            card1.put(num, card1.getOrDefault(num, 0) + 1);
        }

        int cnt2 = Integer.parseInt(br.readLine()); //숫자 카드의 수
        String[] temp2 = br.readLine().split(" "); //숫자 카드에 적힌 수
        for(int i = 0; i < cnt2; i++)
        {
            int num2 = Integer.parseInt(temp2[i]);
            if(card1.containsKey(num2)) //갖고있는 카드인 경우
            {
                sb.append(card1.get(num2) +  " ");
            }
            else
            {
                sb.append("0" + " ");
            }
        }

        System.out.print(sb.toString());
    }
}