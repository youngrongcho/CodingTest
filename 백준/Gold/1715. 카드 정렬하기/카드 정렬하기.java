import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.PriorityQueue;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(stringTokenizer.nextToken());

        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int i=0; i<N; i++){
            queue.add(Integer.parseInt(br.readLine()));
        }

        int first = 0;
        int second = 0;
        int sum = 0;
        while(queue.size()>1){
            first = queue.remove();
            second = queue.remove();
            sum += first + second;
            queue.add(first+second);
        }
        System.out.println(sum);
    }
}