import java.util.*;
class Solution {
    public int[] solution(String[] intStrs, int k, int s, int l) {
        List<Integer> arr = new ArrayList<>();
        
        for(String str : intStrs){
            int num = Integer.parseInt(str.substring(s,s+l));
            if(num > k){
                arr.add(num);
            }
        }

       int[] answer = arr.stream().mapToInt(i->i).toArray();
       return answer;
        
    }
}