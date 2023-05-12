import java.util.*;

class Solution {
    boolean solution(String s) {
        //예외 상황 미리 처리하기
        if( s.length()%2==1) return false;
        // s = s.replaceAll("()", "");
        // if(s.length()==0) return true;
        
        char[] arr = s.toCharArray();
        int count =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]=='(') count++;
            else count--;
            if(count <0) return false;
        }   
        return count==0;
    }
}