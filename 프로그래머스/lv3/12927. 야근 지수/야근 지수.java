import java.util.*;

class Solution {
    public long solution(int n, int[] works) {
        long answer = 0;
        
        //우선순위 큐에 큰 숫자부터 저장
        PriorityQueue<Integer> queue = 
            new PriorityQueue<>(Collections.reverseOrder());
        
        for(int w : works){
            queue.add(w);
        }
        
        //1~n번을 돌아가면서, works에서 제일 큰 숫자에서 1씩 뺀다. 
        for(int i=0; i<n; i++){
            if(queue.size()==0){
                break;
            }
            
            int temp = queue.poll();
            temp--;
            if(temp<0){
                continue;
            }
            queue.add(temp);
        }
        
        //야근 피로도 계산
        while(queue.size()>0){
            int num = queue.poll();
            answer += num*num;
        }
        
        return answer;
    }
}