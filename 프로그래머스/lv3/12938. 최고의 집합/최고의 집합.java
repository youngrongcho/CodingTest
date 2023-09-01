class Solution {
    public int[] solution(int n, int s) {
        if(n > s){
            return new int[]{-1};
        }
        
        //자연수 n개의 합이 s이면서, 각 원소의 곱이 최대인 집합을 오름차순으로 리턴하기 
        //나누고 나머지를 하나씩 더하기 
        int share = s/n;
        int remainder = s%n;
        
        int[] answer = new int[n];
        
        for(int i=0; i<n; i++){
            if(i<n - remainder){
                answer[i] = share;
            } else {
                answer[i] = share+1;
            }
        }
        
        return answer;
    }
}