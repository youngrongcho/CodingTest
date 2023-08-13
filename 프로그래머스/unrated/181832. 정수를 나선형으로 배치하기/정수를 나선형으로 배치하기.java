class Solution {
    public int[][] solution(int n) {
        int[][] answer = new int[n][n];
        int x = 0;
        int y = 0;
        
        //우하좌상 순서로 이동
        
        /*
        4 3 3 2 2 1 1  우 하 좌 상 우 하 좌
        5 4 4 3 3 2 2 1 1 우 하 좌 상 우 하 좌 상 우
        6 5 5 4 4 3 3 2 2 1 1 
        */
        
        int count = n;
        
        for(int i=1; i<=n*n; i++){
            if(answer[x][y] == 0){
                answer[x][y] = i;
            }
            
            //상좌가 모두 비어있는 경우, 상으로 가야함. 
            if(x>0 && answer[x-1][y]==0 && answer[x][y+1]==0 && y+1<=n-1){
                x--;
                continue;
            }
            
            //우
            if((y+1<=n-1 && answer[x][y+1]==0)){
                y++;
                continue;
            }
            
            //하
            if((x+1<=n-1 && answer[x+1][y]==0)){
                x++;
                continue;
            }
            
            //좌
            if((y-1>=0 && answer[x][y-1]==0)){
                y--;
                continue;
            }
            
            //상
            if((x-1>=0 && answer[x-1][y]==0)){
                x--;
                continue;
            }
        }
       
        return answer;
    }
}