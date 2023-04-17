import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        int num = Integer.parseInt(br.readLine()); //String
        String number = br.readLine(); //String

        int sum = 0;

        for (int i = 0; i < num; i++) {
            sum += number.charAt(i)-'0';
        }

        System.out.println(sum);
    }
}