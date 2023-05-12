import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        //입력값 받기
        int num = Integer.parseInt(br.readLine());

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());

        //인출 시간의 최소 합 구하기 -> 첫 번째부터 n-1번째 까지의 누적 합이 적은 순서 -> 작은 순서로 정렬
        int[] times = new int[num];

        for(int i=0; i<num; i++){
            times[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(times);

        int answer = 0;
        for(int i=0; i<num; i++){
            answer += times[i] * (num-i);
        }
        System.out.println(answer);
    }
}