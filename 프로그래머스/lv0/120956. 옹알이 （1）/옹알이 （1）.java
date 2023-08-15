class Solution {
    public int solution(String[] babbling) {
        int answer = 0;
        int count = 0;
        
        String[] possible = {"aya", "ye", "woo", "ma"};
        
        for(int i=0; i<babbling.length; i++){
            for(int j=0; j<possible.length; j++){
                if(babbling[i].contains(possible[j])){
                    count += possible[j].length();
                }
            }
            if(count == babbling[i].length()) {
                answer++;
            }
            count = 0;
        }
        
        return answer;
    }
}