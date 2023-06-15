class Solution {
    public int solution(int n) {
        //3진법으로 변환
        String three = Integer.toString(n,3);
        //앞뒤 반전
        String reverse = "";
        for(int i=0; i<three.length(); i++){
            reverse += three.charAt(three.length()-1-i);
        }
        //10진법으로 리턴
        return Integer.parseInt(reverse, 3);
    }
}