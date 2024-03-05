import java.util.*;

class Solution {
    public String solution(String s) {
        String[] arr = s.split("");
        String answer = "";
        
        
        int cnt = 0;
        for(String i : arr){
            String str = i;
            if(i.equals(" ")){
                cnt=0;
            }else if(cnt%2==0){
                str = i.toUpperCase();
                cnt++;
            }else if(cnt%2==1){
                str = i.toLowerCase();
                cnt++;
            }
               answer += str;
        }
        

        return answer;
      }
}
