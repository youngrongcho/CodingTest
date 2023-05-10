import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        //입력값 받기
        int num = Integer.parseInt(br.readLine());

        //1~num까지의 숫자를 넣는다.
        Queue<Integer> queue = new LinkedList<>();
        for(int i=1; i<=num; i++){
            queue.add(i);
        }

        while(queue.size()>1){
            //맨 위의 카드를 버린다.
            queue.poll();
            //버린 후 남은 맨 위의 카드를 맨 밑으로 내린다.
            int n = queue.poll();
            queue.add(n);
        }

        //마지막 1장을 출력한다.
        System.out.println(queue.poll());
    }
}