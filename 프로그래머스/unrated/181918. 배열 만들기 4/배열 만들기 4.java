import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        Stack<Integer> stack = new Stack<>();
        int i = 0;
       
        while(arr.length > i){
        
            if(stack.empty()){
                stack.push(arr[i]);
                i+=1;
            }else{
                if(stack.peek() < arr[i]){
                    stack.push(arr[i]);
                    i+=1;
                }else{
                    stack.pop();
                }
            }
            if(arr.length <= i){
                break;
            }
        }

        int[] answer = new int[stack.size()];
        for(int j=stack.size()-1; j>=0; j--){
            answer[j] = stack.pop();
        }
        return answer;
    }
}