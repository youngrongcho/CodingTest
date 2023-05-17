class Solution {
    public int solution(int n) {    
        int left = 1;
        int right = 1;
        int sum = 1;
        
        //n으로 n을 나타내는 경우 1 초기화
        int count = 1; 
        
        while(right != n){
            if(sum == n){
                count++;
                right++;
                sum += right;
            }
            if(sum < n){
                right++;
                sum += right;
            }
            if(sum > n){
                sum -= left;
                left++;
            }
        }
        return count;
    }
}