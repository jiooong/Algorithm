import java.util.*;

class Solution {
    public int solution(int[] scoville, int K) {
        int answer = 0;
        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();
        for(int i=0; i<scoville.length; i++){
            priorityQueue.add(scoville[i]);
        }
        
        while(priorityQueue.peek()<K){
            
        if(priorityQueue.size()==1){
             break;
         }

        int num = priorityQueue.poll();
        int num2 = priorityQueue.poll();
        
        int addNum = num + (num2 * 2);
        
        priorityQueue.add(addNum);
        answer++;
            
       } 
         if(priorityQueue.peek()<K){
             answer = -1;
         }
        return answer;
    }
}