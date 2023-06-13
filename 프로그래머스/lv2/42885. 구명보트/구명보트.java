import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        
        //사람 정렬하기 
        Arrays.sort(people);
        
        //작은 사람과 큰 사람 합하기, 포인터 이용 
        int left = 0;
        int right = people.length-1;
        
        while(left <= right){
            //left==right
            if(left==right) {
                answer++;
                break;
            }
            
            //리밋 이하
            if(people[left]+people[right] <= limit){
                answer++;
                left++;
                right--;
            }
            
            //리밋 초과
            if(people[left]+people[right] > limit){
                answer++;
                right--;
            }
        }
        return answer;
    }
}