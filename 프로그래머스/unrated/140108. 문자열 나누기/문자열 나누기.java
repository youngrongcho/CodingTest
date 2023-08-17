class Solution {
    public int solution(String s) {
        int answer = 0;
        int count = 1;
        int len = s.length();
        
        while(s.length()>0){
            if(s.length()==1){
                return ++answer;
            }
            
            char x = s.charAt(0);
            s = s.substring(1);
            
            for(int j=0; j<s.length(); j++){
                if(s.charAt(j)==x){
                    count++;
                } else if(s.charAt(j)!=x) {
                    count--;
                }
                
                if(count==0){
                    s = s.substring(j+1);
                    answer++;
                    count = 1;
                    break;
                }
            }
            
            if(count!=1){
                return ++answer;
            }
        }
        return answer;
    }
}