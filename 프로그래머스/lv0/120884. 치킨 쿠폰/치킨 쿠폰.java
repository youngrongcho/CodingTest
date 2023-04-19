class Solution {
    public int solution(int chicken) {
        int service = chicken/10;
        int coupon = chicken%10 + service; 
        
        while(coupon >= 10){
            service += coupon/10;
            coupon = coupon%10+coupon/10;
        }
        
        return service;
    }
}