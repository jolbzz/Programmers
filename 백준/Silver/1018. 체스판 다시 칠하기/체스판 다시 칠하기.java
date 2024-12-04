import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader (System.in));
        String[] size = br.readLine().split(" ");
        int height = Integer.parseInt(size[0]);
        int length = Integer.parseInt(size[1]);
        int ans = 64; //최대로 칠했을 때가 63개라서
        char[][] chess = new char[height][length];

        //체스판 칠하기
        for(int i = 0; i < height; i++)
        {
            String line = br.readLine();
            for(int j = 0; j < length; j++)
            {
                chess[i][j] = line.charAt(j);
            }
        }

        for(int i = 0; i <= height - 8; i++)
        {
            for(int j = 0; j <= length - 8; j++)
            {
                ans = Math.min(ans, Math.min(Colorcount('W', i, j, chess), Colorcount('B', i, j, chess)));
            }
        }
        System.out.println(ans);
    }

    public static int Colorcount (char color, int height, int length, char[][] chess)
    {
        int cnt = 0;
        
        for(int i = height; i < height + 8; i++)
        {
            for(int j = length; j < length + 8; j++)
            {
                //짝수
                if((i+j) % 2 == 0)
                {
                    //다시 칠해야 하는 경우
                    if(chess[i][j] != color)
                    {
                        cnt++;
                    }
                }
                //홀수
                else
                {
                    if(chess[i][j] == color)
                    {
                        cnt++;
                    }
                }
            }
        }
        return cnt;    
    }
}