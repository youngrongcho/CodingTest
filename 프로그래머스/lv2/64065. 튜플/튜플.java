import java.util.*;

class Solution {
    public int[] solution(String s) {
        //문자열 쪼개기 
        String[] arr = s.substring(1, s.length()-1).split("\\}");
        
        //집합을 리스트에 담기
        List<List<String>> list = new ArrayList<>();
        for(String a : arr){
            a = a.replaceAll("\\{", "");
            if(a.startsWith(",")) {
                a = a.substring(1);
            }
            String[] aSet = a.split(",");
            List<String> aList = Arrays.asList(aSet);
            list.add(aList);
        }
        
        Set<Integer> set = new LinkedHashSet<>();
        
        int num = 1;
        while(num<=list.size()){
            for(int i=0; i<list.size(); i++){
                if(list.get(i).size()==num){
                    for(int j=0; j<num; j++){
                        set.add(Integer.parseInt(list.get(i).get(j)));
                    }
                num++;
                break;
                }
            }
        }
        
        return set.stream().mapToInt(Integer::intValue).toArray();
    }
}