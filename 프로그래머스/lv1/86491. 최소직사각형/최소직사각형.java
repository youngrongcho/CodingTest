class Solution {
    public int solution(int[][] sizes) {
        //큰 수를 첫 번째 값으로 바꾸기.
        for(int i=0; i<sizes.length; i++){
            if(sizes[i][0] < sizes[i][1]){
                int temp = sizes[i][0];
                sizes[i][0] = sizes[i][1];
                sizes[i][1] = temp;
            }
        }
        
        //각각 최대값 찾아서 곱하기 
        int max1 = sizes[0][0];
        int max2 = sizes[0][1];
        for(int i=1; i<sizes.length; i++){
            if(max1 < sizes[i][0]) max1 = sizes[i][0];
            if(max2 < sizes[i][1]) max2 = sizes[i][1]; 
        }
        
        return max1*max2;
    }
}