import java.util.*;

class Solution {
    public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        
        //신고 목록 초기화
        Map<String, HashSet<String>> map = new HashMap();
        for(int i=0; i<id_list.length; i++){
            map.put(id_list[i], new HashSet<String>());
        }
        
        //한 유저 신고 1번씩 가능
        for(int i=0; i<report.length; i++){
            String[] arr = report[i].split(" "); 
            HashSet<String> value = map.get(arr[0]);
            value.add(arr[1]);
            map.replace(arr[0], value);
        }
        
        //신고 및 메일 횟수 초기화
        Map<String, Integer> reportedCountMap = new HashMap();
        Map<String, Integer> gotMailCountMap = new HashMap();
        
        for(int i=0; i<id_list.length; i++){
            String member = id_list[i];
            reportedCountMap.put(member, 0);
            gotMailCountMap.put(member, 0);
        }
        
        //각 유저가 신고 받은 횟수 구하기
        for(int i=0; i<id_list.length; i++){
            String member = id_list[i];
            for(int j=0; j<id_list.length; j++){
                if(map.get(member).contains(id_list[j])){
                    int count = reportedCountMap.get(id_list[j]);
                    reportedCountMap.replace(id_list[j], count+1);
                }
            }
        }
        
        //k번 이상 신고된 유저는 정지. 신고한 유저에게 메일 발송
        for(int i=0; i<reportedCountMap.size(); i++){
            String member = id_list[i];
            if(reportedCountMap.get(member)>=k){
                for(int j=0; j<map.size(); j++){
                    if(map.get(id_list[j]).contains(member)){
                        int count = gotMailCountMap.get(id_list[j]);
                        gotMailCountMap.replace(id_list[j], count+1);
                    }
                }
            }
        }
        
        //메일 받은 횟수 리턴
        for(int i=0; i<map.size(); i++){
            answer[i] = gotMailCountMap.get(id_list[i]);
        }
        return answer;
    }
}