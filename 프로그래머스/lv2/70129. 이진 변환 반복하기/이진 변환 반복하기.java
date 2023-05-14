class Solution {
    public int[] solution(String s) {
        int zero = 0;
        int change = 0;
        //문자열이 1이 될 때까지 반복
        while(s.length() > 1){
            //0 제거, 제거된 0 개수 카운트
            zero += s.length() - s.replaceAll("0", "").length();
            //0이 제거된 문자열의 길이를 이진 변환, 이진 변환 횟수 카운트
            s = Integer.toBinaryString(s.replaceAll("0", "").length());
            change++;
        }
        
        //[이진 변환 횟수, 제거한 0 개수] 리턴 
        return new int[]{change, zero};
    }
}