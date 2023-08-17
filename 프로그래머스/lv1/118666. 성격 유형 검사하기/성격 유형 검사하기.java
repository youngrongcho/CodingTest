import java.util.*;

class Solution {
    public String solution(String[] survey, int[] choices) {
        //Map에 유형과 점수 담기(초기화)
        String[] arr = {"R", "T", "F", "C", "M", "J", "A", "N"};
        Map<String, Integer> map = new HashMap<>();
        for(String a : arr){
            map.put(a, 0);
        }
        
        //선택지 점수 넣기
        String key = "";
        int value = 0;
        
        for(int i=0; i<survey.length; i++){
            if(choices[i]==4) continue;
            else if(choices[i]<4){
                key = survey[i].charAt(0)+"";
                value = map.get(key);
                map.replace(key, value + 4 - choices[i]);
            }
            else {
                key = survey[i].charAt(1)+"";
                value = map.get(key);
                map.replace(key, value - 4 + choices[i]);
            }
        }
        
        //점수 비교 후 유형 도출
        String answer = "";
        
        answer += map.get("R") >= map.get("T") ? "R" : "T";
        answer += map.get("C") >= map.get("F") ? "C" : "F";
        answer += map.get("J") >= map.get("M") ? "J" : "M";
        answer += map.get("A") >= map.get("N") ? "A" : "N";
        
        return answer;
    }
}