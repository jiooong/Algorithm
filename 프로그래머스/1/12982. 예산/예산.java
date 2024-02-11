import java.util.*;
class Solution {
    public int solution(int[] d, int budget) {
        int answer = 0;
        Arrays.sort(d);
        int num = 0;
        for(int i : d){
            int newnum = num += i;
            if(newnum <= budget){
                answer += 1;
            }
        }
        return answer;
    }
}