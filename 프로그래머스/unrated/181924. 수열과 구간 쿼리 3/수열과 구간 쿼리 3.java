import java.util.*;

class Solution {
    public int[] solution(int[] arr, int[][] queries) {
        
        int[] answer = Arrays.copyOf(arr, arr.length);
    
        for(int[] num : queries){
            int x = num[0];
            int y = num[1];
            
            int z = 0;
            
            z = answer[x];
            answer[x] = answer[y];
            answer[y] = z; 
            
        }
        
        return answer;
    }
}