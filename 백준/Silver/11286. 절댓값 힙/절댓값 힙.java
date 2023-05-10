import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        //입력값 받기
        int num = Integer.parseInt(br.readLine());

        PriorityQueue<Integer> queue = new PriorityQueue<>(
                (o1, o2) -> {
                    int first = Math.abs(o1);
                    int second = Math.abs(o2);
                    if(first==second) return o1 > o2? 1 : -1;
                    else return first-second;
                }
        );

        //정답 리스트 만들기
        List<Integer> answer = new ArrayList<>();

        for(int i=0; i<num; i++){
            int x = Integer.parseInt(br.readLine());
            //빈 배열인데 정수 x가 0이면, 0을 출력한다.
            if(x==0 && queue.isEmpty()) answer.add(0);
            //주어진 정수 x가 0이면, 배열에서 절댓값이 가장 작은 수를 출력하고 배열에서 제거한다.
            if(x==0 && !queue.isEmpty()) answer.add(queue.poll());
            //주어진 정수 x가 0이 아니면, x를 배열에 추가한다.
            if(x!=0) queue.add(x);
        }

        for(Integer a : answer){
            System.out.println(a);
        }
    }
}