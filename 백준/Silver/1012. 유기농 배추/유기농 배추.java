import java.util.*;
import java.lang.*;
import java.io.*;

// The main method must be in a class named "Main".
class Main {
    static int[] dx = {-1, 1, 0, 0};
    static int[] dy = {0, 0, -1, 1};
    static int[][] value;
    static boolean[][] visited;
    static int width;
    static int height;
    public static void main(String[] args) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int test = Integer.parseInt(br.readLine()); //테스트 케이스의 수

        for(int z = 0; z < test; z++)
        {
            String[] temp = br.readLine().split(" "); //가로 세로 배추의 수
            width = Integer.parseInt(temp[0]);
            height = Integer.parseInt(temp[1]);
            int cnt = Integer.parseInt(temp[2]);
     
            value = new int[width][height];
            visited = new boolean[width][height];
    
            int answer = 0; //답
            //맵을 채워줌
            for(int i = 0; i < cnt; i++)
            {
                temp = br.readLine().split(" ");
                int x = Integer.parseInt(temp[0]);
                int y = Integer.parseInt(temp[1]);
    
                value[x][y] = 1;
            }
    
            for(int i = 0; i < width; i++)
            {
                for(int j = 0; j < height; j++)    
                {
                    if(visited[i][j] != true && value[i][j] == 1) //방문한 적도 없고 좌표값이 1인 곳만   
                    {
                        bfs(i, j);
                        answer++;
                    }
                }
            } 

            System.out.println(answer);
        }
        
    }

    public static void bfs(int x, int y)
    {
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x, y});
        visited[x][y] = true;
        
        while(!queue.isEmpty())
        {
            int[] temp = queue.poll();
            int cx = temp[0];
            int cy = temp[1];
            for(int i = 0; i < 4; i++)
            {
                int nx = cx + dx[i];
                int ny = cy + dy[i];

                if(nx >= 0 && nx < width && ny >= 0 && ny < height && visited[nx][ny] != true && value[nx][ny] == 1)
                {
                    visited[nx][ny] = true;
                    queue.add(new int[]{nx, ny});
                }
            }
        }
    }
}