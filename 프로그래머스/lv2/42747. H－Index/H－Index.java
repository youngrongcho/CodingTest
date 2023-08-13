import java.util.*;

class Solution {
    public int solution(int[] citations) {
        int answer = 0; //h편이 h번 이상 인용되고, 나머지 논문은 h번 이하 인용되는 h 최대값 
        int count = 0; //h번 이상 인용된 논문 개수
        int remain = 0; //나머지 논문 인용 횟수 중 최대값
        int temp = 0; //인덱스 후보
        
        Arrays.sort(citations);
        
        while(temp <= citations[citations.length-1]){
            for(int j=0; j<citations.length; j++){
                if(citations[j]>=temp){
                    count++;
                } else {
                    if(remain < citations[j]){
                        remain = citations[j];
                    }
                }
            }
            
            if(temp <= count && remain <= temp){
                answer = temp;
            }
            count = 0;
            remain = 0;
            temp++;
        }
        
        return answer;
    }
}