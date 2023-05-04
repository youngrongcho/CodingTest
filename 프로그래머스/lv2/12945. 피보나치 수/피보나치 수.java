class Solution {
    public int solution(int n) {
        double[] table = new double[n+1];
        table[1] = 1;
        
        for(int i=2; i<=n; i++){
            table[i] = (table[i-1] + table[i-2]) % 1234567;
        }
        
        return (int) table[n];
    }
}