import java.util.*;

class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        //0이 아닌 숫자들이 몇 개나 당첨되었는지 카운트 -> 최저 순위
        //0인 숫자들이 모두 당첨된 경우를 더하면 -> 최고 순위
        int min = 0;
        int zero = 0;
        
        for(int i=0; i<6; i++){
            for(int j=0; j<6; j++){
                if(lottos[i]==0) {
                    zero++;
                    break;
                }
                if(lottos[i]==win_nums[j]) {
                    min++;
                    break;
                }
            }
        }
        
        int max = min+zero;
        
        if(min==0) min =1;
        if(max==0) max =1;

        return new int[]{7-max, 7-min};
    }
}