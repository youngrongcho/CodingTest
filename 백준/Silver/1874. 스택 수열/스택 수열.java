import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Stack;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in)); //선언

        //수열 개수 받기
        int numbers = Integer.parseInt(br.readLine());

        //수열 받기
        int[] arr = new int[numbers];
        for(int i=0; i<numbers; i++){
            arr[i] = Integer.parseInt(br.readLine());
        }

        //스택 생성
        Stack<Integer> stack = new Stack<>();
        StringBuffer sb = new StringBuffer();
        int num = 1;
        boolean result = true;

        for(int i=0; i<numbers; i++){
            int su = arr[i];
            if(num <= su){ //현재 수열 값보다 값이 작으면 계속 더하면서 스택에 값을 넣는다.
                while(num <= su){
                    stack.push(num++);
                    sb.append("+\n");
                }
                stack.pop();
                sb.append("-\n");
            }
            else { //스택의 값이 현재 수열 값보다 값이 크면
                int y = stack.pop();
                if(su < y){
                    System.out.println("NO");
                    result = false;
                    break;
                }
                else {
                    sb.append("-\n");
                }
            }

        }
       if(result) System.out.println(sb.toString());
    }
}