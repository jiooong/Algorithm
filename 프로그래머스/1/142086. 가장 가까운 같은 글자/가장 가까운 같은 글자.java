import java.util.*;

class Solution {
    public int[] solution(String s) {
        int[] answer = new int[s.length()];
        HashMap<Character, Integer> hm = new HashMap<>();
        for(int i=0; i<s.length(); i++){
            if(hm.containsKey(s.charAt(i))){
                answer[i] = i-hm.get(s.charAt(i));
                hm.put(s.charAt(i),i);
            }else{
                hm.put(s.charAt(i),i);
                answer[i] = -1;
            }
        }
        return answer;
    }
}