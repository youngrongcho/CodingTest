class Solution {
    public String solution(int[] food) {
        //0번을 제외한, 각 인덱스는 짝수개를 사용하며 대칭으로 배치 
        String answer = "";
        //앞의 절반 구하기
        for(int i=1; i<food.length; i++){
            int count = food[i]/2;
            answer += String.valueOf(i).repeat(count);
        }
        //0 더하고, 앞의 절반을 뒤집어서 붙이기
        StringBuffer sb = new StringBuffer(answer);
        String reverse = sb.reverse().toString();
        
        return answer+"0"+reverse;
    }
}