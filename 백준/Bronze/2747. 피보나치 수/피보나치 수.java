import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        //입력 값을 받는다.
        int n = Integer.parseInt(br.readLine());

        //문제를 쪼갠 후 값을 넣을 메모이제이션용 DP 테이블을 만든다.
        int[] dp = new int[n+1];

        //피보나치 수열에서 f(n) = f(n-1) + f(n-2)
        //처음 0과 1의 경우를 초기화한다.
        dp[0] = 0;
        dp[1] = 1;

        //각각의 값을 구해서 테이블에 값을 넣는다. 바텀업 방식
        for(int i=2; i<=n; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }

        System.out.println(dp[n]);
    }
}