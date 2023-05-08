import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        //입력값 받기
        int n = Integer.parseInt(br.readLine());
        int m = Integer.parseInt(br.readLine());

        //숫자 배열에 넣고 정렬
        int[] nums = new int[n];
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        for(int i=0; i<n; i++){
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(nums);

        //변수 초기화
        int count = 0;
        int startIdx = 0;
        int endIdx = n-1;

        //2개를 골랐을 때 m이 되는 경우의 수 구하기
        while(startIdx < endIdx){
            int sum = nums[startIdx] + nums[endIdx];
            if(sum == m) {
                count++;
                endIdx--;
                startIdx++;
            }
            else if(sum > m){
                endIdx--;
            }
            else if(sum < m){
                startIdx++;
            }
        }
        System.out.println(count);
    }
}