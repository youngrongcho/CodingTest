import java.util.*;

class Solution {
    public int[] solution(int k, int[] score) {
        int[] answer = new int[score.length];
        List<Integer> list = new ArrayList<>();
        
        //k >= score.length 경우 (런타임 에러 처리)
        if(k > score.length){
            for(int i=0; i<score.length; i++){
                list.add(score[i]);
                answer[i] = Collections.min(list);
            }
            return answer;
        }
        
        //k일까지 초기화
        for(int i=0; i<k; i++){
            list.add(score[i]);
            answer[i] = Collections.min(list);
        }
                
        //k일 이후, 가장 낮은 점수보다 높으면 들어가기
        for(int i=k; i<score.length; i++){
            if(Collections.min(list) < score[i]){
                list.remove(Collections.min(list));
                list.add(score[i]);
            }
            answer[i] = Collections.min(list);
        }
        
        return answer;
    }
}