import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int[] priorities, int location) {
        int answer = 0;
        
        //우선순위와 프로세스 이름 매핑
        Map<String, Integer> map = new LinkedHashMap<>();
        
        for(int i=0; i<priorities.length; i++){
            map.put("idx"+i, priorities[i]);
        }
                
        //큐에 담기
        Queue<Map.Entry<String, Integer>> queue = new LinkedList<>();
        for(Map.Entry<String, Integer> m : map.entrySet()){
            queue.add(m);
        }
        
        //프로세스 실행
        Set<String> order = new LinkedHashSet<>();
        
        while(!queue.isEmpty()){
            Map.Entry<String, Integer> temp = queue.poll();
            String key = temp.getKey();
            int value = temp.getValue();
            for(Map.Entry<String, Integer> m : queue){
                if(m.getValue()>value){
                    queue.add(temp);
                    temp = queue.peek();
                    break;
                }
            }
            if(temp.getKey().equals(key)){
                order.add(key);
            }
        }
        
        return order.stream().collect(Collectors.toList())
            .indexOf("idx"+location)+1;
    }
}