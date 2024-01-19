import java.util.*;

class Solution {
    public long[] solution(long n) {
        String[] arr = (n+"").split("");

        long[] answer = new long[arr.length];
        int num = 0;
        for(int i=arr.length-1; i>=0; i--){
             answer[num] = Long.parseLong(arr[i]);
            num++;

        }
        return answer;
    }
}