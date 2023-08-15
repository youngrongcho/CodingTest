class Solution {
    public int solution(int[][] dots) {
        int answer = 0;
        
        //'네 개의 점을 두 개씩 이었을 때' -> 무조건 직선 2개가 동시에 나와야 함
        
        double a = (double) (dots[0][1]-dots[1][1])/(dots[0][0]-dots[1][0]);
        double b = (double) (dots[2][1]-dots[3][1])/(dots[2][0]-dots[3][0]);
        
        double c = (double) (dots[0][1]-dots[2][1])/(dots[0][0]-dots[2][0]);
        double d = (double) (dots[3][1]-dots[1][1])/(dots[3][0]-dots[1][0]);
        
        double e = (double) (dots[0][1]-dots[3][1])/(dots[0][0]-dots[3][0]);
        double f = (double) (dots[2][1]-dots[1][1])/(dots[2][0]-dots[1][0]);
        
        return a==b || c==d || e==f ? 1 : 0;
    }
}