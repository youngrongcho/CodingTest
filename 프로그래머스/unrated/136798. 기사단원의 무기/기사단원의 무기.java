class Solution {
    public int solution(int number, int limit, int power) {
        int answer = 0;
        
        //1~number번호 까지의 기사단원의 약수 개수 구하기 -> 해당 개수의 공격력 사용 
        for(int i=1; i<=number; i++){
            int attackCount = getAttackCount(i);
            if(attackCount>limit){
                answer += power;
            } else {
                answer += attackCount;
            }
        }
        return answer;
    }
    
    public static int getAttackCount(int number){
        int count = 0;
        int num = (int) Math.sqrt(number);
        for(int i=1; i<=num; i++){
            if(number%i==0){
                count++;
            }
        }
        return Math.sqrt(number)==num ? count*2-1 :count*2;
    }
}