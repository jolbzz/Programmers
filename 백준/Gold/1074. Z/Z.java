import java.util.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    //1074 Z
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] temp = br.readLine().split(" ");
        int size = Integer.parseInt(temp[0]);
        int x = Integer.parseInt(temp[1]);
        int y = Integer.parseInt(temp[2]);
        int len = (int)Math.pow(2, size);

        System.out.println(match(y, x, len));
    }

    public static int match(int x, int y, int size)
    {
        if(size == 1) return 0;
        else
        {
            int half = size / 2; //8 -> 4
            if(x < half && y < half) return match(x, y, half); //섹션 1
            if(x >= half && y < half) return half * half + match(x - half, y, half); //섹션 2에서는 섹션 1 좌표를 더해줌
            if(x < half && y >= half) return 2 * half * half + match(x, y - half, half); //섹션 3에서는 3번째 이므로 2번 더해줌
            return 3 * half * half + match(x - half, y - half, half); //1, 1
        }
    }
}
