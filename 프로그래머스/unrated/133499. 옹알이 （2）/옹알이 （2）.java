import java.util.*;

class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        
        String[] arr1 = {"aya", "ye", "woo", "ma"};
        String[] arr2 = {"ayaaya", "yeye", "woowoo", "mama"};
        List<String> list = new ArrayList<>();
        
        //연속 발음 삭제
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<arr2.length; j++){
                if(babbling[i].contains(arr2[j])){
                    break;
                }
                if(!babbling[i].contains(arr2[j]) && j==3){
                    list.add(babbling[i]);
                }
            }
        }
        
        System.out.println(list);
        
        //발음 가능 확인
        for(String l : list){
            while(true){
                int len = l.length();
                
                for(int i=0; i<4; i++){
                    if(l.startsWith(arr1[i])){
                        l = l.substring(arr1[i].length());
                    }
                }
                
                if(l.length()==0){
                    answer++;
                    break;
                }
                
                if(len == l.length()){
                    break;
                }
            }
        }
        
        return answer;
    }
}