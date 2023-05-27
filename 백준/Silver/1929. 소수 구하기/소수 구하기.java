import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int M = Integer.parseInt(stringTokenizer.nextToken());
        int N = Integer.parseInt(stringTokenizer.nextToken());

        for (int i = M; i <= N; i++) {
            if (isPrime(i)) System.out.println(i);
        }
    }

    public static boolean isPrime(int num) {
        if(num==1) return false;
        if(num>3){
            for (int i = 2; i <=Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
        }
        return true;
    }
}