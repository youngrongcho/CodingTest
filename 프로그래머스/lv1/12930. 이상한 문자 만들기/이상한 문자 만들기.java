class Solution {
    public String solution(String s) {
//         //공백 기준으로 단어 쪼개기
//         String[] arr = s.split(" ");
        
//         //각 단어를 대문자,소문자 패턴으로 변경
//         for(int i=0; i<arr.length; i++){
//             if(arr[i].equals(" ")) continue;
//             String str = arr[i];
//             arr[i] = "";
//             for(int j=0; j<str.length(); j++){
//                 if(j%2==0) {
//                     arr[i] += (str.charAt(j)+"").toUpperCase();
//                 }
//                 else {
//                     arr[i] += (str.charAt(j)+"").toLowerCase();
//                 }
//             }
//         }
        
//         //다시 합치기
//         return String.join(" ", arr);
        String answer = "";
        int j = 0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)==' '){
                answer += s.charAt(i)+"";
                j = 0;
                continue;
            }
            if(j%2==0){
                answer += (s.charAt(i)+"").toUpperCase();
                j++;
            }
            else{
                answer += (s.charAt(i)+"").toLowerCase();
                j++;
            }
        }
        return answer;
    }
}