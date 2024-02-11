import java.util.*;

class Solution {
    public int[] solution(String s) {
        int count = 0;
        int zero = 0;
        while(!s.equals("1")){ // 1이 될때까지 반복한다
            int zero2 = 0;
            for(int i=0; i<s.length(); i++){
                if(s.charAt(i) == '0'){ // 0 이면 zero 카운트하기
                    zero2 += 1;
                }
            }
            count += 1; // 반복횟수 카운트
            zero += zero2;
            //길이 - zero 이진수 변환
            int num = s.length() - zero2;
            Stack<Integer> st = new Stack<>();
            s = "";
            while(num>0){
                st.push(num % 2);
                num = num/2;
            }
            while(!st.isEmpty()){
                s += st.pop() + "";
            }
        }
    
        int[] answer = {count, zero};
        return answer;
    }
}