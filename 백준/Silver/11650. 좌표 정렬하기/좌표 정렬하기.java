import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<int[]> list = new ArrayList<>();
        int count = Integer.parseInt(br.readLine());

        for(int i = 0; i < count; i++)
        {
            String[] xy = br.readLine().split(" ");
            int x = Integer.parseInt(xy[0]);
            int y = Integer.parseInt(xy[1]);
            list.add(new int[] {x, y});
        }

        //(x, y) 를 정렬하는 방법
        //(a[0], a[1]) (b[0], b[1])
        list.sort((a, b) -> 
                   { 
                     if(a[0] == b[0]) return Integer.compare(a[1], b[1]); //첫 번째 x좌표와 다음 x좌표가 같으면 첫 번째 y좌표와 다음 y좌표 비교
                                      return Integer.compare(a[0], b[0]);
                   }
                 );
        
        for(int[] answer : list)
        {
            System.out.println(answer[0] + " " + answer[1]);
        }
    }
}