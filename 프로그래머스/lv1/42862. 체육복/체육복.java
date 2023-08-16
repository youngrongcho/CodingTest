import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(int n, int[] lost, int[] reserve) {
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        //lost array -> list
        List<Integer> lList = Arrays.stream(lost)
            .boxed().collect(Collectors.toList());
        
        //reserve array -> list
        List<Integer> rList = Arrays.stream(reserve)
            .boxed().collect(Collectors.toList());
        
        //본인이 잃어버렸으면 제외해야함
        for(int l : lost){
            for(int r : reserve){
                if(l==r){
                    lList.remove(Integer.valueOf(l));
                    rList.remove(Integer.valueOf(r));
                }
            }
        }
        
        //전체 학생 수 - 잃어버린 학생 수 + 빌려준 학생 수
        int answer = n-lList.size();
        
        //여분을 가진 학생 앞뒤로 잃어버린 학생이 있다면 한 명에게 빌려줄 수 있음
        for(int l : lList){
            for(int r : rList){
                if(l==r-1){
                    rList.remove(Integer.valueOf(r));
                    answer++;
                    break;
                }
                if(l==r+1){
                    rList.remove(Integer.valueOf(r));
                    answer++;
                    break;
                }
            }
            if(rList.size()==0){
                return answer;
            }
        }
        
        return answer;
    }
}