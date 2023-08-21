import java.util.*;

class Solution {
    public int[] solution(int[] progresses, int[] speeds) {
        //각각 작업 소요일 구하기 : (100-progress)/speed (올림)
        Queue<Integer> neededTimes = new LinkedList<>();
        for(int i=0; i<speeds.length; i++){
            neededTimes.add((int) Math.ceil((double)(100-progresses[i])/speeds[i]));
        }
        
        //맨앞의 소요시간보다 작으면 함께 배포
        int count = 1;
        int prior = neededTimes.poll();
        int next = 0;
        List<Integer> answer = new ArrayList<>();
        
        while(neededTimes.size()>0){
            next = neededTimes.poll();
            if(prior >= next){
                count++;
            } else {
                prior = next;
                answer.add(count);
                count = 1;
            }
            
            if(neededTimes.size()==0){
                answer.add(count);
                break;
            }
        }
        
        return answer.stream().mapToInt(i->i).toArray();
    }
}