import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        StringTokenizer stringTokenizer = new StringTokenizer(br.readLine());
        int num = Integer.parseInt(stringTokenizer.nextToken());
        int k = Integer.parseInt(stringTokenizer.nextToken());

        stringTokenizer = new StringTokenizer(br.readLine());
        int[] nums = new int[num];
        for(int i=0; i<num; i++){
            nums[i] = Integer.parseInt(stringTokenizer.nextToken());
        }

        Arrays.sort(nums);
        System.out.println(nums[k-1]);

    }
}