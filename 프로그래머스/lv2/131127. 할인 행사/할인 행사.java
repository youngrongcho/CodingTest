import java.util.*;
import java.util.stream.*;

class Solution {
    public int solution(String[] want, int[] number, String[] discount) {
        int answer = 0;
        
        //배열을 리스트로 변환
        List<String> dcList = Stream.of(discount).collect(Collectors.toList());
        List<String> filter;
        List<String> ten;

        for(int i=0; i<discount.length; i++){
            //dcList 사이즈가 열흘보다 작으면 리턴
            if(dcList.size()<10) {
                break;
            }
            
            //열흘간 확인하기 위해 리스트 자르기
            ten = dcList.subList(0,10);
            
            //열흘 간 원하는 할인 품목들과 개수를 살 수 있는지 확인
            for(int j=0; j<want.length; j++){
                String item = want[j];
                filter = ten.stream().filter(s->s.equals(item))
                    .collect(Collectors.toList());
                
                //살 수 없으면 다시 새로운 열흘 확인
                if(filter.size()<number[j]){
                    dcList.remove(0);
                    break;
                } 
                
                //살 수 있으면 카운트 늘리고, 새로운 열흘 확인
                if(j==want.length-1){
                    answer++;
                    dcList.remove(0);
                }
            }
        }
        
        return answer;
    }
}