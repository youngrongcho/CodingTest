class Solution {
    public String solution(String s) {
        //주어진 문자열을 공백 기준으로 구분하기
        String[] arr = s.split(" ");
        
        for(int i=0; i<arr.length; i++){
            //공백 문자인 경우 거르기
            if(arr[i].equals("")||arr[i].equals("\\s")) continue;
            
            //문자를 첫 글자와 나머지로 나누기
            String head = arr[i].substring(0,1);
            String tail = arr[i].substring(1);

            //head는 모두 대문자로, tail은 모두 소문자로 변경
            if(!head.equals("[0-9]")) head = head.toUpperCase();
            tail = tail.toLowerCase();
            
            //head+tail 
            arr[i] = head + tail;
        }
        
        String answer = String.join(" ", arr); 
        //마지막 문자가 공백인 경우를 고려해야함. 
        if(s.endsWith(" ")) answer+=" ";
        
        return answer;
    }
}