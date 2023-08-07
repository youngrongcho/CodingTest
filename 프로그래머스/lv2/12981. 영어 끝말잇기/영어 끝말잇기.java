import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        //리스트
        ArrayList<String> list = new ArrayList<>();
        //정답 배열
        int[] answer = new int[2];
        //1번 단어 넣기
        list.add(words[0]);
        
        //words를 순회하면서 새로운 리스트에 넣고, 비교.
        for(int i=1; i<words.length; i++){
            //해당 단어가 이전에 나왔으면 탈락, 이전 단어와 이어지지 않으면 탈락 
            if(list.contains(words[i]) || 
                !words[i-1].substring(words[i-1].length()-1)
               .equals(words[i].substring(0,1))){
                
                answer[0] = (i+1)%n==0? n : (i+1)%n;
                answer[1] = (i+1)%n==0? (i+1)/n : (i+1)/n +1;
                    
                //탈락된 사람의 번호와 턴 횟수를 리턴
                return answer;
            }
            list.add(words[i]);
        }
        return answer;
    }
}