class Solution {
    public long solution(int price, long money, int count) {
        //count만큼 이용했을 때, 부족한 이용료를 구하기 
        for(int i=1; i<=count; i++){
            money -= i*price;
        }
        return money >= 0? 0 : money*(-1); 
    }
}