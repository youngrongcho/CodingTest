import java.util.*;

class Solution {
    public int[] solution(int[] answers) {
        //각각의 수포자가 찍는 방식을 String[]에 담는다.
        String[] students = new String[]{"12345", "21232425", "3311224455"}; 
        
        //각자의 점수를 담을 Map을 만든다. 
        Map<Integer, Integer> grades = new HashMap<>();
        
        //for문으로 시험 정답과 비교해서 점수를 리스트에 담는다.
        for(int i=0; i<3; i++){
            int count = 0;
            for(int j=0; j<answers.length; j++){
                if(answers[j]==students[i].charAt(j%students[i].length())-'0'){
                    count++;
                }
            }
            grades.put(i, count);
        }
        
        //가장 높은 점수를 찾는다. 
        int max = Collections.max(grades.values());
        
        //최고점을 받은 사람(키+1)을 List에 담아서 int[]로 리턴한다. 
        List<Integer> result = new ArrayList<>(); 
        
        for(Map.Entry<Integer, Integer> entry : grades.entrySet()){
            if(entry.getValue()==max) result.add(entry.getKey()+1);
        }
            
        return result.stream().mapToInt(i->i).toArray();
    }
}