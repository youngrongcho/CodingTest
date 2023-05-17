import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    static int[][] matrix;
    static boolean[][] visited;
    static int[] dx = {0,1,0,-1};
    static int[] dy = {1,0,-1,0};
    static int N,M;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        //입력 값 받기
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        N = Integer.parseInt(stringTokenizer.nextToken());
        M = Integer.parseInt(stringTokenizer.nextToken());

        //초기화
        matrix = new int[N][M];
        visited = new boolean[N][M];

        for(int i=0; i<N; i++){
            stringTokenizer = new StringTokenizer(br.readLine());
            String line = stringTokenizer.nextToken();
            for(int j=0; j<M; j++){
                matrix[i][j] = Integer.parseInt(line.substring(j, j+1));
            }
        }
        BFS(0,0);
        System.out.println(matrix[N-1][M-1]);
    }

    public static void BFS(int x, int y){
        Queue<int[]> queue = new LinkedList<>();
        queue.add(new int[]{x,y});

        while(!queue.isEmpty()){
            int[] now = queue.poll();
            visited[x][y] = true;
            for(int i=0; i<4; i++){
                int X = now[0] + dx[i];
                int Y = now[1] + dy[i];
                if(X >= 0 && Y >= 0 && X < N && Y < M){
                    if(!visited[X][Y] && matrix[X][Y]==1){
                        queue.add(new int[]{X,Y});
                        visited[X][Y] = true;
                        matrix[X][Y] = matrix[now[0]][now[1]] + 1;
                    }
                }
            }
        }
    }
}