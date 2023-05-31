import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        int T = Integer.parseInt(br.readLine());

        for (int i = 0; i < T; i++) {
            StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(stringTokenizer.nextToken());
            int b = Integer.parseInt(stringTokenizer.nextToken());
            System.out.println(getLCM(b, a));
        }
    }

    public static int getLCM(int b, int a) {
        return a * b / getGCM(b, a);
    }

    public static int getGCM(int b, int a) {
        if (b % a == 0) return a;
        return getGCM(a, b % a);
    }
}