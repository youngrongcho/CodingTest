import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        int N = Integer.parseInt(br.readLine());

        int[] nums = new int[N];
        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        for (int i = 0; i < N; i++) {
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());
        }
        Arrays.sort(nums);

        int M = Integer.parseInt(br.readLine());
        stringTokenizer = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            boolean find = false;
            int target = Integer.parseInt(stringTokenizer.nextToken());
            int left = 0;
            int right = nums.length - 1;

            while (left <= right) {
                int mid = (left + right) / 2;
                if (nums[mid] > target) {
                    right = mid - 1;
                } else if (nums[mid] < target) {
                    left = mid + 1;
                } else {
                    find = true;
                    break;
                }
            }
            if (find) {
                System.out.println(1);
            } else {
                System.out.println(0);
            }
        }
    }
}