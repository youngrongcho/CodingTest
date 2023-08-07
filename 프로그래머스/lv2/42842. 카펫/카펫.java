import java.util.*;
import java.lang.*;

class Solution {
    public int[] solution(int brown, int yellow) {
        int[] answer = new int[2];
        int x = 0;
        int y = 0;
        // x >= y
        // x * y = brown + yellow;
        // (x-2) * (y-2) = yellow;
        
        //약수 모음 구하기
        for(int i=1; i<=Math.sqrt(brown+yellow); i++){
            if((brown+yellow)%i==0) {
                y = i;
                x = (brown+yellow)/y;
                
                if((x-2)*(y-2) == yellow){
                    answer[0] = x;
                    answer[1] = y;
                    return answer;
                }
            }
        }
        return answer;
    }
}