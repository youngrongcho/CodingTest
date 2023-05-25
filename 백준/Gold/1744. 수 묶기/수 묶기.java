import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Collections;
import java.util.PriorityQueue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        int N = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> plusQueue = new PriorityQueue<>(Collections.reverseOrder());
        PriorityQueue<Integer> minusQueue = new PriorityQueue<>();
        int one = 0;
        int zero = 0;

        for (int i = 0; i < N; i++) {
            int data = Integer.parseInt(br.readLine());
            if (data > 1) {
                plusQueue.add(data);
            } else if (data < 0) {
                minusQueue.add(data);
            } else if (data == 1) {
                one++;
            } else zero++;
        }

        int answer = 0;
        while (plusQueue.size() > 1) {
            int first = plusQueue.remove();
            int second = plusQueue.remove();
            answer += first * second;
        }
        if (plusQueue.size() == 1) answer += plusQueue.remove();

        while (minusQueue.size() > 1) {
            int first = minusQueue.remove();
            int second = minusQueue.remove();
            answer += first * second;
        }

        if (zero==0 && minusQueue.size() == 1) answer += minusQueue.remove();
        answer += one;
        System.out.println(answer);
    }
}