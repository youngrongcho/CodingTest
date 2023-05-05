import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        //숫자 개수와 연산 횟수 받기
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int m = Integer.parseInt(stringTokenizer.nextToken());
        int n = Integer.parseInt(stringTokenizer.nextToken());

        //합 배열 만들기
        long[] sum = new long[m+1];
        stringTokenizer = new StringTokenizer(br.readLine());
        for(int i=1; i<=m; i++){
            sum[i] = sum[i-1] + Integer.parseInt(stringTokenizer.nextToken());
        }

        //범위 받고 결과 출력하기
        long[] answers = new long[n];

        for(int i=0; i<n; i++){
            stringTokenizer = new StringTokenizer(br.readLine());
            int s = Integer.parseInt(stringTokenizer.nextToken());
            int e = Integer.parseInt(stringTokenizer.nextToken());
            answers[i] = sum[e] - sum[s-1];
        }
        
        for(long a : answers){
            System.out.println(a);
        }
    }
}