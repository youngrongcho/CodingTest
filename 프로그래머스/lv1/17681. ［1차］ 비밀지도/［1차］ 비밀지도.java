import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] newArr1 = new String[n];
        String[] newArr2 = new String[n];
        
        //각 배열의 숫자를 이진수로 변환. 이진수 길이 맞추기
        for(int i=0; i<n; i++){
            newArr1[i] = Integer.toBinaryString(arr1[i]);
            if(newArr1[i].length()<n){
                newArr1[i] = "0".repeat(n-newArr1[i].length())+newArr1[i];
            }
            newArr2[i] = Integer.toBinaryString(arr2[i]);
            if(newArr2[i].length()<n){
                newArr2[i] = "0".repeat(n-newArr2[i].length())+newArr2[i];
            }
        }
        
        System.out.println(Arrays.toString(newArr1));
        System.out.println(Arrays.toString(newArr2));
        
        //두 배열을 합치기
        String[] arr = new String[n];
        for(int i=0; i<n; i++){
            arr[i] = "";
            for(int j=0; j<n; j++){
                int a = newArr1[i].charAt(j)-'0';
                int b = newArr2[i].charAt(j)-'0';
            
                if(a+b>=1) {
                    arr[i] += "#"; 
                } else {
                    arr[i] += " ";
                }
            }
        }
        
        //배열 출력 1->#, 0->" "
        return arr;
    }
}