import java.util.*;

class Solution {
    public int[] solution(String[] park, String[] routes) {
        //좌표 
        int x = 0;
        int y = 0;
        
        //공원 배열 만들기
        int[][] parkMap = new int[park.length][park[0].length()];
        
        for(int i=0; i<park.length; i++){
            for(int j=0; j<park[0].length(); j++){
                if(park[i].charAt(j)=='O'){
                    continue;
                } 
                if(park[i].charAt(j)=='X'){
                    parkMap[i][j] = 1;
                } 
                if(park[i].charAt(j)=='S') {
                    x = i;
                    y = j;
                }
            }
        }
        
        //이동하기 
        boolean check = false;
        
        for(int i=0; i<routes.length; i++){
            String[] arr = routes[i].split(" ");
            
            if(arr[0].equals("N")){
                int temp = x - Integer.parseInt(arr[1]);
                if(temp < 0 || temp >= park.length){
                    continue;
                }
                for(int j=1; j<=Integer.parseInt(arr[1]); j++){
                    if(parkMap[x-j][y]==1){
                        check = true;
                        break;
                    }
                }
                if(check){
                    check = false;
                    continue;
                }
                x = temp;
            }
            
            else if(arr[0].equals("S")){
                int temp = x + Integer.parseInt(arr[1]);
                if(temp < 0 || temp >= park.length){
                    continue;
                }
                for(int j=1; j<=Integer.parseInt(arr[1]); j++){
                    if(parkMap[x+j][y]==1){
                        check = true;
                        break;
                    }
                }
                if(check){
                    check = false;
                    continue;
                }
                x = temp;
            }
            
            else if(arr[0].equals("W")){
                int temp = y - Integer.parseInt(arr[1]);
                if(temp < 0 || temp >= park[0].length()){
                    continue;
                }
                for(int j=1; j<=Integer.parseInt(arr[1]); j++){
                    if(parkMap[x][y-j]==1){
                        check = true;
                        break;
                    }
                }
                if(check){
                    check = false;
                    continue;
                }
                y = temp;
            }
            
            else if(arr[0].equals("E")){
                int temp = y + Integer.parseInt(arr[1]);
                if(temp < 0 || temp >= park[0].length()){
                    continue;
                }
                for(int j=1; j<=Integer.parseInt(arr[1]); j++){
                    if(parkMap[x][y+j]==1){
                        check = true;
                        break;
                    }
                }
                if(check){
                    check = false;
                    continue;
                }
                y = temp;
            }
        }
        
        int[] answer = {x, y};
        
        return answer;
    }
}