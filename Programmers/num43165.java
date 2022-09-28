import java.util.*;
class Solution {
    int answer =0;
    public int solution(int[] numbers, int target) {
        dfs(numbers, target, 0, 0);
        return answer;          
    }  
    
    public void dfs(int[] numbers, int target, int num,int index){
        if(numbers.length==index){
            if(num==target)
            answer++;
            return;
        }
        dfs(numbers, target,  num+numbers[index],index+1);
        dfs(numbers, target,  num-numbers[index],index+1);    
    }
            
}
