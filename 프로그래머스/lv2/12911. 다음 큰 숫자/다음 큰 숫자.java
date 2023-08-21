class Solution {
    public int solution(int n) {
        String binary = changeToBinary(n);
        int binaryCount = countOne(binary);
        
        while(true){
            n++;
            String next = changeToBinary(n);
            if(binaryCount == countOne(next)){
                break;
            }
        }
        
        return n;
    }
    
    public static String changeToBinary(int n){
        return Integer.toBinaryString(n);
    }
    
    public static int countOne(String str){
        int count = 0;
        char[] arr = str.toCharArray();
        for(char c : arr){
            if(c=='1'){
                count++;
            }
        }
        return count;
    }
}