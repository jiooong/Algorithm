import java.util.*;
class Solution {
    public int[] solution(int[] arr) {
        int[] answer = new int[arr.length-1];
        int minnum = arr[0];
        if(arr.length==1){
            return new int[]{-1};
        }else{
            for(int i=1; i<arr.length; i++){
                if(arr[i]<minnum){
                    minnum = arr[i];
                }
            }
        }

        int idx = 0; 
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] != minnum) {
                answer[idx++] = arr[i];
            }
        }
        return answer;
    }
}