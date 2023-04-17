class Solution {
    public long solution(int a, int b) {
        long sum = 0;
        if(a<b){
            while(a<=b){
                sum+=a;
                a++;
            }
            return sum;
        }
        if(b<a){
            while(b<=a){
                sum+=b;
                b++;
            }
            return sum;
        }
        return a;
    }
}