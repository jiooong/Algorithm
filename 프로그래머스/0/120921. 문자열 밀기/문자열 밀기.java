import java.util.*;

class Solution {
    public int solution(String A, String B) {
        int answer = 0;
        Deque<String> dq = new LinkedList<>();
        String[] arr = A.split("");
        for(int i=0; i<A.length(); i++){
           dq.addLast(arr[i]); 
        }
    
        int count = 0;
        while(!A.equals(B)){
            String last = dq.pollLast();
            dq.addFirst(last);
            A = String.join("", dq);
            answer+=1;
            count+=1;
            if(count == A.length() && !A.equals(B)){
                answer = -1;
                break;
            }
   
        }

        return answer;
    }
}