import java.util.*;

class Solution{
    public int solution(int n, int a, int b){
        //경기자 정렬 (a가 b보다 앞 번호이도록)
        if(a > b){
            int temp = a;
            a = b;
            b = temp;
        }
        
        int answer = 0;

        //대기열 큐 
        Queue<Integer> standBy = new LinkedList<>();
        for(int i=1; i<=n; i++){
            standBy.add(i);
        }
        
        //경기 배열 2명 
        int[] play = new int[2];
        
        //경기자 확인 후 한 명 올려보내기 -> 대기열 리스트 
        while(standBy.size() > 1){
            play[0] = standBy.poll();
            play[1] = standBy.poll();
            
            if(play[0]==a && play[1]==b){
                break;
            } else if(play[0]==a || play[0]==b){
                standBy.add(play[0]);
                answer++;
            } else if(play[1]==a || play[1]==b){
                standBy.add(play[1]);
                answer++;
            } else {
                standBy.add(play[0]);
            }
        }

        return answer/2 +1;
    }
}