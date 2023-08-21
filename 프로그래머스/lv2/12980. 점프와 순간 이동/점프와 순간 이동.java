public class Solution {
    public int solution(int n) {
        int ans = 1;
        
        if(n==1){
            return ans;
        }

        while(true){
            ans += n % 2;
            n /= 2;
            if(n==1){
                break;
            }
        }

        return ans;
    }
}