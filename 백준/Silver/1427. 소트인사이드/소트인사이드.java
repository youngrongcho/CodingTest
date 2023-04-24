import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        String str = br.readLine();
        String[] arr = str.split("");
        Arrays.sort(arr);

        String answer = "";
        for(int i=0; i< arr.length; i++){
            answer += arr[arr.length-1-i];
        }

        System.out.println(answer);
    }
}