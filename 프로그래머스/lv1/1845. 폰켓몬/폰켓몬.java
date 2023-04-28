import java.util.*;
import java.util.stream.Collectors;

class Solution {
    public int solution(int[] nums) {
        //절반을 선택할 때, 가장 많은 종류를 가져올 때의 종류 수 
    List<Integer> list = Arrays.stream(nums)
        .boxed().distinct().collect(Collectors.toList());
    return list.size()<nums.length/2? list.size() : nums.length/2;    
    }
}