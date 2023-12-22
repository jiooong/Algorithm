import java.util.*;
class Solution {
    public int[] solution(int[] num_list) {
        int[] answer = Arrays.copyOf(num_list, num_list.length + 1);
        int lastNum = num_list[num_list.length-1];
        int secNum = num_list[num_list.length-2];
        if(lastNum > secNum){
            answer[num_list.length] = lastNum - secNum;
        }else{
            answer[num_list.length] =lastNum *2;
        }
        
        return answer;
    }
}