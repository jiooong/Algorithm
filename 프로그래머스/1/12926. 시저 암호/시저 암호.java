import java.util.*;
class Solution {
    public String solution(String s, int n) {
        String answer = "";
        for(int i=0; i<s.length(); i++){
            char ar = s.charAt(i);
            int check = ar + n;
            if(Character.isUpperCase(ar)){
                if(check>90){
                    answer += (char)(check - 26);
                }else{
                    answer += (char)check;
                }
            }else if(Character.isLowerCase(ar)){
                if(check>122){
                    answer += (char)(check - 26);
                }else{
                    answer += (char)check;
                }
            }else{
                answer += ar;
            }
            
            
        }
        return answer;
    }
}