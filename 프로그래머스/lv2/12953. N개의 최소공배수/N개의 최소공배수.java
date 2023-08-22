import java.util.*;

class Solution {
    public int solution(int[] arr) {
        if(arr.length==1){
            return arr[0];
        }
        
        List<Integer> list = new ArrayList<>();
        for(int a : arr){
            list.add(a);
        }
        
        list.sort(Comparator.reverseOrder());
        
        //가장 큰 두 수의 최소공배수를 구하고, 작은 수들이 부합하는지 확인. 
        int x = list.get(0);
        int y = list.get(1);
        
        int lcm = LCM(x, y);
        list.remove(Integer.valueOf(x));
        list.remove(Integer.valueOf(y));
        
        //부합하지 않는다면 최소공배수와 부합하지 않는 수의 최소공배수를 구하기 
        while(list.size()>0){
            int num = list.get(0);
            if(lcm%num==0){
                list.remove(Integer.valueOf(num));
            } else {
                lcm = LCM(lcm, num);
                list.remove(Integer.valueOf(num));
            }
        }
        
        return lcm;
    }
    
    public static int LCM(int x, int y){
        return x*y/GCD(x,y);
    }
    
    public static int GCD(int x, int y){
        if(x%y==0){
            return y;
        }
        return GCD(y, x%y);
    }
}