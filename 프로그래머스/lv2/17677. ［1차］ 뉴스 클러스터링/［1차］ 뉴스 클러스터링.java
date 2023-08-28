import java.util.*;

class Solution {
    public int solution(String str1, String str2) {
        List<String> list1 = getPartList(str1);
        List<String> list2 = getPartList(str2);
        
        //교집합, 합집합 크기 구하기
        int intersectionCount = 0;
        int unionCount = list1.size()+list2.size();
        
        for(int i=0; i<list1.size(); i++){
            String str = list1.get(i);
            int size = list2.size();
            for(int j=0; j<size; j++){
                if(list2.get(j).equals(str)){
                    intersectionCount++;
                    list2.remove(list2.get(j));
                    break;
                }
            }
        }
        
        unionCount -= intersectionCount;
        
        if(intersectionCount==0 && unionCount==0){
            return 65536;
        }
        
        //리턴 = 교집합 크기 / 합집합 크기 * 65536 의 정수 부분
        double num = (double) intersectionCount / unionCount;
        return (int) Math.floor(num * 65536);
    }
    
    public static List<String> getPartList(String str){
        str = str.toUpperCase();
        List<String> list = new ArrayList<>();
        
        for(int i=0; i<str.length()-1; i++){
            String temp = str.substring(i, i+2);
            if(!temp.matches("^[A-Z]*$")){
                continue;
            } else {
                list.add(temp);
            }
        }
        
        return list;
    }
}