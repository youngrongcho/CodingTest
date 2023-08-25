import java.util.*;

class Solution {
    public int solution(int k, int m, int[] score) {
        //score.length / m 개의 상자가 생긴다. 
        int[][] boxes = new int[score.length/m][m];
        
        //각각의 상자에 점수 높은 사과부터 담는다. 
        Arrays.sort(score);
        
        int num = score.length-1;
        for(int i=0; i<boxes.length; i++){
            for(int j=0; j<m; j++){
                boxes[i][j] = score[num];
                num--;
            }
        }
        
        //각각의 상자의 점수는 최저점수*m
        //합을 구한다.
        int answer = 0;
        
         for(int[] b : boxes){
             answer += b[m-1]*m;
        }
        
        return answer;
    }
}