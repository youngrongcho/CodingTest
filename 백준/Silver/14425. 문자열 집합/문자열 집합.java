import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());
        int M = Integer.parseInt(stringTokenizer.nextToken());

        ArrayList<String> list = new ArrayList<>();
        for(int i=0; i<N; i++){
            list.add(br.readLine());
        }

        int count = 0;
        for(int i=0; i<M; i++){
            String s = br.readLine();
            if(list.contains(s)) count++;
        }
        System.out.println(count);
    }
}