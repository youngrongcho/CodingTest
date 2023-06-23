class Solution {
    public int[] solution(int[] arr) {
        if(arr.length==1) return new int[]{-1};
        
        //가장 작은 수를 찾는다.
        int min = arr[0];
        for(int i=0; i<arr.length; i++){
            if(min > arr[i]){
                min = arr[i];
            }
        }
        
        //가장 작은 수를 빼고 새로운 배열 만들기
        int[] newArr = new int[arr.length-1];
        int j = 0;
        for(int i=0; i<newArr.length; i++){
            if(arr[j] != min){
                newArr[i] = arr[j];
                j++;
            }
            else if(arr[j] == min){
                j++;
                i--;
            }
        }
        
        return newArr;
    }
}