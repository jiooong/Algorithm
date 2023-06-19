import java.util.*;

public class Solution {
    public int solution(int n) {
        int answer = 0;
        
        
        String num = Integer.toString(n);
        String[] numArr = num.split("");
      
        for(String a : numArr){
            answer+=Integer.parseInt(a);
        }
    


        return answer;
    }
}