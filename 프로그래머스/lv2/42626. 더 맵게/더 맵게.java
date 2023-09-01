import java.util.*;
// import java.util.stream.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        
        PriorityQueue<Integer> queue = new PriorityQueue<>();
        for(int s : scoville){
            if(s!=0) {
                queue.add(s);
            }
        }
        
        while(true){
            int cur = queue.peek();
            if(cur >= K){
                break;
            }
            
            if(queue.size()==1 && cur < K){
                answer = -1;
                break;
            }
            
            cur = queue.poll();
            int next = queue.poll();
            queue.add(cur + next*2);
            answer++;
        }
        
        return answer;
    }
//     static List<Integer> list;
//     public int solution(int[] scoville, int K) {
//         int answer = 0;
        
//         //스코빌 배열 -> 리스트
//         list = Arrays.stream(scoville).boxed()
//             .collect(Collectors.toList());
        
//         list.remove(Integer.valueOf(0));
//         sortList(list);
        
//         //가장 작은 스코빌 1, 2를 조합하여 새로운 음식 만들기
//         while(true){
//             if(list.get(0)>=K){
//                 break;
//             }
            
//             if(list.size()==1 && list.get(0)<K){
//                 answer = -1;
//                 break;
//             }
            
//             int small1 = list.remove(0);
//             int small2 = list.remove(0);
            
//             int newOne = getNewScoville(small1, small2);
//             list.add(0, newOne);
//             sortList(list);
//             answer++;
//         }
        
//         return answer;
//     }
    
//     public static int getNewScoville(int smaller, int bigger){
//         return smaller + (bigger*2);
//     }
    
//     public static void sortList(List<Integer> list){
//         int count = 0;
        
//         for(int i=0; i<list.size(); i++){
//             for(int j=0; j<list.size()-1-i; j++){
//                 if(list.get(j)>list.get(j+1)){
//                     swap(j, j+1);
//                     count++;
//                 }
//             }
//             if(count==0) {
//                 break;
//             }
//             count = 0;
//         }
//     }
    
//     public static void swap(int x, int y){
//         int temp = list.get(x);
//         list.set(x, list.get(y));
//         list.set(y, temp);
//     }
}