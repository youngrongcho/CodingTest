import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        long a = Long.parseLong(stringTokenizer.nextToken());
        long b = Long.parseLong(stringTokenizer.nextToken());

        long gcm = getGCM(b, a);

        BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(System.out));
        while (gcm > 0) {
            bufferedWriter.write("1");
            gcm--;
        }
        bufferedWriter.flush();
        bufferedWriter.close();
    }

    public static long getGCM(long b, long a) {
        if (b % a == 0) return a;
        return getGCM(a, b % a);
    }
}