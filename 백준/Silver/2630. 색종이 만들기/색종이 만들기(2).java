import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    public static int[][] square;
    public static int len;
    public static int white = 0;
    public static int blue = 0;
    
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        len = Integer.parseInt(br.readLine());
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

        System.out.println(white);
        System.out.println(blue);
    }

    public static boolean square_check(int x, int y, int size)
    {
        int color_check = square[x][y]; //현재 위치의 색상
        
        for(int i = x; i < x + size; i++)
        {
            for(int j = y; j < y + size; j++)
            {
                if(color_check != square[i][j]) return false; //다른 색이 나오면 더 나눠야함.
            }
        }
        
        return true;
    }

    public static void square_divide(int x, int y, int size)
    {
        int color_check = square[x][y];
        
        if(size == 1)
        {
            if(color_check == 0) white++;
            else blue++;
            return;
        }
        else
        {
            if(square_check(x, y, size))
            {
                if(color_check == 0) white++;
                else blue++;
                return;
            }
        }

        int new_size = size/2;
        square_divide(x, y, new_size);
        square_divide(x+new_size, y, new_size);
        square_divide(x, y+new_size, new_size);
        square_divide(x+new_size, y+new_size, new_size);
        
        return;
    }
}
