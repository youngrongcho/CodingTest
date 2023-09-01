class Solution {
    public int[] solution(int[] prices) {
        int[] answer = new int[prices.length];
        
        for(int i=0; i<prices.length; i++){
            int temp = 0;
            for(int j=i+1; j<prices.length; j++){
                if(prices[i]<=prices[j]){
                    temp++;
                } else {
                    temp++;
                    break;
                }
            }
            answer[i] = temp;
        }
        
        return answer;
    }
}