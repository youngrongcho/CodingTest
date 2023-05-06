import java.util.*;

class Solution {
    public String solution(String s) {
        //공백으로 쪼개고, 숫자로 바꾼 후, 최대 최소값을 찾는다. 
        String[] arr = s.split(" ");
        
        int[] numbers = new int[arr.length];
        
        for(int i=0; i<arr.length; i++){
            numbers[i] = Integer.parseInt(arr[i]);
        }
        
        Arrays.sort(numbers);
        
        return numbers[0] + " " + numbers[numbers.length-1];
    }
}