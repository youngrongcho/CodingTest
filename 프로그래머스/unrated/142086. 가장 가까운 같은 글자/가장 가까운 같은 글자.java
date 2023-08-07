class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        answer[0] = -1;
        
        for(int i=1; i<s.length(); i++){
            String part = s.substring(0, i);
            int idx = part.lastIndexOf(s.charAt(i)+"");
            if(idx == -1) {
                answer[i] = -1;
            } else {
                answer[i] = i - idx;
            }
        }
        
        return answer;
    }
}