class Solution {
    public int solution(int a, int b, int n) {
        int answer = 0;
        
        while(true){
            // n/a * b -> 받는 병의 수
            int get = n/a*b;
            // n%a -> 남은 병의 수 
            int rem = n%a;
            
            answer += get;
            n = get + rem;
            
            if(n < a){
            return answer;
            }  
        }
    }
}