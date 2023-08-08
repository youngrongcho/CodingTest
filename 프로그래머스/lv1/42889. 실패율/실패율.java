import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        //각 스테이지별 클리어 못한 회원 카운트 (인덱스 0은 빈값, 마지막 인덱스는 모두 클리어한 사람)
        int[] notClearCount = new int[N+2];
        for(int s : stages){
            notClearCount[s]++;
        }
        
        //스테이지에 도달한 플레이어 수 구하기
        int[] arrivalCount = new int[N+2];
        for(int i=0; i<stages.length; i++){
            for(int j=0; j<=stages[i]; j++){
                arrivalCount[j]++;
            }
        }
        
        //실패율 구하기
        double[] failPercent = new double[N];
        Map<Integer, Double> map = new HashMap<>();
        
        for(int i=0; i<N; i++){
            if(arrivalCount[i+1]==0){
                failPercent[i] = (double) arrivalCount[i+1];
                map.put(i+1, failPercent[i]);
            } else {
                failPercent[i] = (double) notClearCount[i+1] / arrivalCount[i+1];
                map.put(i+1, failPercent[i]);
            }
        }
        
        Arrays.sort(failPercent);
        
        //failPercent의 인덱스 1~N까지를 비교하여 실패율 높은 순서로 정답 배열 반환
        int[] answer = new int[N];
        for(int i=0; i<N; i++){
            for(int j=1; j<=N; j++){
                if(map.containsKey(j) 
                   && failPercent[failPercent.length-1-i]==map.get(j)){
                    answer[i] = j;
                    map.remove(j);
                    break;
                }
            }
        }

        return answer;
    }
}