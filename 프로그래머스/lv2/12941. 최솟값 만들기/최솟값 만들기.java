import java.util.*;

class Solution
{
    public int solution(int []A, int []B)
    {
        //큰 수와 작은 수를 곱하였을 때 최솟값
        Arrays.sort(A);
        Arrays.sort(B);
        
        int answer = 0;
        
        for(int i=0; i<A.length; i++){
            answer += A[i]*B[B.length-1-i];
        }
        
        return answer;
    }
}