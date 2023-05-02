import java.util.*;

class Solution {
    public int[] solution(int[] numbers) {
        //정답을 받을 Set을 만들기 
        Set<Integer> set = new HashSet<>();
        
        //이중 for문 돌려서 더한 값을 넣기
        for(int i=0; i<numbers.length; i++){
            for(int j=i+1; j<numbers.length; j++){
                set.add(numbers[i]+numbers[j]);
            }
        }
        
        //배열로 반환하고, 정렬해서 리턴. 
        int[] answer = set.stream().mapToInt(Integer::intValue).toArray();
        Arrays.sort(answer);
        
        return answer;
    }
}