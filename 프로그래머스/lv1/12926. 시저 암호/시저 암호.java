class Solution {
    public String solution(String s, int n) {
        String answer = "";
        
        for(int i=0; i<s.length(); i++){
            char c = s.charAt(i);
            int num = (int) c;
            if(c==' ') answer += "";
            if(num >= 97 && num <= 122) {
                if(num + n > 122) {
                    num = num - 26 + n;
                } else {
                    num += n;
                }
            } else if(num >= 65 && num <= 90) {
                if(num + n > 90) {
                    num = num - 26 + n;
                } else {
                    num += n;
                }
            }
            answer += (char) num;
        }
        
        System.out.println(answer);
        return answer;
    }
}