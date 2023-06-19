import java.util.*;

class Solution{
	public static int[] solution(int[] arr) {     
        
       Stack<Integer> stack = new Stack<>();
        stack.push(arr[0]);
        
    
        for(int i=1; i<arr.length; i++){
            if(arr[i]!=stack.peek()){
                stack.push(arr[i]);
            }
        }
        
        int[] answer = new int[stack.size()];
        
        for(int j=stack.size()-1; j>=0; j--){
            answer[j] = stack.pop();
        }
        
      
        return answer;
     }
}