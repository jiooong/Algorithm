import java.util.*;

class Solution {
    public long solution(long n) {
        
        String ans = "";
        String num = n+"";
        String[] arr = num.split("");
        Arrays.sort(arr, Collections.reverseOrder());
        
        for(String i:arr){
            ans +=i;
        }
        long answer = Long.parseLong(ans);
        return answer;
    }
}