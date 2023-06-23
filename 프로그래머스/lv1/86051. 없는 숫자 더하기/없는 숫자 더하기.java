class Solution {
    public int solution(int[] numbers) {
        int sum = 0;
        for(int i=1; i<=9; i++){
            sum += i;
        }
        
        for(int i=0; i<numbers.length; i++){
            sum -= numbers[i];   
        }
        
        return sum;
    }
}