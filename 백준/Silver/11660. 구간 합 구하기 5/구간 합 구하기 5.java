import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        //표 크기, 계산 횟수 받기
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(stringTokenizer.nextToken());
        int m = Integer.parseInt(stringTokenizer.nextToken());

        //이차원 배열 만들기
        int[][] matrix = new int[n+1][n+1];
        for(int i=1; i<=n; i++){
            stringTokenizer = new StringTokenizer(br.readLine());
            for(int j=1; j<=n; j++){
                matrix[i][j] = Integer.parseInt(stringTokenizer.nextToken());
            }
        }

        //합 배열 만들기 for 구간 합
        int[][] sum = new int[n+1][n+1];
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                sum[i][j] = sum[i][j-1] + sum[i-1][j] - sum[i-1][j-1] + matrix[i][j];
            }
        }

        //정답 배열 만들기
        int[] answer = new int[m];

        for(int i=0; i<m; i++){
            stringTokenizer = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(stringTokenizer.nextToken());
            int y1 = Integer.parseInt(stringTokenizer.nextToken());
            int x2 = Integer.parseInt(stringTokenizer.nextToken());
            int y2 = Integer.parseInt(stringTokenizer.nextToken());
            answer[i] = sum[x2][y2] - sum[x1-1][y2] - sum[x2][y1-1] + sum[x1-1][y1-1];
        }

        for(int a : answer){
            System.out.println(a);
        }
    }
}