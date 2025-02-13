class Solution {
    public int solution(int a, int b) {
        int answer = 0;
        String str = String.valueOf(a)+String.valueOf(b);
        
        return Integer.valueOf(str) < 2*a*b ? 2*a*b : Integer.valueOf(str);
    }
}