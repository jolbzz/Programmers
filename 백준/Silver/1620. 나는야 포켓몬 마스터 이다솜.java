import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int pocket_qty = Integer.parseInt(temp[0]);
        int quest = Integer.parseInt(temp[1]);
        
        Map<String, Integer> pocket = new HashMap<String, Integer>(); //인덱스 저장
        String[] pocket_num = new String[pocket_qty + 1]; //Key 저장
        for(int i = 0; i < pocket_qty; i++)
        {
            String pocketmon = br.readLine();
            pocket.put(pocketmon, i + 1); //인덱스 저장
            pocket_num[i + 1] = pocketmon; //Key 저장
        }

        for(int i = 0; i < quest; i++)
        {
            String answer = br.readLine();
            
            if(pocket.containsKey(answer)) //Key로 검색
            {
                System.out.println(pocket.get(answer));
            }
            else if(Character.isDigit(answer.charAt(0))) //Value로 검색 isDigit 함수 쓰는게 시간 단축에 매우 중요함.
            {
                System.out.println(pocket_num[Integer.parseInt(answer)]);
            }
        }
    }
}
