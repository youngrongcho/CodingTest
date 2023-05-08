import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        long n = Long.parseLong(br.readLine());

        int count = 1;
        int sum = 1;
        int startIdx = 1;
        int endIdx = 1;

        while(endIdx!=n){
            if(sum==n) {
                count++;
                endIdx++;
                sum += endIdx;
            }
            else if(sum > n){
                sum -= startIdx;
                startIdx++;
            }
            else if(sum < n){
                endIdx++;
                sum += endIdx;
            }
        }
        System.out.println(count);
    }
}