import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        int number = Integer.parseInt(br.readLine());

        int[] arr = new int[number];
        int[][] numberAndIndex = new int[number][2];

        for (int i = 0; i < number; i++) {
            arr[i] = Integer.parseInt(br.readLine());
            numberAndIndex[i][0] = arr[i];
            numberAndIndex[i][1] = i;
        }

        Arrays.sort(numberAndIndex, new Comparator<int[]>() {
            @Override
            public int compare(int[] o1, int[] o2) {
                return o1[0]-o2[0];
            }
        });

        int max = 0;
        for(int i=0; i<number; i++){
            if(numberAndIndex[i][1]-i>max) max = numberAndIndex[i][1]-i;
        }

        System.out.println(max+1);
    }
}