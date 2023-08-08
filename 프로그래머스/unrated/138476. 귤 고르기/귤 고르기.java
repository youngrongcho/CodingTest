import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int k, int[] tangerine) {
        int count = 0;
        
        //종류별 갯수를 센다.
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<tangerine.length; i++){
            if(map.containsKey(tangerine[i])){
                int value = map.get(tangerine[i]);
                map.replace(tangerine[i], value+1);
            } else {
                map.put(tangerine[i], 1);
            }
        }
        
        //갯수를 정렬한다. 
        List<Integer> values = map.values().stream()
            .collect(Collectors.toCollection(ArrayList::new));
        Collections.sort(values);
        
        //종류가 가장 많은 귤부터 상자에 담아 k개를 채운다.
        int idx = values.size()-1;
        while(k>0){
            k -= values.get(idx);
            count++;
            idx--;
            if(k<=0){
                return count;
            }
        }
        
        return count;
    }
}