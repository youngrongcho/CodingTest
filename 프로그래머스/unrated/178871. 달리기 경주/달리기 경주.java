import java.util.*;

class Solution {
    public String[] solution(String[] players, String[] callings) {
        //사람과 등수 넣기
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<players.length; i++){
            map.put(players[i], i);
        }
        
        //호명된 선수와 앞의 선수를 swap
        for(int i=0; i<callings.length; i++){
            int idx = map.get(callings[i]);
            String prePlayer = players[idx-1];
            
            map.replace(callings[i], idx-1);
            map.replace(prePlayer, idx);
            
            String temp = players[idx-1];
            players[idx-1] = players[idx];
            players[idx] = temp;
        }
        
        return players;
    }
}