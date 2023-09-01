class Solution {
    public int solution(int n, int m, int[] section) {
        int answer = 1;
        
        int temp = section[0] + m;
        //작은 번호부터 m까지 1번으로 해결 가능. 
        for(int i=1; i<section.length; i++){
            if(section[i] >= temp){
                answer++;
                temp = section[i] + m;
            }
        }
        
        return answer;
    }
}