import java.util.*;

class Solution {
    public int[] solution(int[] arr, int divisor) {
        List<Integer> intList = new ArrayList<Integer>();
        int answer[] ={};
        Arrays.sort(arr);
        for(int i = 0; i<arr.length; i++){
            if(arr[i] % divisor ==0 ){
                intList.add(arr[i]);
            }
        }
        
        if(intList.size() == 0){
            answer = new int[1];
            answer[0] = -1;
        } else{
            answer = new int[intList.size()];
            
            for(int i=0; i<intList.size(); i++){
                answer[i] = intList.get(i);
            }
        }
        
        return answer;
    }
}