import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        int number = Integer.parseInt(br.readLine());

        int[] arr = new int[number];

        for (int i = 0; i < number; i++) {
            arr[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(arr);

        for (int a : arr) {
            System.out.println(a);
        }
    }
}