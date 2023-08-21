import java.util.*;

class Solution{
    public int solution(String s){
        String[] arr = s.split("");
        Stack<String> stack = new Stack<>();
        stack.push(arr[0]);
        
        for(int i=1; i<arr.length; i++){
            if(stack.isEmpty()){
                stack.push(arr[i]);
                continue;
            }
            if(stack.peek().equals(arr[i])){
                stack.pop();
            } else {
                stack.push(arr[i]);
            }
        }
        
        return stack.isEmpty()? 1 : 0;
    }
}