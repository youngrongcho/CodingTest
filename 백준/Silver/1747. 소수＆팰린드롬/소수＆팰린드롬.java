import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언
        long N = Long.parseLong(br.readLine());
        long num = N;

        while(true){
            if(num >= N && isPalindrome(num) && isPrime(num)) {
                System.out.println(num);
                break;
            }
            else num++;
        }
    }

    public static boolean isPrime(long num) {
        if (num == 1) return false;
        if (num > 3) {
            for (int i = 2; i <= Math.sqrt(num); i++) {
                if (num % i == 0) return false;
            }
        }
        return true;
    }

    public static boolean isPalindrome(long num) {
        String str = String.valueOf(num);
        int left = 0;
        int right = str.length()-1;
        while(left<=right){
            if(str.charAt(left) == str.charAt(right)){
                left++;
                right--;
            }
            else return false;
        }
        return true;
    }
}