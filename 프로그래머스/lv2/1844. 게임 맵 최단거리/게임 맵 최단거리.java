import java.util.*;

class Solution {
    static int[][] A;
    static boolean[][] visited;
    static int[] dx = {0, 1, 0, -1};
    static int[] dy = {1, 0, -1, 0};
    static int n, m;
    
    public int solution(int[][] maps) {
        //초기화
        A = maps;
        n = maps.length;
        m = maps[0].length;
        visited = new boolean[n][m]; 
        
        BFS(0,0);
        
        return A[n-1][m-1]==1 ? -1 : A[n-1][m-1];
    }
    public static void BFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});
        visited[x][y] = true;
        
        while(!queue.isEmpty()){
            int[] now = queue.poll();
            for(int i=0; i<4; i++){
                int X = now[0] + dx[i];
                int Y = now[1] + dy[i];
                if(X >= 0 && Y >= 0 && X < n && Y < m){
                    if(!visited[X][Y] && A[X][Y]==1){
                        queue.add(new int[]{X,Y});
                        visited[X][Y] = true;
                        A[X][Y] = A[now[0]][now[1]] + 1;
                    }
                }
            }
        }
    }
}