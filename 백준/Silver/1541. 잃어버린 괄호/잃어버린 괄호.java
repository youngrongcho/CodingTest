import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        String[] str = br.readLine().split("-");
        int answer = 0;
        for (int i = 0; i < str.length; i++) {
            int temp = mySum(str[i]);
            if (i == 0) {
                answer += temp;
            } else {
                answer -= temp;
            }
        }
        System.out.println(answer);
    }

    public static int mySum(String s) {
        int sum = 0;
        String[] arr = s.split("[+]");
        for (String a : arr) {
            sum += Integer.parseInt(a);
        }
        return sum;
    }
}