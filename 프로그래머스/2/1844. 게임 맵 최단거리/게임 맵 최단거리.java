import java.util.*;
import java.io.*;

class Solution {
    public int solution(int[][] maps) 
    {   
        int rows = maps.length; //행의 개수
        int cols = maps[0].length; //열의 개수
        
        int[][] node = new int[rows][cols];
        int[][] direct = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}}; //4방향 설정
        
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[] {0, 0});
        node[0][0] = 1; //초기값
        
        while(!queue.isEmpty())
        {
            int[] cur = queue.poll();
            int cx = cur[0];
            int cy = cur[1];
            
            if(cx == rows - 1 && cy == cols - 1)
            {
                return node[cx][cy];
            }
            
            for(int i = 0; i < 4; i++)
            {
                int nx = cx + direct[i][0];
                int ny = cy + direct[i][1];
                
                if(nx >= 0 && ny >= 0 && nx < rows && ny < cols && node[nx][ny] == 0 && maps[nx][ny] == 1)
                {
                    node[nx][ny] = node[cx][cy] + 1;
                    queue.add(new int[] {nx, ny});
                }
            }
        }
        
        return -1;
    }
}