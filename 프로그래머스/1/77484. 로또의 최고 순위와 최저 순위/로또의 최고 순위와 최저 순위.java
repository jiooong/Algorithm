import java.util.*;
class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];
 
        int count = 0;
        int same = 0;
        
        Map<Integer, Integer> map = new HashMap<>();
        map.put(6,1);
        map.put(5,2);
        map.put(4,3);
        map.put(3,4);
        map.put(2,5);
        map.put(1,6);
        map.put(0,6);
        
        for(int i=0; i<lottos.length; i++){
            if(lottos[i] == 0){
                count++;
            }else{
             for(int j=0; j<win_nums.length; j++){
               
                    if(lottos[i]==(win_nums[j])){
                        same++;
                    
                }
            }   
            }
        }
        
        answer[0] = map.get(same + count);
        answer[1] = map.get(same);
        
        return answer;
    }  
}