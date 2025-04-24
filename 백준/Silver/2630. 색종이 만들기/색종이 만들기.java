import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int[][] square;
    public static int whitecnt = 0;
    public static int bluecnt = 0;
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int len = Integer.parseInt(br.readLine());
        square = new int[len][len];

        //값 입력
        for(int i = 0; i < len; i++)
        {
            String[] temp = br.readLine().split(" ");
            for(int j = 0; j < len; j++)
            {
                square[i][j] = Integer.parseInt(temp[j]);
            }
        }

        square_divide(0, 0, len);
            
        System.out.println(whitecnt);
        System.out.println(bluecnt);    
    }

    public static boolean check_square(int x, int y, int size)
    {
        int color_check = square[x][y]; //현재 color
        for(int i = x; i < x + size; i++)
        {
            for(int j = y; j < y + size; j++)
            {
                if(square[i][j] != color_check) return false; //색이 다르면 더 잘라야함
            }
        }

        return true; //다 잘린 색종이
    }

    public static void square_divide(int x, int y, int size)
    {    
        int new_size = 0;
        //사이즈가 1인 경우는 검사 필요 없음
        if(size == 1)
        {
            if(square[x][y] == 0) whitecnt++;
            else bluecnt++;
            return;   
        }
        else
        {
            if(check_square(x, y, size)) 
            {
                if(square[x][y] == 0) whitecnt++;
                else bluecnt++;
                return;
            }
        }

        new_size = size / 2;
        square_divide(x, y, new_size); //8크기
        square_divide(x, y + new_size, new_size);
        square_divide(x + new_size, y, new_size);
        square_divide(x + new_size, y + new_size, new_size);
    }
}
