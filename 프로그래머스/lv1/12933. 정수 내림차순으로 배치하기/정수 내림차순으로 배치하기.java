import java.util.Arrays;

class Solution {
    public long solution(long n) {
        String[] arr = String.valueOf(n).split("");
        Arrays.sort(arr);
        
        String answer = "";
        for(int i=0; i<arr.length; i++){
            answer+=arr[arr.length-1-i];
        }
        return Long.parseLong(answer);
    }
}