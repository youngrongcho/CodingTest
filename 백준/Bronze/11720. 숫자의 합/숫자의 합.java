import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int first = Integer.parseInt(br.readLine());

        int sum = 0;

        String second = br.readLine();

        for(int i = 0; i < first; i++) {
            sum += Integer.parseInt(second.substring(i, i + 1));
        }

        System.out.println(sum);
    }
}