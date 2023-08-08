import java.util.*;

class Solution {
    public static String[] arr;
    public String[] solution(String[] strings, int n) {
        arr = strings;
        
        //사전순으로 정렬
        Arrays.sort(arr);
        
        //인덱스 n의 문자를 비교 
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<arr.length-1; j++){
                if(arr[j].charAt(n) > arr[j+1].charAt(n)){
                    swap(j, j+1);
                } 
            }
        }
        return arr;
    }
    
    public static void swap(int i, int j){
        String temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}