class Solution {
    public int solution(int[] absolutes, boolean[] signs) {
        //부호에 따라 값을 더하고 뺀다. 
        int answer = 0;
        
        for(int i=0; i<signs.length; i++){
            if(signs[i]) answer += absolutes[i];
            else answer -= absolutes[i];
        }
        
        return answer;
    }
}