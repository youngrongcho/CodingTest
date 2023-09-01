import java.util.*;

class Solution {
    public int solution(String dartResult) {
        int answer = 0;
        
        //숫자가 나올때마다 끊어서 리스트에 담기 
        List<String> list = new ArrayList<>();
        
        while(dartResult.length()>0){
            int len = dartResult.length();
            for(int i=2; i<len; i++){
                if(Character.isDigit(dartResult.charAt(i))){
                    list.add(dartResult.substring(0, i));
                    dartResult = dartResult.substring(i);
                    break;
                }
            }
            if(dartResult.length()==2 || dartResult.length()==3 || (dartResult.startsWith("10") && dartResult.length()==4)){
                list.add(dartResult);
                break;
            }
        }
        
        //각 회차의 계산된 점수를 담을 배열
        int[] points = new int[3];
        
        //점수 계산하기 
        for(int i=0; i<3; i++){
            String str = list.get(i);
            
            String[] arr;
            if(str.startsWith("10") && str.length()==3){
                arr = new String[2];
                arr[0] = "10";
                arr[1] = str.substring(2);
            } else if(str.startsWith("10") && str.length()==4){
                arr = new String[2];
                arr[0] = "10";
                arr[1] = str.substring(2,3);
                arr[2] = str.substring(3);
            } else {
                arr = str.split("");
            }
            int temp = Integer.parseInt(arr[0]);
            
            if(arr[1].equals("D")){
                temp *= temp;
            } else if(arr[1].equals("T")){
                temp = temp * temp * temp;
            }
            
            if(arr.length==3){
                if(arr[2].equals("*")){
                    if(i!=0){
                        points[i-1] *= 2;
                    } 
                    temp *= 2;
                } else if(arr[2].equals("#")){
                    temp *= -1;
                }
            }
            points[i] = temp;
        }
        
        return points[0]+points[1]+points[2];
    }
}