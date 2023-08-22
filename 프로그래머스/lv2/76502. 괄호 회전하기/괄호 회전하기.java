class Solution {
    public int solution(String s) {
        String[] arr = {"\\[\\]", "\\{\\}", "\\(\\)"};
        
        int answer = 0;
        String temp = "";
        
        for(int i=0; i<s.length(); i++){
            temp = s;
            while(true){
                int len = temp.length();
                for(int j=0; j<arr.length; j++){
                    temp = temp.replaceAll(arr[j], "");
                }
                if(len==temp.length()){
                    break;
                }
            }
            
            if(temp.length()==0){
                answer++;
            }
            
            s = s.substring(1) + s.charAt(0);
        }
        
        return answer;
    }
}