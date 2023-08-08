import java.util.*;
import java.util.stream.*;

class Solution {
    public String solution(String[] cards1, String[] cards2, String[] goal) {
        //카드 뭉치에서 한 장씩 순서대로 뽑아서 goal을 만들 수 있는지
        List<String> list1 = Stream.of(cards1).collect(Collectors.toList());
        List<String> list2 = Stream.of(cards2).collect(Collectors.toList());
        
        for(int i=0; i<goal.length; i++){
            if(!list1.isEmpty() && goal[i].equals(list1.get(0))){
                list1.remove(0);
                continue;
            } else if(!list2.isEmpty() && goal[i].equals(list2.get(0))){
                list2.remove(0);
                continue;
            } else {
                return "No";
            }
        }
        return "Yes";
    }
}