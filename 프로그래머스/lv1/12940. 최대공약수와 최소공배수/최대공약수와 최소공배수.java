class Solution {
    public int[] solution(int n, int m) {
        int gcd = GCD(n, m);
        int lcm = n*m / gcd;
        return new int[]{gcd, lcm};
    }
    
    public int GCD(int x, int y){
        if(x%y==0) return y;
        return GCD(y, x%y);
    }
}